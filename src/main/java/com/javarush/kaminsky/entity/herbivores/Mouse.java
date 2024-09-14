package com.javarush.kaminsky.entity.herbivores;

public class Mouse extends Herbivore {
    private String view;
    public Mouse(double weight, int maxNumberInOneCell, int maxSpeedInCells, double kgsOfFoodNeeded, String view) {
        super(weight, maxNumberInOneCell, maxSpeedInCells, kgsOfFoodNeeded, view);
        this.view = view;
    }
}
