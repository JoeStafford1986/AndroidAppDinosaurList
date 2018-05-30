package com.example.user.dinosaurlistapp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DinosaurListTest {

    @Test
    public void canGetDinosaurList() {
        DinosaurList dinosaurList = new DinosaurList();
        assertEquals(11, dinosaurList.getList().size());
    }
}
