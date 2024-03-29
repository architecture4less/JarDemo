package me.jwotoole9141.jardemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        @SuppressWarnings("ConstantConditions")
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("gui.fxml"));

        primaryStage.setTitle("Jar Demo");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
