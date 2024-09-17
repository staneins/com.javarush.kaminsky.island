package com.javarush.kaminsky.service;

import com.javarush.kaminsky.entity.Being;
import com.javarush.kaminsky.entity.carnivores.*;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class IslandService {
    private final PrototypeFactory prototypeFactory;
    private final Cell[][] grid;

    public IslandService(PrototypeFactory prototypeFactory, Cell[][] grid) {
        this.prototypeFactory = prototypeFactory;
        this.grid = grid;
    }

    public void putBeingOnTheCell(@NotNull Being being, int x, int y) {
        Cell cell = grid[x][y];
        if (cell != null) {
            cell.addBeing(being);
            being.setCell(cell.getLabel());
            System.out.println("Placing " + being.getView() + " on cell: " + x + "," + y);
        } else {
            System.out.println("Cell " + x + "," + y + " not found!");
        }
    }

    public void spawnBeings() {
        putBeingOnTheCell(prototypeFactory.getPrototype(Wolf.class), getRandomCellIndex(), getRandomCellIndex());
        // Добавьте других существ, как в предыдущем коде
    }

    private int getRandomCellIndex() {
        return (int) (Math.random() * grid.length);
    }

    public void moveBeing(Being being, int oldX, int oldY, int newX, int newY) {
        Cell currentCell = grid[oldX][oldY];
        Cell newCell = grid[newX][newY];

        if (currentCell != null && newCell != null) {
            currentCell.removeBeing(being);
            newCell.addBeing(being);
            being.setCell(newCell.getLabel());
            System.out.println("Moved " + being.getView() + " to cell: " + newX + "," + newY);
        } else {
            System.out.println("Invalid move. Either the current or new cell was not found.");
        }
    }
}
