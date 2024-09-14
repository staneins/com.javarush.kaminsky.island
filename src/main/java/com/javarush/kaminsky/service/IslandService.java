package com.javarush.kaminsky.service;

import com.javarush.kaminsky.entity.Being;
import com.javarush.kaminsky.entity.carnivores.*;
import com.javarush.kaminsky.entity.herbivores.*;
import com.javarush.kaminsky.entity.plants.Plant;
import org.jetbrains.annotations.NotNull;

public class IslandService {
    private final AppController appController;
    private final PrototypeFactory prototypeFactory;

    public IslandService(PrototypeFactory prototypeFactory, AppController appController) {
        this.prototypeFactory = prototypeFactory;
        this.appController = appController;
    }

    public void putBeingOnTheCell(@NotNull Being being) {
        int randomIndex = (int)(Math.random()*100) + 1;
        appController.getLabel(randomIndex).setText(String.valueOf(being.getView()));
    }

    public void spawnBeings() {
        putBeingOnTheCell(prototypeFactory.getPrototype(Wolf.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Wolf.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Bear.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Eagle.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Eagle.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Fox.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Fox.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Snake.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Snake.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Snake.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Boar.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Boar.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Deer.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Deer.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Buffalo.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Buffalo.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Caterpillar.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Caterpillar.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Caterpillar.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Duck.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Duck.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Goat.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Goat.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Hare.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Hare.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Horse.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Horse.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Mouse.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Mouse.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Mouse.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Sheep.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Sheep.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Plant.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Plant.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Plant.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Plant.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Plant.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Plant.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Plant.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Plant.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Plant.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Plant.class));
        putBeingOnTheCell(prototypeFactory.getPrototype(Plant.class));
    }


}
