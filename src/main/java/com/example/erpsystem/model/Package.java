package com.example.erpsystem.model;

public class Package {
    private int id;
    private double weight;
    private String dimensions;
    private String contentDescription;
    private Shipment shipment;

    // Constructor
    public Package(int id, double weight, String dimensions, String contentDescription, Shipment shipment) {
        this.id = id;
        this.weight = weight;
        this.dimensions = dimensions;
        this.contentDescription = contentDescription;
        this.shipment = shipment;
    }

    // Default constructor
    public Package() {
    }

    // Getter ve Setter metodları
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getContentDescription() {
        return contentDescription;
    }

    public void setContentDescription(String contentDescription) {
        this.contentDescription = contentDescription;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    // UML'de belirtilen Metotlar
    public String calculateShippingCost() {
        // Şimdilik sadece basit bir örnek: ağırlığa göre sabit bir çarpan
        double cost = weight * 5.0; // 5 birim/kilo gibi
        return cost + " USD";
    }

    public void updateWeight(double newWeight) {
        this.weight = newWeight;
    }
}
