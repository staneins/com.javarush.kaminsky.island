package com.javarush.kaminsky.entity.herbivores;

public class Caterpillar extends Herbivore {
    public Caterpillar(int health, int power, int speed, String view) {
        super(health, power, speed, view);
    }
    @Override
    public String getView() {
        return this.view;
    }
}
