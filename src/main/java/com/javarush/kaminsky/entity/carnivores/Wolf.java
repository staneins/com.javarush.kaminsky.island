package com.javarush.kaminsky.entity.carnivores;

import com.javarush.kaminsky.service.AppController;
import javafx.scene.control.Label;

public class Wolf extends Carnivore {
    private AppController appController = AppController.getInstance();
    private String view;
    private Label cell;
    public Wolf(double weight, int maxNumberInOneCell, int maxSpeedInCells, double kgsOfFoodNeeded, String view) {
        super(weight, maxNumberInOneCell, maxSpeedInCells, kgsOfFoodNeeded, view);
        this.view = view;
    }

    @Override
    public String getView() {
        return this.view;
    }

    @Override
    public void setCell(Label cell) {
        this.cell = cell;
    }

    @Override
    public void move() {
        this.cell.setText(this.cell.getText().replace(view, "    ").trim());
        Label nextCell = appController.getLabel(appController.chooseMovementDirection(appController.getLabelIndex(this.cell)));
        nextCell.setText(view);
        System.out.println("Moving to the " + appController.getLabelIndex(nextCell));
    }
}
