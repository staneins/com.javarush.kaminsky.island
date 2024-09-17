package com.javarush.kaminsky.entity.herbivores;

public class Hare extends Herbivore {
    public Hare(int health, int power, int speed, String view) {
        super(health, power, speed, view);
    }
    @Override
    public String getView() {
        return this.view;
    }

}
