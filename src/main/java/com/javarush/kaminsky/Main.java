package com.javarush.kaminsky;

import com.javarush.kaminsky.entity.carnivores.Wolf;
import com.javarush.kaminsky.service.AppController;
import com.javarush.kaminsky.service.Cell;
import com.javarush.kaminsky.service.IslandService;
import com.javarush.kaminsky.service.PrototypeFactory;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main extends Application {

    private PrototypeFactory prototypeFactory = new PrototypeFactory();
    private IslandService islandService;
    private Cell[][] grid; // Добавим клеточную сетку
    private final int gridSize = 10; // Размер сетки 10x10

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/island-view.fxml"));
        AppController appController = new AppController(prototypeFactory);
        fxmlLoader.setController(appController);
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setScene(scene);
        stage.show();

        initializeGrid();

        islandService = new IslandService(prototypeFactory, grid);

        ExecutorService islandThreadPool = Executors.newFixedThreadPool(6);

        Runnable wolfLifeCycle = () -> {
            Wolf wolf = (Wolf) prototypeFactory.getPrototype(Wolf.class);
            Platform.runLater(() -> {
                int randomCellX = getRandomCellIndex();
                int randomCellY = getRandomCellIndex();
                islandService.putBeingOnTheCell(wolf, randomCellX, randomCellY);
            });

            while (true) {
                int currentCellIndex = wolf.getCurrentCell().getIndex();
                int newCellX = getRandomCellIndex();
                int newCellY = getRandomCellIndex();

                Platform.runLater(() -> {
                    islandService.moveBeing(wolf, currentCellIndex / gridSize, currentCellIndex % gridSize, newCellX, newCellY);
                });

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        islandThreadPool.execute(wolfLifeCycle);
    }

    private void initializeGrid() {
        grid = new Cell[gridSize][gridSize];
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                grid[i][j] = new Cell(i * gridSize + j, new Label("    ")); // Инициализация клеток с метками
            }
        }
    }

    private int getRandomCellIndex() {
        return (int) (Math.random() * gridSize); 
    }

    public static void main(String[] args) {
        launch();
    }
}
