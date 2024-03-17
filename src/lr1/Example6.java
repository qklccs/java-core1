package lr1;

import java.util.Scanner;

public class Example6 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Пожалуйста, введите фамилию：");
            String a = scanner.nextLine();
            System.out.println("Пожалуйста, введите имя：");
            String b = scanner.nextLine();
            System.out.println("Пожалуйста, введите имя отца：");
            String c = scanner.nextLine();
            System.out.println("Hello " + a + "." + b + "." + c + ".");
        }
    }


