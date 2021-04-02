package com.company;

public class Dog extends Animal implements Printable {
    private String breed;

    public Dog(int quantity, String breed) {
        super(quantity);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void print() {
        System.out.println("Breed: " + breed + "\nQuantity: " + getQuantity());
    }
}
