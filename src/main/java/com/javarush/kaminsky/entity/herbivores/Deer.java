package com.javarush.kaminsky.entity.herbivores;

public class Deer extends Herbivore {
    public Deer(int health, int quantity, int speed, double food, String view) {
        super(health, quantity, speed, food, view);
    }
    @Override
    public String getView() {
        return this.view;
    }
}
