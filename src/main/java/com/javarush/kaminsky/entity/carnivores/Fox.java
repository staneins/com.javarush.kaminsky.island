package com.javarush.kaminsky.entity.carnivores;


public class Fox extends Carnivore {
    public Fox(int health, int quantity, int speed, double food, String view) {
        super(health, quantity, speed, food, view);
    }

    @Override
    public String getView() {
        return this.view;
    }

}
