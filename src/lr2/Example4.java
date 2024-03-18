package lr2;

public class Example4 {

    public static class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
        public static void main(String[] args) {

            Person person = new Person("张三", 25, "мужчина");


            System.out.println("имя：" + person.getName());
            System.out.println("возраст：" + person.getAge());
            System.out.println("пола：" + person.getGender());


            person.setName("李四");
            person.setAge(30);
            person.setGender("женщина");

            System.out.println("имя：" + person.getName());
            System.out.println("возраст：" + person.getAge());
            System.out.println("пола：" + person.getGender());
        }

}
