package com.example.user.dinosaurlistapp;

/**
 * Created by user on 30/05/2018.
 */

public class Dinosaur {
    private String name;
    private double length;
    private double weight;

    public Dinosaur(String name, double length, double weight) {
        this.name = name;
        this.length = length;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public double getLength() {
        return this.length;
    }

    public double getWeight() {
        return this.weight;
    }
}
