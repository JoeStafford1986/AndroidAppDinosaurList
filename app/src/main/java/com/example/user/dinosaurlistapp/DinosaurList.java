package com.example.user.dinosaurlistapp;

import java.util.ArrayList;
import java.util.BitSet;

/**
 * Created by user on 30/05/2018.
 */

public class DinosaurList {
    private ArrayList<Dinosaur> list;

    public DinosaurList() {
        list = new ArrayList<>();
        list.add(new Dinosaur("Allosaurus", 12.0, 3.0, 0));
        list.add(new Dinosaur("Ankylosaurus", 10.0, 5.0, 1));
        list.add(new Dinosaur("Apatosaurus", 23.0, 25.0, 2));
        list.add(new Dinosaur("Brachiosaurus", 25.0, 40.0, 3));
        list.add(new Dinosaur("Carnotaurus", 9.0, 1.5, 4));
        list.add(new Dinosaur("Diplodocus", 25.0, 20.0, 5));
        list.add(new Dinosaur("Giganotosaurus", 16.0, 8.0, 6));
        list.add(new Dinosaur("Megalosaurus", 9.0, 1.0, 7));
        list.add(new Dinosaur("Ornithomimus", 3.5, 0.5, 8));
        list.add(new Dinosaur("Parasaurolophus", 10.0, 3.5, 9));
        list.add(new Dinosaur("Spinosaurus", 15.0, 23.0, 10));
    }

    public ArrayList<Dinosaur> getList() {
        return list;
    }
}
