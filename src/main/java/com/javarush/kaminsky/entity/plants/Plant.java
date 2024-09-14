package com.javarush.kaminsky.entity.plants;

import com.javarush.kaminsky.entity.Being;

public class Plant extends Being {
    private double weight;
    private int maxNumberInOneCell;
    private double kgsOfFoodNeeded;
    private String view;
    public Plant(double weight, int maxNumberInOneCell, int maxSpeedInCells, double kgsOfFoodNeeded, String view) {
        this.weight = weight;
        this.maxNumberInOneCell = maxNumberInOneCell;
        this.kgsOfFoodNeeded = kgsOfFoodNeeded;
        this.view = view;
    }


    @Override
    public String getView() {
        return view;
    }
}
