package com.javarush.kaminsky.entity.carnivores;

public class Snake extends Carnivore {
    private String view;
    public Snake(double weight, int maxNumberInOneCell, int maxSpeedInCells, double kgsOfFoodNeeded, String view) {
        super(weight, maxNumberInOneCell, maxSpeedInCells, kgsOfFoodNeeded, view);
        this.view = view;
    }
}
