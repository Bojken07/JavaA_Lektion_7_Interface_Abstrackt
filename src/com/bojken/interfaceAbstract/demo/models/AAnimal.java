package com.bojken.interfaceAbstract.demo.models;

// Abstract Class - marked by keyord: abstract
// Can inherit from both: Interface & Abstract Classes
// TODO - Test visibility modifier
public abstract class AAnimal {

    //  Includes abstract, excludes body; {}
    public abstract void eat();

    // Ordinary method - excludes abstract
    public void makeSound() {
        System.out.println("some random animal noise");

    }
}
