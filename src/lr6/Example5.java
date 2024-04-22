package lr6;
import java.util.ArrayList;
import java.util.List;
public class Example5 {



        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("apple");
            list.add("banana");
            list.add("cherry");
            list.add("date");
            list.add("elderberry");
            List<String> result = getStringsContainingSubstring(list, "an");
            System.out.println(result);
        }

        public static List<String> getStringsContainingSubstring(List<String> strings, String substring) {
            List<String> filteredStrings = new ArrayList<>();
            for (String string : strings) {
                if (string.contains(substring)) {
                    filteredStrings.add(string);
                }
            }
            return filteredStrings;
        }


}
