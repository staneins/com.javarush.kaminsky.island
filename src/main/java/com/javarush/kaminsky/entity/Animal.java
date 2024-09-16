package com.javarush.kaminsky.entity;

import com.javarush.kaminsky.service.AppController;
import javafx.scene.control.Label;

public abstract class Animal extends Being implements Reproducable {
    private double weight;
    private int maxNumberInOneCell;
    private int maxSpeedInCells;
    private double kgsOfFoodNeeded;
    private String view;
    private Label cell;
    private AppController appController = AppController.getInstance();

    public Animal(double weight, int maxNumberInOneCell, int maxSpeedInCells, double kgsOfFoodNeeded, String view) {
        this.weight = weight;
        this.maxNumberInOneCell = maxNumberInOneCell;
        this.maxSpeedInCells = maxSpeedInCells;
        this.kgsOfFoodNeeded = kgsOfFoodNeeded;
        this.view = view;
    }

    public abstract void move();

    //    public abstract void eat();

}
