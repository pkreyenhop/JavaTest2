package com.peter;

/**
 * Hello world!
 */
public class Animal {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public boolean isBaby() {
        return age < 1;
    }
}
