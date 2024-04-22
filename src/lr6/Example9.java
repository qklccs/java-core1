package lr6;
import java.util.ArrayList;
import java.util.List;

public class Example9 {


        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6};
            int threshold = 3;
            List<Integer> result = getNumbersGreaterThanThreshold(arr, threshold);
            System.out.println(result);
        }

        public static List<Integer> getNumbersGreaterThanThreshold(int[] numbers, int threshold) {
            List<Integer> greaterNumbers = new ArrayList<>();
            for (int number : numbers) {
                if (number > threshold) {
                    greaterNumbers.add(number);
                }
            }
            return greaterNumbers;
        }


}
