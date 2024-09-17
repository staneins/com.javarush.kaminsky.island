package com.javarush.kaminsky.entity.carnivores;


public class Snake extends Carnivore {
    public Snake(int health, int power, int speed, String view) {
        super(health, power, speed, view);
    }

    @Override
    public String getView() {
        return this.view;
    }

}
