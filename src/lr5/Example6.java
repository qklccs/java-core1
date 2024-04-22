package lr5;
import java.util.concurrent.*;

public class Example6 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        Example6 ArraySum = null;
        int sum = ArraySum.sumArrayElements(arr);
        System.out.println("Сумма элементов массива равна：" + sum);
    }

    public static int sumArrayElements(int[] arr) throws InterruptedException, ExecutionException {
            int cores = Runtime.getRuntime().availableProcessors();
            ExecutorService executor = Executors.newFixedThreadPool(cores);
            Future<Integer>[] futures = new Future[cores];

            int chunkSize = arr.length / cores;
            for (int i = 0; i < cores; i++) {
                int start = i * chunkSize;
                int end = (i == cores - 1) ? arr.length : start + chunkSize;
                futures[i] = executor.submit(new SumTask(arr, start, end));
            }

            int sum = 0;
            for (Future<Integer> future : futures) {
                sum += future.get();
            }

            executor.shutdown();
            return sum;
        }

        static class SumTask implements Callable<Integer> {
            private final int[] arr;
            private final int start;
            private final int end;

            public SumTask(int[] arr, int start, int end) {
                this.arr = arr;
                this.start = start;
                this.end = end;
            }

            @Override
            public Integer call() {
                int sum = 0;
                for (int i = start; i < end; i++) {
                    sum += arr[i];
                }
                return sum;
            }
        }


}
