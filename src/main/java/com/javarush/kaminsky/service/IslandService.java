package com.javarush.kaminsky.service;

import com.javarush.kaminsky.entity.Being;
import com.javarush.kaminsky.entity.herbivores.Herbivore;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;

public class IslandService {
    private List<Being> beingsOnTheMap = new ArrayList<>();
    private PrototypeFactory prototypeFactory;
    private Island island;
    private Cell[][] grid;
    private ExecutorService threadPool; // Поле для пула потоков
    private int[][] eatingProbability = {
            {0, 0, 0, 0, 0, 10, 15, 60, 80, 60, 70, 15, 10, 40, 0, 0},
            {0, 0, 15, 0, 0, 0, 0, 20, 40, 0, 0, 0, 0, 10, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 70, 90, 0, 0, 0, 0, 60, 40, 0},
            {0, 80, 0, 0, 0, 40, 80, 80, 90, 70, 70, 50, 20, 10, 0, 0},
            {0, 0, 10, 0, 0, 0, 0, 90, 90, 0, 0, 0, 0, 80, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 90, 100},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100},
            {0, 0, 0, 0, 0, 0, 0, 0, 50, 0, 0, 0, 0, 0, 90, 100},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 90, 100},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100}
    };

    public IslandService(PrototypeFactory prototypeFactory, Island island, ExecutorService threadPool) {
        this.prototypeFactory = prototypeFactory;
        this.island = island;
        this.grid = island.getGrid();
        this.threadPool = threadPool;
    }

    public List<Being> getBeingsOnTheMap() {
        return beingsOnTheMap;
    }

    private int getBeingIndex(Being being) {
        return switch (being.getClass().getSimpleName()) {
            case "Wolf" -> 0;
            case "Snake" -> 1;
            case "Fox" -> 2;
            case "Bear" -> 3;
            case "Eagle" -> 4;
            case "Horse" -> 5;
            case "Deer" -> 6;
            case "Hare" -> 7;
            case "Mouse" -> 8;
            case "Goat" -> 9;
            case "Sheep" -> 10;
            case "Boar" -> 11;
            case "Buffalo" -> 12;
            case "Duck" -> 13;
            case "Caterpillar" -> 14;
            case "Plant" -> 15;
            default -> -1;
        };
    }

    public boolean onlyCarnivoresLeft(List<Being> beingsOnTheMap) {
        for (Being being : beingsOnTheMap) {
            if (being instanceof Herbivore) {
                return false;
            }
        }
        return true;
    }

    public void breed(Being being) {
        int randomChance = (int) (Math.random() * 4);
        if (randomChance == 0) {
                if (!threadPool.isShutdown()) {
                    Being newBeing = prototypeFactory.getPrototype(being.getClass());
                    putBeingOnTheCell(newBeing, being.getX(), being.getY());

                    Runnable lifeCycle = new BeingLifeCycle(newBeing, this, beingsOnTheMap);
                    threadPool.execute(lifeCycle);
            }
        }
    }

    public Runnable comeAlive(Being being) {
                Runnable lifeCycle = new BeingLifeCycle(being, this, beingsOnTheMap);
                putBeingOnTheCell(being, getRandomCellXCoordinate(), getRandomCellYCoordinate());
                threadPool.execute(lifeCycle);
                return lifeCycle;
    }

    public void eat(Being being) {
        Cell cell = island.getCell(being.getX(), being.getY());
        if (cell.getBeings().size() >= 1) {
            Being prey = cell.getBeings().get(0);
            int animalCellIndex = 0;
            int predatorIndex = getBeingIndex(being);
            int preyIndex = getBeingIndex(prey);

            int chance = eatingProbability[predatorIndex][preyIndex];

            if (chance > 0) {
                Random random = new Random();
                int roll = random.nextInt(100);
                if (roll < chance) {
                    being.restoreHealth(prey.getHealth());
                    removeBeingFromCell(prey, prey.getX(), prey.getY());
                    System.out.println(prey.getView() + "был съеден " + being.getView());
                } else {
                    animalCellIndex++;
                    if (animalCellIndex == (cell.getBeings().size() - 1)) {
                        return;
                    }
                    eat(being);
                }
            }
        }
    }

    public synchronized void move(Being being) {
        int randomizer = (int) (Math.random() * 4);
        int newX = being.getX();
        int newY = being.getY();

        switch (randomizer) {
            case 0:
                newY -= being.getSpeed();
                break;
            case 1:
                newY += being.getSpeed();
                break;
            case 2:
                newX -= being.getSpeed();
                break;
            case 3:
                newX += being.getSpeed();
                break;
        }

        if (newX < 0 || newX >= grid.length || newY < 0 || newY >= grid[0].length) {
            return;
        }

        removeBeingFromCell(being, being.getX(), being.getY());
        putBeingOnTheCell(being, newX, newY);
        being.setCoordinates(newX, newY);
    }

    public void getHungry(Being being) {
        being.takeDamage();
    }

    public void putBeingOnTheCell(@NotNull Being being, int x, int y) {
        Cell cell = island.getCell(x, y);
        if (cell != null) {
            cell.addBeing(being);
            being.setCoordinates(x, y);
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

    public int getRandomCellXCoordinate() {
        return (int) (Math.random() * island.getWidth());
    }

    public int getRandomCellYCoordinate() {
        return (int) (Math.random() * island.getHeight());
    }

        public void displayIsland () {
            System.out.println("Текущее состояние острова:");
            island.printIsland();
        }
    }

