package com.javarush.kaminsky.entity.carnivores;


public class Eagle extends Carnivore {
    public Eagle(int health, int power, int speed, String view) {
        super(health, power, speed, view);
    }

    @Override
    public String getView() {
        return this.view;
    }

}
