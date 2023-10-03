package com.Mehdi.interfaceAbstract;

public class Cat implements Animal{

    @Override
    public void name() {

    }

    @Override
    public void move() {
        System.out.println("Moves fast");

    }

    @Override
    public void eat() {
        System.out.println("Omom nom nom");

    }

    @Override
    public void sleep() {
        System.out.println("Sleeps 80% of the time");

    }

    @Override
    public void makeSound() {
        System.out.println("Mio mio");

    }
}
