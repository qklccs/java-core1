package lr4;

public class Example12 {

    public static void m(String str, double chisel) {
        if (str == null) {
            throw new IllegalArgumentException("Строка введена неверно");
        }
        if (chisel > 0.001) {
            throw new IllegalArgumentException("Неверное число");
        }
    }

    public static void main(String[] args) {
        m(null, 0.000001);
    }

}
