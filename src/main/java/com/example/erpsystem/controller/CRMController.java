package com.example.erpsystem.controller;

import com.example.erpsystem.util.DatabaseConnection;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.input.*;
import javafx.scene.layout.VBox;
import javafx.scene.Parent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CRMController {

    @FXML
    private VBox newColumn;

    @FXML
    private VBox qualifiedColumn;

    @FXML
    private VBox propositionColumn;

    @FXML
    private VBox negotiationColumn;

    @FXML
    private VBox wonColumn;

    private VBox sourceColumn;

    @FXML
    public void initialize() {
        setupDragOver(newColumn);
        setupDragOver(qualifiedColumn);
        setupDragOver(propositionColumn);
        setupDragOver(negotiationColumn);
        setupDragOver(wonColumn);

        loadLeads();
    }

    private void loadLeads() {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM crm_leads";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                String title = rs.getString("title");
                String status = rs.getString("status");
                String customer = "Müşteri"; // Şimdilik dummy, sonra veritabanına ekleriz
                String price = "$1000";       // Şimdilik dummy, sonra veritabanına ekleriz

                VBox column = getColumnByStatus(status);
                if (column != null) {
                    Node card = createLeadCard(title, customer, price, rs.getInt("id"));
                    column.getChildren().add(card);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private VBox getColumnByStatus(String status) {
        return switch (status) {
            case "New" -> newColumn;
            case "Qualified" -> qualifiedColumn;
            case "Proposition" -> propositionColumn;
            case "Negotiation" -> negotiationColumn;
            case "Won" -> wonColumn;
            default -> null;
        };
    }

    private Node createLeadCard(String title, String customer, String price, int leadId) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/erpsystem/view/lead-card.fxml"));
            Parent card = loader.load();
            LeadCardController controller = loader.getController();
            controller.setLeadInfo(title, customer, price);

            card.setUserData(leadId); // Kartın içine veritabanı ID'sini saklıyoruz

            setupDragDetected(card);
            setupDragDropped(card);

            return card;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private void setupDragDetected(Node card) {
        card.setOnDragDetected(event -> {
            Dragboard db = card.startDragAndDrop(TransferMode.MOVE);
            ClipboardContent content = new ClipboardContent();
            content.putString(""); // Veri aktarmıyoruz, sadece sürükleme yapıyoruz
            db.setContent(content);
            sourceColumn = (VBox) card.getParent();
            event.consume();
        });
    }

    private void setupDragOver(VBox column) {
        column.setOnDragOver(event -> {
            if (event.getGestureSource() != column && event.getDragboard().hasString()) {
                event.acceptTransferModes(TransferMode.MOVE);
            }
            event.consume();
        });
    }

    private void setupDragDropped(Node card) {
        card.setOnDragDropped(event -> {
            Dragboard db = event.getDragboard();
            if (db.hasString()) {
                VBox targetColumn = (VBox) card.getParent();
                Node draggedCard = (Node) event.getGestureSource();
                sourceColumn.getChildren().remove(draggedCard);
                targetColumn.getChildren().add(draggedCard);

                // Veritabanında status güncelle
                updateLeadStatus((int) draggedCard.getUserData(), getStatusByColumn(targetColumn));
                event.setDropCompleted(true);
            }
            event.consume();
        });
    }

    private String getStatusByColumn(VBox column) {
        if (column == newColumn) return "New";
        if (column == qualifiedColumn) return "Qualified";
        if (column == propositionColumn) return "Proposition";
        if (column == negotiationColumn) return "Negotiation";
        if (column == wonColumn) return "Won";
        return "";
    }

    private void updateLeadStatus(int leadId, String newStatus) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "UPDATE crm_leads SET status = ? WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, newStatus);
            pstmt.setInt(2, leadId);
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
