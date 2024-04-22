package lr5;
import java.util.concurrent.*;

public class Example5 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int[] arr = {1, 5, 3, 7, 2, 8, 4, 6};
        int maxElement = MaxElementFinder.findMaxElement(arr);
        System.out.println("Самым крупным элементом является:： " + maxElement);
    }

    public static class MaxElementFinder {

        public static int findMaxElement(int[] arr) throws InterruptedException, ExecutionException {
            int cores = Runtime.getRuntime().availableProcessors();
            ExecutorService executor = Executors.newFixedThreadPool(cores);
            Future<Integer>[] futures = new Future[cores];

            int chunkSize = arr.length / cores;
            for (int i = 0; i < cores; i++) {
                int start = i * chunkSize;
                int end = (i == cores - 1) ? arr.length : start + chunkSize;
                futures[i] = executor.submit(new FindMaxTask(arr, start, end));
            }

            int maxElement = Integer.MIN_VALUE;
            for (Future<Integer> future : futures) {
                try {
                    maxElement = Math.max(maxElement, future.get());
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }

            executor.shutdown();
            return maxElement;
        }

        static class FindMaxTask implements Callable<Integer> {
            private final int[] arr;
            private final int start;
            private final int end;

            public FindMaxTask(int[] arr, int start, int end) {
                this.arr = arr;
                this.start = start;
                this.end = end;
            }

            @Override
            public Integer call() {
                int maxElement = Integer.MIN_VALUE;
                for (int i = start; i < end; i++) {
                    maxElement = Math.max(maxElement, arr[i]);
                }
                return maxElement;
            }
        }
    }
}