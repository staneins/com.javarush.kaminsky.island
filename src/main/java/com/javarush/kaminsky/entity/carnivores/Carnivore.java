package com.javarush.kaminsky.entity.carnivores;

import com.javarush.kaminsky.entity.Animal;

public abstract class Carnivore extends Animal {
    public Carnivore(int health, int power, int speed, String view) {
        super(health, power, speed, view);
    }

}
