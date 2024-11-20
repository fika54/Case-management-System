package com.example.casemanagementsystem.Model;

import com.example.casemanagementsystem.Database.DatabaseConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class User {
    private String Username;
    private String Email;
    private String Role;
    private String Password;
    private int Id;
    private Connection connection;

    public User(String username, String email, String password) throws SQLException {
        Username = username;
        Email = email;
        Role = "User";
        Password = password;
    }

    public String getUsername() {
        return Username;
    }
    public void setUsername(String username) {
        Username = username;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public String getRole() {
        return Role;
    }
    public void setRole(String role) {
        Role = role;
    }
    public String getPassword() {return Password;}
    public void setPassword(String password) {Password = password;}



}
