package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Cow");
        createObject("Cat");
        createObject("Dog");
    }

    public static Animal createObject(String className) {
        switch (className) {
            case "Cow":
                Cow cow = new Cow(2,"Molli");
                System.out.println("Cow: " + cow);
                cow.print();
                break;
            case "Cat":
                Cat cat = new Cat(3,1);
                System.out.println("Cat: " + cat);
                cat.print();
                break;
            case "Dog":
                Dog dog = new Dog(6,"Alabai");
                System.out.println("Dog: " + dog);
                dog.print();
                break;
        }
        return null;
    }
}
