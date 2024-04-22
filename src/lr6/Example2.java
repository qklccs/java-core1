package lr6;
import java.util.ArrayList;
public class Example2 {

        public static void main(String[] args) {
            int[] arr1 = {1, 2, 3};
            int[] arr2 = {4, 5, 6};
            ArrayList<Integer> mergedArray = mergeArrays(arr1, arr2);
            System.out.println(mergedArray);
        }

        public static ArrayList<Integer> mergeArrays(int[] array1, int[] array2) {
            ArrayList<Integer> mergedArray = new ArrayList<>();
            for (int number : array1) {
                mergedArray.add(number);
            }
            for (int number : array2) {
                mergedArray.add(number);
            }
            return mergedArray;
        }


}
