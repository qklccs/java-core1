package lr2;

public class Example6 {
    public interface Shape {
        double calculateArea();
        double calculatePerimeter();
    }
    public static class Circle implements Shape {
        private double radius;
        public Circle(double radius) {
            this.radius = radius;
        }
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }
    public static class Square implements Shape {
        private double sideLength;

        public Square(double sideLength) {
            this.sideLength = sideLength;
        }
        public double calculateArea() {
            return sideLength * sideLength;
        }
        public double calculatePerimeter() {
            return 4 * sideLength;
        }
    }
    public static class Triangle implements Shape {
        private double a, b, c;

        public Triangle(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        public double calculateArea() {
            double s = (a + b + c) / 2;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }
        public double calculatePerimeter() {
            return a + b + c;
        }
    }
    public static class Main {
        public static void main(String[] args) {
            Shape circle = new Circle(5);
            System.out.println("Площадь круга： " + circle.calculateArea());
            System.out.println("Длина окружности： " + circle.calculatePerimeter());

            Shape square = new Square(4);
            System.out.println("Площадь площади： " + square.calculateArea());
            System.out.println("Длина окружности квадрата： " + square.calculatePerimeter());

            Shape triangle = new Triangle(3, 4, 5);
            System.out.println("Площадь треугольника： " + triangle.calculateArea());
            System.out.println("Периметр треугольника： " + triangle.calculatePerimeter());
        }
    }

}
