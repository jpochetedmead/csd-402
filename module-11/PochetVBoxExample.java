/*
Julio Pochet Edmead  
05/11/2025
Module 11: JavaFX Basics – VBox Example  

Purpose: Demonstrates how to use JavaFX VBox to arrange components vertically with spacing.
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PochetVBoxExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create UI elements
        Label greetingLabel = new Label("Welcome to the VBox Layout!");
        Button optionButton1 = new Button("Option 1");
        Button optionButton2 = new Button("Option 2");

        // VBox with spacing of 15 between components
        VBox layout = new VBox(15);
        layout.getChildren().addAll(greetingLabel, optionButton1, optionButton2);

        // Set up the scene and stage
        Scene scene = new Scene(layout, 300, 150);
        primaryStage.setTitle("VBox Layout Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}