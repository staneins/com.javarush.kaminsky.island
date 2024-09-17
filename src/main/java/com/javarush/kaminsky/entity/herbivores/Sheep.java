package com.javarush.kaminsky.entity.herbivores;

public class Sheep extends Herbivore {
    public Sheep(int health, int power, int speed, String view) {
        super(health, power, speed, view);
    }
    @Override
    public String getView() {
        return this.view;
    }

}
