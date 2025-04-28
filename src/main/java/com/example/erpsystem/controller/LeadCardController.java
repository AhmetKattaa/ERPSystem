package com.example.erpsystem.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class LeadCardController {

    @FXML
    private Label titleLabel;

    @FXML
    private Label customerLabel;

    @FXML
    private Label priceLabel;

    public void setLeadInfo(String title, String customer, String price) {
        titleLabel.setText(title);
        customerLabel.setText(customer);
        priceLabel.setText(price);
    }
}
