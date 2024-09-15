package com.javarush.kaminsky.entity.carnivores;

import com.javarush.kaminsky.entity.Animal;

public abstract class Carnivore extends Animal {
    public Carnivore(double weight, int maxNumberInOneCell, int maxSpeedInCells, double kgsOfFoodNeeded, String view) {
        super(weight, maxNumberInOneCell, maxSpeedInCells, kgsOfFoodNeeded, view);
    }
}
