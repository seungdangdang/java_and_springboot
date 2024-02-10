package chapter2.ch12;

public class Person {

    String name;
    int age;

    public Person() {
//         int num = 1; -> ERROR
//         name = "이름없음"; -> ERROR
        this("이름없음", 1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showPerson() {
        System.out.println(name + ", " + age);
    }

    public Person getPerson() {
        return this;
    }
}
