package com.example.user.dinosaurlistapp;

import java.io.Serializable;

/**
 * Created by user on 30/05/2018.
 */

public class Dinosaur implements Serializable {
    private String name;
    private Double length;
    private Double weight;
    private Integer image;

    public Dinosaur(String name, Double length, Double weight, Integer image) {
        this.name = name;
        this.length = length;
        this.weight = weight;
        this.image = image;
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

    public Integer getImage() {
        return this.image;
    }
}
