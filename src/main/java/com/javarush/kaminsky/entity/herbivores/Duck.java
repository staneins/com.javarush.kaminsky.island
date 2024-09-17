package com.javarush.kaminsky.entity.herbivores;

import com.javarush.kaminsky.service.AppController;
import javafx.scene.control.Label;

public class Duck extends Herbivore {
    private AppController appController = AppController.getInstance();
    private String view;
    private Label cell;
    public Duck(double weight, int maxNumberInOneCell, int maxSpeedInCells, double kgsOfFoodNeeded, String view) {
        super(weight, maxNumberInOneCell, maxSpeedInCells, kgsOfFoodNeeded, view);
        this.view = view;
    }
    @Override
    public String getView() {
        return this.view;
    }

}
