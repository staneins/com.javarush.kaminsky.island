package com.javarush.kaminsky.service;

import com.javarush.kaminsky.entity.Being;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class AppController {

    private static AppController instance;
    private final IslandService islandService;

    @FXML
    private GridPane islandGrid;

    private Cell[][] cells;

    public AppController(PrototypeFactory prototypeFactory) {
        instance = this;
        this.islandService = new IslandService(prototypeFactory, cells);
    }

    public static AppController getInstance() {
        return instance;
    }

    @FXML
    public void initialize() {
        initializeGrid();
    }

    private void initializeGrid() {
        int size = 10;
        cells = new Cell[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Label label = new Label("    ");
                islandGrid.add(label, i, j);
                cells[i][j] = new Cell(i * size + j, label);
            }
        }
    }

    public Cell getCell(int x, int y) {
        return cells[x][y];
    }

    public void putBeingOnTheCell(Being being, int x, int y) {
        Cell cell = getCell(x, y);
        cell.addBeing(being);
    }

    public void removeBeingFromCell(Being being, int x, int y) {
        Cell cell = getCell(x, y);
        cell.removeBeing(being);
    }

    public int getCellIndex(Label label) {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                if (cells[i][j].getLabel() == label) {
                    return cells[i][j].getIndex();
                }
            }
        }
        return -1;
    }

    public void moveBeing(Being being, int oldX, int oldY, int newX, int newY) {
        removeBeingFromCell(being, oldX, oldY);
        putBeingOnTheCell(being, newX, newY);
    }

    public IslandService getIslandService() {
        return islandService;
    }
}
