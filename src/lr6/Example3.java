package lr6;
import java.util.ArrayList;
import java.util.List;

public class Example3 {
        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("Apple");
            list.add("banana");
            list.add("Cherry");
            list.add("date");
            list.add("Elderberry");
            List<String> result = getCapitalizedStrings(list);
            System.out.println(result);
        }

        public static List<String> getCapitalizedStrings(List<String> strings) {
            List<String> capitalizedStrings = new ArrayList<>();
            for (String string : strings) {
                if (Character.isUpperCase(string.charAt(0))) {
                    capitalizedStrings.add(string);
                }
            }
            return capitalizedStrings;
        }


}
