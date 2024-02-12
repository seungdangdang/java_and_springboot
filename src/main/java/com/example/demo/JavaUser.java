package com.example.demo;

public class JavaUser {

    private String name;
    private int age;

    public JavaUser() {
        this.name = null;
        this.age = 0;
    }

    public JavaUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "JavaUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
