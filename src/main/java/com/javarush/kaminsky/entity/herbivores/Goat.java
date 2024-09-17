package com.javarush.kaminsky.entity.herbivores;

public class Goat extends Herbivore {
    public Goat(int health, int power, int speed, String view) {
        super(health, power, speed, view);
    }
    @Override
    public String getView() {
        return this.view;
    }


}
