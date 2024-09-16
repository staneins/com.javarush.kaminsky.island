package com.javarush.kaminsky.entity.herbivores;

import com.javarush.kaminsky.service.AppController;
import javafx.scene.control.Label;

public class Horse extends Herbivore {
    private AppController appController = AppController.getInstance();
    private String view;
    private Label cell;
    public Horse(double weight, int maxNumberInOneCell, int maxSpeedInCells, double kgsOfFoodNeeded, String view) {
        super(weight, maxNumberInOneCell, maxSpeedInCells, kgsOfFoodNeeded, view);
        this.view = view;
    }
    @Override
    public String getView() {
        return this.view;
    }

    @Override
    public void move() {
        this.cell.setText("");
        Label nextCell = appController.getLabel(appController.chooseMovementDirection(appController.getLabelIndex(this.cell)));
        nextCell.setText(view);
    }
}
