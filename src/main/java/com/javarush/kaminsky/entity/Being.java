package com.javarush.kaminsky.entity;

import javafx.scene.control.Label;

public abstract class Being {
    private Label cell;
    private String view;


    public Label getCell() {
        return cell;
    }

    public void setCell(Label cell) {
        this.cell = cell;
    }

    public String getView() {
        return view;
    }
}
