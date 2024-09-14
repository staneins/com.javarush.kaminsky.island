package com.javarush.kaminsky.entity.carnivores;

public class Wolf extends Carnivore {
    private String view;
    public Wolf(double weight, int maxNumberInOneCell, int maxSpeedInCells, double kgsOfFoodNeeded, String view) {
        super(weight, maxNumberInOneCell, maxSpeedInCells, kgsOfFoodNeeded, view);
        this.view = view;
    }
}
