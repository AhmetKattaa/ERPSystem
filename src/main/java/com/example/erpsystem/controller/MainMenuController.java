package com.example.erpsystem.controller;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.fxml.FXML;

public class MainMenuController {

    @FXML
    protected void openCRM() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/erpsystem/view/crm-view.fxml"));
            Stage stage = new Stage();
            stage.setTitle("CRM Modülü");
            stage.setScene(new Scene(fxmlLoader.load(), 400, 400));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    protected void openToDo() {
        System.out.println("To Do Modülü açılıyor...");
    }

    @FXML
    protected void openShipping() {
        System.out.println("Shipping Modülü açılıyor...");
    }

    @FXML
    protected void openContact() {
        System.out.println("Contact Modülü açılıyor...");
    }
}
