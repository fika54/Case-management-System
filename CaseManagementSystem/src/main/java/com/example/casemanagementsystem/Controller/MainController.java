package com.example.casemanagementsystem.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {

        if (welcomeText.getText().contains("Welcome")) {
            welcomeText.setText("");
        } else {
            welcomeText.setText("Welcome to JavaFX Application!");
        }
    }
}