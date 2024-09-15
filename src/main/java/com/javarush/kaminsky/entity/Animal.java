package com.javarush.kaminsky.entity;

public abstract class Animal extends Being implements Reproducable {
    private double weight;
    private int maxNumberInOneCell;
    private int maxSpeedInCells;
    private double kgsOfFoodNeeded;
    private String view;

    public Animal(double weight, int maxNumberInOneCell, int maxSpeedInCells, double kgsOfFoodNeeded, String view) {
        this.weight = weight;
        this.maxNumberInOneCell = maxNumberInOneCell;
        this.maxSpeedInCells = maxSpeedInCells;
        this.kgsOfFoodNeeded = kgsOfFoodNeeded;
        this.view = view;
    }

    public String getView() {
        return view;
    }

    //    public abstract void eat();
    public abstract void move();

}
