package lr3;

public class Example5 {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }


    public static int fact(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fact(n - 2) + fact(n - 1);
        }
    }
}


//    fact(5)
//|-- fact(3)
//        |   |-- fact(1)
//        |   |   |-- 1
//        |   |-- fact(2)
//        |       |-- fact(0)
//        |       |   |-- 0
//        |       |-- fact(1)
//        |           |-- 1
//        |-- fact(4)
//        |-- fact(2)
//        |   |-- fact(0)
//        |   |   |-- 0
//        |   |-- fact(1)
//        |       |-- 1
//        |-- fact(3)
//        |-- fact(1)
//        |   |-- 1
//        |-- fact(2)
//        |-- fact(0)
//        |   |-- 0
//        |-- fact(1)
//        |-- 1
