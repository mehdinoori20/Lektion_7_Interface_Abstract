package com.Mehdi.interfaceAbstract;

// Abstract Class - marked by keyword: abstract
// TODO - Test Visibility mod
abstract class AAnimal {


    // Includes abstract, excludes body: {}
    protected abstract void eat();

    // Ordinary method - excludes abstracts
    public void makeSound() {
        System.out.println("some random animal noise");


    }
}
