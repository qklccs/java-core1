package lr6;
import java.util.ArrayList;
public class Example1 {



        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6};
            ArrayList<Integer> evenNumbers = getEvenNumbers(arr);
            System.out.println(evenNumbers);
        }

        public static ArrayList<Integer> getEvenNumbers(int[] numbers) {
            ArrayList<Integer> evenNumbers = new ArrayList<>();
            for (int number : numbers) {
                if (number % 2 == 0) {
                    evenNumbers.add(number);
                }
            }
            return evenNumbers;
        }


}
