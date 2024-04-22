package lr4;
import java.util.Scanner;
public class zz2 {


        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };
            System.out.println("Пожалуйста, введите номер столбца, который вы хотите отобразить:");
            Scanner scanner = new Scanner(System.in);
            try {
                int column = scanner.nextInt();
                if (column < 0 || column >= matrix[0].length) {
                    throw new Exception("Такой колонки нет " + column);
                }
                for (int i = 0; i < matrix.length; i++) {
                    System.out.println(matrix[i][column]);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }


}
