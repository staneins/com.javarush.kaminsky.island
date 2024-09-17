package com.javarush.kaminsky.entity.carnivores;


public class Fox extends Carnivore {
    public Fox(int health, int power, int speed, String view) {
        super(health, power, speed, view);
    }

    @Override
    public String getView() {
        return this.view;
    }

}
