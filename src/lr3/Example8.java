package lr3;

public class Example8 {
    public  static  void m(int x) {
        System.out.println("x=" + x);
        if ((2 * x + 1) < 20){
            m(x * x + 1);
        }
    }

    public static void main(String[] args) {
        m(1);
    }
}