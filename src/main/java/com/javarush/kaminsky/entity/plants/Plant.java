package com.javarush.kaminsky.entity.plants;

import com.javarush.kaminsky.entity.Being;

public class Plant extends Being {

    public Plant(int health, int quantity, int speed, double food, String view) {
        super(health, quantity, speed, food, view);
    }

    @Override
    public String getView() {
        return this.view;
    }

}
