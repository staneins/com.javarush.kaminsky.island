package com.javarush.kaminsky.entity;

import javafx.scene.control.Label;

public abstract class Being {
    public abstract String getView();
    public abstract Label getCell();
    public abstract void setCell(Label cell);
}
