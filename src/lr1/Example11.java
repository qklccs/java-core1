package lr1;

import java.util.Scanner;

public class Example11 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Пожалуйста, введите Ваше имя：");
            String name = scanner.nextLine();
            System.out.println("Пожалуйста, введите год вашего рождения：");
            int birthYear = scanner.nextInt();
            int currentYear = java.time.Year.now().getValue();
            int age = currentYear - birthYear;
            System.out.println("Привет，" + name + "，твой возраст：" + age + "лет");
        }
    }


