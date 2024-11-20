package com.example.casemanagementsystem;

import com.example.casemanagementsystem.Controller.LoginController;
import com.example.casemanagementsystem.Controller.RegisterController;
import com.example.casemanagementsystem.Database.DatabaseConnection;
import com.example.casemanagementsystem.View.SceneManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class CaseManagementApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        StackPane rootPane = new StackPane();
        SceneManager sceneManager = new SceneManager(rootPane);

        // Load pages
        FXMLLoader loginLoader = new FXMLLoader(getClass().getResource("Login.fxml"));
        FXMLLoader registerLoader = new FXMLLoader(getClass().getResource("Register.fxml"));

        // Add pages to SceneManager
        sceneManager.addPage("Login", loginLoader.load());
        sceneManager.addPage("Register", registerLoader.load());

        // Add button actions for switching
        LoginController loginController = loginLoader.getController();
        RegisterController registerController = registerLoader.getController();

        //loginController.getToRegisterBtn().setOnAction(e -> sceneManager.switchTo("Register"));
        //registerController.getToLoginBtn().setOnAction(e -> sceneManager.switchTo("Login"));

        // Start with the home page
        sceneManager.switchTo("login");

        // Show the stage
        stage.setScene(new Scene(rootPane, 600, 400));
        stage.setTitle("Case Management System");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}