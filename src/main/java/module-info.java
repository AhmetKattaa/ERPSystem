module com.example.erpsystem {
        requires javafx.controls;
        requires javafx.fxml;
        requires java.sql;

        opens com.example.erpsystem to javafx.fxml;
        opens com.example.erpsystem.controller to javafx.fxml;
        exports com.example.erpsystem;
        exports com.example.erpsystem.controller;
        }
