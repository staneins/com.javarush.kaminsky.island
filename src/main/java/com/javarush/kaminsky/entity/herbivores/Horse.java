package com.javarush.kaminsky.entity.herbivores;

public class Horse extends Herbivore {
    public Horse(int health, int power, int speed, String view) {
        super(health, power, speed, view);
    }
    @Override
    public String getView() {
        return this.view;
    }

}
