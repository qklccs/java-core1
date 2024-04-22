package lr3;
import java.util.ArrayList;
public class Example10 {

        public static void main(String[] args) {
            int N = 10;
            ArrayList<Integer> circle = new ArrayList<>();
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

            System.out.println("剩下的人是： " + circle.get(0));
        }


}
