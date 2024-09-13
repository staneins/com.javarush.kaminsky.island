package com.javarush.kaminsky.entity;

public abstract class Animal extends Being {
    private double weight;
    private int maxNumberInOneCell;
    private int maxSpeedInCells;
    private double kgsOfFoodNeeded;

    public Animal(double weight, int maxNumberInOneCell, int maxSpeedInCells, double kgsOfFoodNeeded) {
        this.weight = weight;
        this.maxNumberInOneCell = maxNumberInOneCell;
        this.maxSpeedInCells = maxSpeedInCells;
        this.kgsOfFoodNeeded = kgsOfFoodNeeded;
    }

//    public abstract void eat();
//    public abstract void breed();
//    public abstract void move();

}
