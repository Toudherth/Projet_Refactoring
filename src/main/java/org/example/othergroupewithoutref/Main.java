package org.example.othergroupewithoutref;


public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        cat.makeSound();
        dog.fetchBall();
        cat.chaseMouse();
    }
}
