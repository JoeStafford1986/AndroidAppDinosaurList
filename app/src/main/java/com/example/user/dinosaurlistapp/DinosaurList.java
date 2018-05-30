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
        list.add(new Dinosaur("Allosaurus", 12, 3));
        list.add(new Dinosaur("Ankylosaurus", 10, 5));
        list.add(new Dinosaur("Apatosaurus", 23, 25));
        list.add(new Dinosaur("Brachiosaurus", 25, 40));
        list.add(new Dinosaur("Carnotaurus", 9, 1.5));
        list.add(new Dinosaur("Diplodocus", 25, 20));
        list.add(new Dinosaur("Giganotosaurus", 16, 8));
        list.add(new Dinosaur("Megalosaurus", 9, 1));
        list.add(new Dinosaur("Ornithomimus", 3.5, 0.5));
        list.add(new Dinosaur("Parasaurolophus", 10, 3.5));
        list.add(new Dinosaur("Spinosaurus", 15, 23));
    }

    public ArrayList<Dinosaur> getList() {
        return list;
    }
}
