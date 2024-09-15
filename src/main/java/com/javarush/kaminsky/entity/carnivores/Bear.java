package com.javarush.kaminsky.entity.carnivores;

import com.javarush.kaminsky.service.AppController;
import javafx.scene.control.Label;

public class Bear extends Carnivore {
    private AppController appController = AppController.getInstance();
    private String view;
    private Label cell;
    public Bear(double weight, int maxNumberInOneCell, int maxSpeedInCells, double kgsOfFoodNeeded, String view) {
        super(weight, maxNumberInOneCell, maxSpeedInCells, kgsOfFoodNeeded, view);
        this.view = view;
    }

    @Override
    public String getView() {
        return this.view;
    }

}
