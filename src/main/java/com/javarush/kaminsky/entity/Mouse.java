package com.javarush.kaminsky.entity;

public class Mouse extends Herbivore {
    public Mouse(double weight, int maxNumberInOneCell, int maxSpeedInCells, double kgsOfFoodNeeded) {
        super(0.05, 500, 1, 0.01);
    }
}
