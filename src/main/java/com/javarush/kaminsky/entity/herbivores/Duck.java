package com.javarush.kaminsky.entity.herbivores;


public class Duck extends Herbivore {
    public Duck(int health, int quantity, int speed, double food, String view) {
        super(health, quantity, speed, food, view);
    }
    @Override
    public String getView() {
        return this.view;
    }

}
