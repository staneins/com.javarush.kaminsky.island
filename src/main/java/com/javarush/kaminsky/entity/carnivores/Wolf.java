package com.javarush.kaminsky.entity.carnivores;

import com.javarush.kaminsky.service.AppController;
import javafx.scene.control.Label;

public class Wolf extends Carnivore {
    private AppController appController;
    private String view;
    private Label cell;
    public Wolf(double weight, int maxNumberInOneCell, int maxSpeedInCells, double kgsOfFoodNeeded, String view) {
        super(weight, maxNumberInOneCell, maxSpeedInCells, kgsOfFoodNeeded, view);
        this.view = view;
    }

    public Label getCell() {
        return cell;
    }

    public void setCell(Label cell) {
        this.cell = cell;
        cell.setText(view);
    }

    @Override
    public void move() {
        this.cell.setText("");
        appController.getLabel()
    }
}
