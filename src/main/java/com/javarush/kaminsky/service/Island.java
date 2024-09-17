package com.javarush.kaminsky.service;

public class Island {
    private final Cell[][] grid;

    public Island(int size) {
        grid = new Cell[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = new Cell();
            }
        }
    }

    public Cell getCell(int x, int y) {
        return grid[x][y];
    }

    public void printIsland() {
        for (Cell[] row : grid) {
            for (Cell cell : row) {
                System.out.print(cell.getView() + " ");
            }
            System.out.println();
        }
    }
}
