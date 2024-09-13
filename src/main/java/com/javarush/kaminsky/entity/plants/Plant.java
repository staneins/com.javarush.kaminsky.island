package com.javarush.kaminsky.entity.plants;

import com.javarush.kaminsky.entity.Being;

public class Plant extends Being {
    public Plant(double weight, int maxNumberInOneCell, int maxSpeedInCells, double kgsOfFoodNeeded) {
        weight = 1;
        maxNumberInOneCell = 200;
        maxSpeedInCells = 0;
        kgsOfFoodNeeded = 0;
    }
}
