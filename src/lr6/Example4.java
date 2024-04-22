package lr6;
import java.util.ArrayList;
import java.util.List;
public class Example4 {
        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            List<Integer> result = getSquaredNumbers(list);
            System.out.println(result);
        }

        public static List<Integer> getSquaredNumbers(List<Integer> numbers) {
            List<Integer> squaredNumbers = new ArrayList<>();
            for (int number : numbers) {
                squaredNumbers.add(number * number);
            }
            return squaredNumbers;
        }


}
