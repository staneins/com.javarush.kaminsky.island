package com.javarush.kaminsky.entity.herbivores;


public class Buffalo extends Herbivore {
    public Buffalo(int health, int power, int speed, String view) {
        super(health, power, speed, view);
    }
    @Override
    public String getView() {
        return this.view;
    }
}
