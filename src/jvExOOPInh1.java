/*
 Problem 1: Write a Java program to create a class called Animal with a method
 called makeSound(). Create a subclass called Cat that overrides the
 makeSound() method to bark.
*/

class Animal {
    public void makeSound() {
        System.out.println("Meow, Meow, Meow");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Aw, Aw, Aw");
    }
}

public class jvExOOPInh1 {
    public static void main(String[] args) throws Exception {
        Cat cat = new Cat();
        cat.makeSound();
    }
}
