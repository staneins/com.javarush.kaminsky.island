package com.javarush.kaminsky.service;

import com.javarush.kaminsky.entity.Being;
import com.javarush.kaminsky.entity.carnivores.*;
import org.jetbrains.annotations.NotNull;

public class IslandService {
    private final PrototypeFactory prototypeFactory;
    private final Island island;

    public IslandService(PrototypeFactory prototypeFactory, Island island) {
        this.prototypeFactory = prototypeFactory;
        this.island = island;
    }

    public void putBeingOnTheCell(@NotNull Being being, int x, int y) {
        Cell cell = island.getCell(x, y);
        if (cell != null) {
            cell.addBeing(being);
            System.out.println("Поместили " + being.getView() + " на клетку: " + x + "," + y);
        } else {
            System.out.println("Клетка " + x + "," + y + " не найдена!");
        }
    }

    public void removeBeingFromCell(@NotNull Being being, int x, int y) {
        Cell cell = island.getCell(x, y);
        if (cell != null) {
            cell.removeBeing(being);
            System.out.println("Удалили " + being.getView() + " с клетки: " + x + "," + y);
        } else {
            System.out.println("Клетка " + x + "," + y + " не найдена!");
        }
    }


    public void spawnBeings() {
        putBeingOnTheCell(prototypeFactory.getPrototype(Wolf.class), getRandomCellIndex(), getRandomCellIndex());
        putBeingOnTheCell(prototypeFactory.getPrototype(Bear.class), getRandomCellIndex(), getRandomCellIndex());
    }

    private int getRandomCellIndex() {
        return (int) (Math.random() * island.getCell(0, 0).getView().length());
    }

    public void displayIsland() {
        System.out.println("Текущее состояние острова:");
        island.printIsland();
    }
}
