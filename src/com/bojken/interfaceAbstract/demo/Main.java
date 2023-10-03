package com.bojken.interfaceAbstract.demo;

import com.bojken.interfaceAbstract.demo.models.Cat;
import com.bojken.interfaceAbstract.demo.models.Dog;
import com.bojken.interfaceAbstract.demo.models.Squirrel;

public class Main {
    public static void main(String[] args) {

        // Instatiate Objects
        Cat kasper = new Cat();
        Dog fido = new Dog();
        Squirrel benny = new Squirrel();

        benny.eat();  // Abstract method - Implementation
        benny.makeSound();  // Ordinary method

        kasper.name();
        kasper.eat();
        kasper.move();
        kasper.sleep();
        kasper.makeSound();
        kasper.typeOfAnimal("Cat");

        fido.name();
        fido.eat();
        fido.move();
        fido.sleep();
        fido.makeSound();
        fido.typeOfAnimal("Dog");

    }
}
