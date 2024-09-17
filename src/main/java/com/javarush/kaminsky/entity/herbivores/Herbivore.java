package com.javarush.kaminsky.entity.herbivores;

import com.javarush.kaminsky.entity.Animal;

public abstract class Herbivore extends Animal {
    public Herbivore(int health, int power, int speed, String view) {
        super(health, power, speed, view);
    }

}
