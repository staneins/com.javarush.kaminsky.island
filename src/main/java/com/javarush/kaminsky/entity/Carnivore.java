package com.javarush.kaminsky.entity;

public abstract class Carnivore extends Animal {
    public Carnivore(double weight, int maxNumberInOneCell, int maxSpeedInCells, double kgsOfFoodNeeded) {
        super(weight, maxNumberInOneCell, maxSpeedInCells, kgsOfFoodNeeded);
    }

    public abstract void eat();
    public abstract void breed();
    public abstract void move();
}
