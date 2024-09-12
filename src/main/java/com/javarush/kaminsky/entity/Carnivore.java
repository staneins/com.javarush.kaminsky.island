package com.javarush.kaminsky.entity;

public abstract class Carnivore extends Animal {
    public Carnivore(double weight, int maxNumberInOneCell, int maxSpeedInCells, double kgsOfFoodNeeded) {
        super(weight, maxNumberInOneCell, maxSpeedInCells, kgsOfFoodNeeded);
    }
}
