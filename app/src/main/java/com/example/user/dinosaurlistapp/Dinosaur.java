package com.example.user.dinosaurlistapp;

/**
 * Created by user on 30/05/2018.
 */

public class Dinosaur {
    private String name;
    private Double length;
    private Double weight;

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
