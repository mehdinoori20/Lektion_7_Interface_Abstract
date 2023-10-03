package com.Mehdi.interfaceAbstract;
// Abstract - Inheritance (arv)
// As a standard, method are "PUBLIC"
// Uses keyword - implements



interface Animal{

        // TODO - Give relevant names
        // TODO - Implement inheritance


        // Abstract Method
        void name();
        void move();
        void  eat();
        void sleep();
        void makeSound();


        // Default??
        default void typeOfAnimal(String typeOfAnimal) {
            System.out.println(typeOfAnimal);
        }


}
