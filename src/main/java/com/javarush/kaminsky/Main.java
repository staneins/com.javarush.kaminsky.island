package com.javarush.kaminsky;

import com.javarush.kaminsky.service.AppController;
import com.javarush.kaminsky.service.IslandService;
import com.javarush.kaminsky.service.PrototypeFactory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.text.Font;

import java.io.IOException;

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
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);

        scene.getStylesheets().add(CSS);

        AppController appController = fxmlLoader.getController();
        islandService = new IslandService(prototypeFactory, appController);
        islandService.spawnBeings();

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
