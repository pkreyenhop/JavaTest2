package com.peter;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by peterkreyenhop on 26/03/17.
 */
public class DogTest extends TestCase {
    public void testIsBaby() throws Exception {
    }

    public void testGetColour() throws Exception {
    }

    public void testSetColour() throws Exception {
    }

    public void testFilterPuppies() throws Exception {

        List<Dog> myList = new ArrayList<Dog>();

        Dog dog1 = new Dog("black", 1);
        Dog dog2 = new Dog("yellow", 2);

        myList.add(dog1);
        myList.add(dog2);


        int puppyCount = 0;

        for (Dog dog : myList) {
            if (dog.isBaby()) ++puppyCount;
        }
        assertEquals(1, puppyCount);

    }

}