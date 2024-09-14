package com.javarush.kaminsky.entity.carnivores;

public class Bear extends Carnivore {
    private String view;
    public Bear(double weight, int maxNumberInOneCell, int maxSpeedInCells, double kgsOfFoodNeeded, String view) {
        super(weight, maxNumberInOneCell, maxSpeedInCells, kgsOfFoodNeeded, view);
        this.view = view;
    }

    @Override
    public String getView() {
        return this.view;
    }
}
