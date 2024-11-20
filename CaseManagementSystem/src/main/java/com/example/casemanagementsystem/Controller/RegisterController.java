package com.example.casemanagementsystem.Controller;

import com.example.casemanagementsystem.Database.DatabaseConnection;
import com.example.casemanagementsystem.Model.User;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterController {
    @FXML
    private TextField Username;
    @FXML
    private TextField Password;
    @FXML
    private TextField Email;

    @FXML
    private Label error;
    @FXML
    private Button goToLoginButton;
    @FXML
    private Button RegisterButton;



    @FXML
    public void Register() throws SQLException, ClassNotFoundException {
        //stores a users inputted data into a database and then goes to the login page
        if (Username.getText().isEmpty() || Password.getText().isEmpty() || Email.getText().isEmpty()) {
            error.setText("Please fill all the fields");
            error.setVisible(true);
            return;
        }
        DatabaseConnection db = new DatabaseConnection();
        Connection con = db.getConnection();
        User user = new User(Username.getText(), Email.getText(), Password.getText());

            Statement statement = con.createStatement();
            String Query = "insert into users values ('" + user.getUsername() + "','" + user.getEmail() + "','" + user.getPassword() + "', false);";
            try {
                statement.executeUpdate(Query);
                error.setVisible(false);
            } catch (SQLException e) {
                error.setText("User already exists");
                error.setVisible(true);
            }


    }


    public Button getToLoginBtn() {
        //functionality to go to the login page
        return goToLoginButton;
    }

    public Button getRegisterBtn() {
        return RegisterButton;
    }
}
