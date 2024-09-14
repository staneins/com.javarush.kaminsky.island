package com.javarush.kaminsky.entity.herbivores;

public class Caterpillar extends Herbivore {
    private String view;
    public Caterpillar(double weight, int maxNumberInOneCell, int maxSpeedInCells, double kgsOfFoodNeeded, String view) {
        super(weight, maxNumberInOneCell, maxSpeedInCells, kgsOfFoodNeeded, view);
        this.view = view;
    }
}
