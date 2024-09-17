package com.javarush.kaminsky.entity.herbivores;

public class Hare extends Herbivore {
    public Hare(int health, int quantity, int speed, double food, String view) {
        super(health, quantity, speed, food, view);
    }
    @Override
    public String getView() {
        return this.view;
    }

}
