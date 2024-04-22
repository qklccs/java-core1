package lr6;
import java.util.ArrayList;
import java.util.List;
public class Example6 {

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6};
            int divisor = 2;
            List<Integer> result = getDivisibleNumbers(arr, divisor);
            System.out.println(result);
        }

        public static List<Integer> getDivisibleNumbers(int[] numbers, int divisor) {
            List<Integer> divisibleNumbers = new ArrayList<>();
            for (int number : numbers) {
                if (number % divisor == 0) {
                    divisibleNumbers.add(number);
                }
            }
            return divisibleNumbers;
        }


}
