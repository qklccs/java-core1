package lr4;
import java.util.Scanner;
public class zz1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Пожалуйста, введите длину массива：");
            int n = scanner.nextInt();
            int[] arr = new int[n];
            System.out.println("Пожалуйста, введите элементы массива：");
            for (int i = 0; i < n; i++) {
                try {
                    arr[i] = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println("Если вы допустили ошибку, пожалуйста, введите номер повторно：");
                    scanner.nextLine();
                    i--;
                }
            }
            double average = calculatePositiveAverage(arr);
            if (average != -1) {
                System.out.println("Среднее значение положительных элементов составляет：" + average);
            } else {
                System.out.println("Положительных моментов нет");
            }
        }

        public static double calculatePositiveAverage(int[] arr) {
            int sum = 0;
            int count = 0;
            for (int num : arr) {
                if (num > 0) {
                    sum += num;
                    count++;
                }
            }
            if (count == 0) {
                return -1;
            } else {
                return (double) sum / count;
            }

    }

}
