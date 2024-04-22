package lr3;
import java.util.HashMap;
import java.util.Map;
public class Example9 {
        public static void main(String[] args) {
            HashMap<Integer, String> hashMap = new HashMap<>();
            hashMap.put(1, "Hello");
            hashMap.put(2, "World");
            hashMap.put(3, "Java");
            hashMap.put(4, "Python");
            hashMap.put(5, "C++");
            hashMap.put(6, "JavaScript");
            hashMap.put(7, "Go");
            hashMap.put(8, "Swift");
            hashMap.put(9, "Kotlin");
            hashMap.put(10, "Ruby");

            for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
                if (entry.getKey() > 5) {
                    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
                } else if (entry.getKey() == 0) {
                    System.out.println(entry.getValue());
                }
            }

            int product = 1;
            for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
                if (entry.getValue().length() > 5) {
                    product *= entry.getKey();
                }
            }
            System.out.println("Произведение ключей на длину строки > 5: " + product);
        }


}
