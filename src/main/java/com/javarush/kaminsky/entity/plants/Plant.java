package com.javarush.kaminsky.entity.plants;

import com.javarush.kaminsky.entity.Being;

public class Plant extends Being {

    public Plant(int health, int power, int speed, String view) {
        super(health, power, speed, view);
    }

    @Override
    public String getView() {
        return this.view;
    }

}
