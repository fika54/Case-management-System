package com.example.casemanagementsystem.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private final Connection connection;

    public DatabaseConnection() throws ClassNotFoundException, SQLException {
        //connects to the database hosted on my computer
        String db = "CaseManagement";
        String db_pass = "newPass123";
        String db_user = "newUser";
        DriverManager.setLoginTimeout(5);
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/" + db, db_user, db_pass
        );
    }


    public Connection getConnection() throws SQLException {
        //returns the connection
        return connection;
    }
}
