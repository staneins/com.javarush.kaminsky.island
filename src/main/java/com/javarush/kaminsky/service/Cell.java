package com.javarush.kaminsky.service;

import com.javarush.kaminsky.entity.Being;
import javafx.scene.control.Label;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cell {
    private int index;
    private Label label;
    private List<Being> beings;

    public Cell(int index, Label label) {
        this.index = index;
        this.label = label;
        this.beings = new ArrayList<>();
        clearCell();
    }

    public int getIndex() {
        return index;
    }

    public Label getLabel() {
        return label;
    }

    public void addBeing(Being being) {
        beings.add(being);
        updateCell();
    }

    public void removeBeing(Being being) {
        beings.remove(being);
        updateCell();
    }

    public boolean isEmpty() {
        return beings.isEmpty();
    }

    public List<Being> getBeings() {
        return beings;
    }

    public void clearCell() {
        beings.clear();
        updateCell();
    }

    public void updateCell() {
        if (beings.isEmpty()) {
            label.setText("    ");
        } else {
            label.setText("Животные: " + beings.size());
        }
    }

    public Cell getRandomAdjacentCell(Cell[][] grid, int currentRow, int currentCol) {
        List<Cell> adjacentCells = new ArrayList<>();

        if (currentRow > 0) adjacentCells.add(grid[currentRow - 1][currentCol]);
        if (currentRow < grid.length - 1) adjacentCells.add(grid[currentRow + 1][currentCol]);
        if (currentCol > 0) adjacentCells.add(grid[currentRow][currentCol - 1]);
        if (currentCol < grid[0].length - 1) adjacentCells.add(grid[currentRow][currentCol + 1]);

        return adjacentCells.get(new Random().nextInt(adjacentCells.size()));
    }

    public boolean canMoveHere() {
        return beings.size() < 5;
    }
}
