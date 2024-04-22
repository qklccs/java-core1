package lr3;
import java.util.LinkedList;
public class Example11 {

        public static void main(String[] args) {
            int N = 10;
            LinkedList<Integer> circle = new LinkedList<>();
            for (int i = 1; i <= N; i++) {
                circle.add(i);
            }

            while (circle.size() > 1) {
                int index = 0;
                for (int i = 0; i < circle.size(); i++) {
                    if (index == circle.size()) {
                        index = 0;
                    }
                    if (i % 2 == 0) {
                        circle.remove(index);
                    }
                    index++;
                }
            }

            System.out.println("Остальные: " + circle.get(0));
        }



}
