package com.javarush.kaminsky.entity;

public abstract class Animal extends Being {
    public Animal(double health, int quantity, int speed, double food, String view) {
        super(health, quantity, speed, food, view);
    }

}
