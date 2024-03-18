package lr2;

class Animal {
    String name;
    int age;

    void makeSound() {
        System.out.println("Животные издают звуки");
    }
}
class Dog extends Animal {
    String breed;
    String foodType;

    void bark() {
        System.out.println("Собачий лай");
    }
}

class Cat extends Animal {
    String breed;
    String foodType;

    void meow() {
        System.out.println("чайка");
    }
}

class Bird extends Animal {
    String breed;
    boolean canFly;

    void chirp() {
        System.out.println("Птичьи крики");
    }
}

 abstract class Shape {
    abstract double getArea();
    abstract double getPerimeter();
}

 class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
class Square extends Shape {
    double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }


    double getArea() {
        return sideLength * sideLength;
    }


    double getPerimeter() {
        return 4 * sideLength;
    }
}

class Triangle extends Shape {
    double base;
    double height;
    double sideA;
    double sideB;

    public Triangle(double base, double height, double sideA, double sideB) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    double getArea() {
        return 0.5 * base * height;
    }

    double getPerimeter() {
        return base + sideA + sideB;
    }
}
public class Example8 {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.name = "Большие собаки";
        dog.age = 3;
        dog.breed = "Сибирская большая собака";
        dog.foodType = "Мясные кости";
        dog.makeSound();
        dog.bark();

        Cat cat = new Cat();
        cat.name = "Котята кошек";
        cat.age = 2;
        cat.breed = "Гарфилд";
        cat.foodType = "лазанья";
        cat.makeSound();
        cat.meow();

        Bird bird = new Bird();
        bird.name = "Маленькие птички";
        bird.age = 1;
        bird.breed = "канарейка";
        bird.canFly = true;
        bird.makeSound();
        bird.chirp();

        Circle circle = new Circle(5);
        System.out.println("Площадь круга：" + circle.getArea());
        System.out.println("Длина окружности：" + circle.getPerimeter());

        Square square = new Square(4);
        System.out.println("Площадь площади：" + square.getArea());
        System.out.println("Длина окружности квадрата：" + square.getPerimeter());

        Triangle triangle = new Triangle(3, 4, 3, 4);
        System.out.println("Площадь треугольника：" + triangle.getArea());
        System.out.println("Периметр треугольника：" + triangle.getPerimeter());
    }
}
