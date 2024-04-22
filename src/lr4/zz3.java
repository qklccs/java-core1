package lr4;
import java.util.Scanner;
public class zz3 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Пожалуйста, введите длину массива: ");
            int n = scanner.nextInt();
            byte[] arr = new byte[n];
            System.out.println("Пожалуйста, введите элементы массива:");
            for (int i = 0; i < n; i++) {
                try {
                    arr[i] = scanner.nextByte();
                } catch (Exception e) {
                    System.out.println("Если вы допустили ошибку, пожалуйста, введите номер еще раз:");
                    scanner.nextLine();
                    i--;
                }
            }
            int sum = calculateSum(arr);
            System.out.println("Сумма байтовых элементов равна:" + sum);
        }

        public static int calculateSum(byte[] arr) {
            int sum = 0;
            for (byte b : arr) {
                sum += b;
            }
            return sum;
        }

}
