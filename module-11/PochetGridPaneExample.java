/*
Julio Pochet Edmead  
05/11/2025
Module 11: JavaFX Basics – GridPane Example  

Purpose: Demonstrates how to use JavaFX GridPane to organize components into rows and columns.
*/

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PochetGridPaneExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create form labels and input fields
        Label nameLabel = new Label("Name:");
        TextField nameInput = new TextField();
        Label ageLabel = new Label("Age:");
        TextField ageInput = new TextField();
        Button submitButton = new Button("Submit");

        // Configure GridPane layout
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(15));
        grid.setVgap(10);
        grid.setHgap(10);

        // Add elements to grid cells
        grid.add(nameLabel, 0, 0);
        grid.add(nameInput, 1, 0);
        grid.add(ageLabel, 0, 1);
        grid.add(ageInput, 1, 1);
        grid.add(submitButton, 1, 2);

        // Set up the scene and stage
        Scene scene = new Scene(grid, 350, 200);
        primaryStage.setTitle("GridPane Layout Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}