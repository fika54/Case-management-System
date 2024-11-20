package com.example.casemanagementsystem.Controller;

import com.example.casemanagementsystem.Database.DatabaseConnection;
import com.example.casemanagementsystem.Database.UserInfo;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginController {
    @FXML
    private Button goToRegister;
    @FXML
    private Label error;
    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private Button login;
    @FXML
    private Button getToRegister;


    @FXML
    public void login() throws SQLException, ClassNotFoundException {
        if(username.getText().isEmpty() || password.getText().isEmpty()){
            error.setVisible(true);
        }

        DatabaseConnection db = new DatabaseConnection();
        Connection con = db.getConnection();
        Statement stmt = con.createStatement();
        String query = "select * from users where username='"+username.getText()+"' and password='"+password.getText()+"'";
        try(ResultSet rs = stmt.executeQuery(query)){
            if (rs.next()) {
                UserInfo.Username = rs.getString("Username");
                UserInfo.Email = rs.getString("Email");
                UserInfo.Admin = rs.getBoolean("Admin");
                error.setVisible(false);
            } else {
                error.setVisible(true);
            }
        }

    }

    public Button getToRegisterBtn() {
        return goToRegister;
    }
}
