package com.javarush.kaminsky.entity.carnivores;

import com.javarush.kaminsky.entity.Animal;

public abstract class Carnivore extends Animal {
    public Carnivore(double health, int quantity, int speed, double food, String view) {
        super(health, quantity, speed, food, view);
    }

}
