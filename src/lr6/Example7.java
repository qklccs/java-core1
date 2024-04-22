package lr6;
import java.util.ArrayList;
import java.util.List;
public class Example7 {


        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("apple");
            list.add("banana");
            list.add("cherry");
            list.add("date");
            list.add("elderberry");
            int length = 5;
            List<String> result = getStringsLongerThanLength(list, length);
            System.out.println(result);
        }

        public static List<String> getStringsLongerThanLength(List<String> strings, int length) {
            List<String> filteredStrings = new ArrayList<>();
            for (String string : strings) {
                if (string.length() > length) {
                    filteredStrings.add(string);
                }
            }
            return filteredStrings;
        }


}
