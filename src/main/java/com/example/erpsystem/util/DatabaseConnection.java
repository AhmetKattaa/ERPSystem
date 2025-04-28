package com.example.erpsystem.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:8889/erp_system"; // MAMP default port
    private static final String USER = "root"; // MAMP default user
    private static final String PASSWORD = "12345"; // MAMP default password

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
