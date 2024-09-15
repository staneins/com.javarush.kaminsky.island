package com.javarush.kaminsky;

import com.javarush.kaminsky.entity.carnivores.Wolf;
import com.javarush.kaminsky.service.AppController;
import com.javarush.kaminsky.service.IslandService;
import com.javarush.kaminsky.service.PrototypeFactory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.text.Font;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main extends Application {

    PrototypeFactory prototypeFactory = new PrototypeFactory();
    IslandService islandService;

    private static final String CSS_DATA = "data:text/css,";
    private static final String CSS = CSS_DATA + """
        .root {
           -fx-font-size: 16px;
        }
        .default {}
        .noto-color-emoji {
          -fx-font-family: "Noto Color Emoji";
        }
        .open-sans-emoji {
          -fx-font-family: "OpenSansEmoji";
        }
        .segoe-emoji {
          -fx-font-family: "Segoe UI Emoji";
        }
        .apple-color-emoji {
          -fx-font-family: "Apple Color Emoji";
        }
        """;

    @Override
    public void start(Stage stage) throws IOException {
        Font.loadFont("https://github.com/MorbZ/OpenSansEmoji/raw/master/OpenSansEmoji.ttf", 10);
        Font.loadFont("https://github.com/mrbvrz/segoe-ui/raw/master/font/seguiemj.ttf", 10);

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/island-view.fxml"));
        fxmlLoader.setController(AppController.getInstance());
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);

        scene.getStylesheets().add(CSS);
        islandService = new IslandService(prototypeFactory);
//        islandService.spawnBeings();

        ExecutorService islandThreadPool = Executors.newFixedThreadPool(6);

        stage.setScene(scene);
        stage.show();

        Runnable wolfLifeCycle = () -> {
            try {
                Wolf wolf = (Wolf) prototypeFactory.getPrototype(Wolf.class);
                islandService.putBeingOnTheCell(wolf);
                while (true) { //(wolf.isAlive)
                    wolf.move();
                    Thread.sleep(2000);
//                    if (wolf.isHungry) {
//                        wolf.eat();
//                        wolf.breed();
//                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        if (islandThreadPool.isTerminated()) {
            islandThreadPool.shutdownNow();
        }


    }

    public static void main(String[] args) {
        launch();
    }
}
