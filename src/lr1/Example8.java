package lr1;
import java.util.Scanner;

public class Example8 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Пожалуйста, введите название текущего дня недели：");
            String dayOfWeek = scanner.nextLine();
            System.out.println("Пожалуйста, введите название месяца：");
            String month = scanner.nextLine();
            System.out.println("Введите дату (количество дней в месяце)：");
            int date = scanner.nextInt();

            System.out.println("Сегодня：" + dayOfWeek + "，" +  date + "день。" + month + "месяц");
        }
    }


