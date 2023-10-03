package com.bojken.interfaceAbstract.demo.models;

// Abstract - Inheritance (arv)
// As a Standard, methods are 'PUBLIC'
public interface Animal {

    //TODO - Give relevant names
    // TODO - Implement Inheritance
    // TODO - SUPER VIKTIGT: private vis/mod

    // Abstract Method
    // As a Standart, methods are 'PUBLIC'

     void move();
     void eat();
     void sleep();
     void makeSound();

    // Default
     default void typeOfAnimal(String typeOfAnimal) {
         System.out.println(typeOfAnimal);
     }
}
