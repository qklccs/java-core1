package lr1;
import java.util.Scanner;

public class Exatple15 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Пожалуйста, введите первое число: ");
            int num1 = scanner.nextInt();
            System.out.println("Пожалуйста, введите второе число: ");
            int num2 = scanner.nextInt();
            int sum = num1 + num2;
            int difference = num1 - num2;
            System.out.println("Сумма двух чисел:" + sum);
            System.out.println("Разница между двумя числами:" + difference);
        }
    }



