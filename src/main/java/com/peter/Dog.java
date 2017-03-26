package com.peter;

/**
 * Created by peterkreyenhop on 26/03/17.
 */
public class Dog extends Animal {
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    private String colour;

    public boolean isBaby() {
        return this.getAge() < 2;
    }

    public Dog(String colour, int age) {
        this.colour = colour;
        this.setAge(age);
    }
}
