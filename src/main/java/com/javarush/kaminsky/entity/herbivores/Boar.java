package com.javarush.kaminsky.entity.herbivores;


public class Boar extends Herbivore {
    public Boar(int health, int quantity, int speed, double food, String view) {
        super(health, quantity, speed, food, view);
    }
    @Override
    public String getView() {
        return this.view;
    }

}
