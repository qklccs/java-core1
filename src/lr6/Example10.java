package lr6;
import java.util.ArrayList;
import java.util.List;

public class Example10 {

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6};
            int threshold = 4;
            List<Integer> result = getNumbersLessThanThreshold(arr, threshold);
            System.out.println(result);
        }

        public static List<Integer> getNumbersLessThanThreshold(int[] numbers, int threshold) {
            List<Integer> lessNumbers = new ArrayList<>();
            for (int number : numbers) {
                if (number < threshold) {
                    lessNumbers.add(number);
                }
            }
            return lessNumbers;
        }
}
