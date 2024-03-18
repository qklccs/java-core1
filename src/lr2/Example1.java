package lr2;
import java.util.Random;
public class Example1 {

        public static void main(String[] args) {
            int n = 10;
            int[] arr = generateRandomArray(n);
            printArray(arr);
            findMinValueAndIndex(arr);
        }

        public static int[] generateRandomArray(int n) {
            Random random = new Random();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = random.nextInt(100);
            }
            return arr;
        }

        public static void printArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public static void findMinValueAndIndex(int[] arr) {
            int minValue = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < minValue) {
                    minValue = arr[i];
                }
            }
            System.out.println("Минимальное значение равно：" + minValue);
            System.out.print("Минимальное значение индекса составляет：");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == minValue) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
}


