package lr1;

import java.util.Scanner;

public class Example7 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Пожалуйста, введите свое имя：");
            String name = scanner.nextLine();
            System.out.println("Пожалуйста, введите свой возраст：");
            int age = scanner.nextInt();
            System.out.println("твое имя：" + name + "，возраст：" + age + "Лет.");
        }
    }



