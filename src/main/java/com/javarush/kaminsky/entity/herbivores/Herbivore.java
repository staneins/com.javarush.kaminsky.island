package com.javarush.kaminsky.entity.herbivores;

import com.javarush.kaminsky.entity.Animal;

public abstract class Herbivore extends Animal {
    public Herbivore(int health, int quantity, int speed, double food, String view) {
        super(health, quantity, speed, food, view);
    }

}
