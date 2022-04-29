package com.example.marketProject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("market.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Smart Waiter!");
        stage.setScene(scene);

        stage.getIcons().add(new Image(Objects.requireNonNull(Main.class.getResourceAsStream("img/Chef.png"))));

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
