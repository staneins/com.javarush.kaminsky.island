package com.javarush.kaminsky.entity.carnivores;


public class Eagle extends Carnivore {
    public Eagle(int health, int quantity, int speed, double food, String view) {
        super(health, quantity, speed, food, view);
    }

    @Override
    public String getView() {
        return this.view;
    }

}
