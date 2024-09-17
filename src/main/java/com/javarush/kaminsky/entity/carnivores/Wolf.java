package com.javarush.kaminsky.entity.carnivores;

import com.javarush.kaminsky.service.Cell;
import com.javarush.kaminsky.service.IslandService;
import com.javarush.kaminsky.service.PrototypeFactory;

public class Wolf extends Carnivore {

    private Cell currentCell;

    public Wolf(double weight, int maxNumberInOneCell, int maxSpeedInCells, double kgsOfFoodNeeded, String view) {
        super(weight, maxNumberInOneCell, maxSpeedInCells, kgsOfFoodNeeded, view);
    }

    public void move(IslandService islandService, Cell[][] grid) {
        Cell currentCell = this.getCurrentCell();

        int currentIndex = currentCell.getIndex();
        int newIndex = getRandomAdjacentIndex(currentIndex, grid);

        if (newIndex != -1) {
            int newX = newIndex / grid.length;
            int newY = newIndex % grid.length;
            islandService.moveBeing(this, currentCell.getIndex() / grid.length, currentCell.getIndex() % grid.length, newX, newY);
            this.setCurrentCell(grid[newX][newY]);
            System.out.println("Wolf moved to new cell: " + newX + "," + newY);
        } else {
            System.out.println("Wolf cannot move, no valid cells available.");
        }
    }

    private int getRandomAdjacentIndex(int currentIndex, Cell[][] grid) {
        int currentRow = currentIndex / grid.length;
        int currentCol = currentIndex % grid.length;
        Cell adjacentCell = currentCell.getRandomAdjacentCell(grid, currentRow, currentCol);
        return adjacentCell != null ? adjacentCell.getIndex() : -1;
    }

    public Cell getCurrentCell() {
        return currentCell;
    }

    public void setCurrentCell(Cell currentCell) {
        this.currentCell = currentCell;
    }

    public Wolf cloneFromPrototype() {
        PrototypeFactory prototypeFactory = new PrototypeFactory();
        return (Wolf) prototypeFactory.getPrototype(Wolf.class);
    }
}
