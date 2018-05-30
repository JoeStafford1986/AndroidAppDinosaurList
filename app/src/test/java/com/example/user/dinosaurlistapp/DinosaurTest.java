package com.example.user.dinosaurlistapp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DinosaurTest {
    Dinosaur dinosaur;

    @Before
    public void before() {
        dinosaur = new Dinosaur("Allosaurus", 12.0, 3.0, 0);
    }

    @Test
    public void canGetName() {
        assertEquals("Allosaurus", dinosaur.getName());
    }

    @Test
    public void canGetLength() {
        assertEquals(12, dinosaur.getLength(), 0.1);
    }

    @Test
    public void canGetWeight() {
        assertEquals(3, dinosaur.getWeight(), 0.1);
    }

    @Test
    public void canGetImageInt() {
        assertEquals(0, dinosaur.getImage());
    }
}
