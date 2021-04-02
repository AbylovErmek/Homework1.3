package com.company;

public class Cat extends Animal implements Printable {
    private int age;

    public Cat(int quantity, int age) {
        super(quantity);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void print() {
        System.out.println("Age: " + age + "\nQuantity: " + getQuantity());
    }
}
