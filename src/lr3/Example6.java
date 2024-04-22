package lr3;
import java.util.Scanner;
public class Example6 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Пожалуйста, введите целое число：");
            int num = scanner.nextInt();
            System.out.println("Двоичное представление этого целого числа:" + toBinary(num));
        }

        public static String toBinary(int num) {
            if (num == 0) {
                return "0";
            } else if (num == 1) {
                return "1";
            } else {
                return toBinary(num / 2) + num % 2;
            }
        }


}
