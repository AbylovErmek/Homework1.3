package com.company;

public class Cow extends Animal implements Printable {
    private String name;

    public Cow(int quantity, String name) {
        super(quantity);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Name: " + name + "\nQuantity: " + getQuantity());
    }
}
