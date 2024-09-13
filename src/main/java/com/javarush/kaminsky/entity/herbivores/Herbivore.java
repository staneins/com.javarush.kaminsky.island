package com.javarush.kaminsky.entity.herbivores;

import com.javarush.kaminsky.entity.Animal;

public abstract class Herbivore extends Animal {
    public Herbivore(double weight, int maxNumberInOneCell, int maxSpeedInCells, double kgsOfFoodNeeded) {
        super(weight, maxNumberInOneCell, maxSpeedInCells, kgsOfFoodNeeded);


        }

//    public abstract void eat();
//    public abstract void breed();
//    public abstract void move();
}

