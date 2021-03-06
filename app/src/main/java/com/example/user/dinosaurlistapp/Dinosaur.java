package com.example.user.dinosaurlistapp;

import java.io.Serializable;

/**
 * Created by user on 30/05/2018.
 */

public class Dinosaur implements Serializable {
    private String name;
    private Double length;
    private Double weight;
    private int image;

    public Dinosaur(String name, Double length, Double weight) {
        this.name = name;
        this.length = length;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public Double getLength() {
        return this.length;
    }

    public Double getWeight() {
        return this.weight;
    }

}
