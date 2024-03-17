package lr1;
import java.util.Scanner;

public class Example12 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Пожалуйста, введите свой возраст：");
            int age = scanner.nextInt();
            int currentYear = java.time.Year.now().getValue();
            int birthYear = currentYear - age;
            System.out.println("Ваш год рождения：" + birthYear);
        }
    }


