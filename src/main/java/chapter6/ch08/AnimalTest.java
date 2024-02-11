package chapter6.ch08;

import java.util.ArrayList;
import java.util.List;

class Animal {

    public void move() {
        System.out.println("동물이 움직인다.");
    }
}

class Human extends Animal {
    @Override
    public void move() {
        System.out.println("사람이 두 발로 움직인다.");
    }
    public void readBook() {
        System.out.println("사람이 책을 읽는다.");
    }
}

class Tiger extends Animal {

    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }
    public void hunting() {
        System.out.println("호랑이가 사냥을 한다.");
    }
}

class Eagle extends Animal {

    @Override
    public void move() {
        System.out.println("독수리가 하늘을 난다.");
    }
    public void flying() {
        System.out.println("독수리가 하늘을 난다.");
    }
}

public class AnimalTest {

    public static void main(String[] args) {

        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        AnimalTest test = new AnimalTest();
        test.testDownCasting(animalList);
    }

    public void testDownCasting(List<Animal> list) {

        for(Animal animal : list) {
            if (animal instanceof Human human) {
                human.readBook();
            }
            else if (animal instanceof Tiger tiger) {
                tiger.hunting();
            }
            else if (animal instanceof Eagle eagle) {
                eagle.flying();
            }
        }
    }
}

