package lr3;
import java.util.Scanner;
public class Example7 {

    public static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Пожалуйста, введите длину массива：");
            int length = scanner.nextInt();
            int[] array = new int[length];
            fillArray(array, 0);
            printArray(array, 0);
        }

        public static void fillArray(int[] array, int index) {
            if (index == array.length) {
                return;
            }
            Scanner scanner = new Scanner(System.in);
            System.out.println("Пожалуйста, введите" + (index + 1) + "элементы：");
            array[index] = scanner.nextInt();
            fillArray(array, index + 1);
        }

        public static void printArray(int[] array, int index) {
            if (index == array.length) {
                return;
            }
            System.out.println( (index + 1) + "Этот элемент：" + array[index]);
            printArray(array, index + 1);
        }
    }

}
