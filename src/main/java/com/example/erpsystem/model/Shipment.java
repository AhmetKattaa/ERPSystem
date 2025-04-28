package com.example.erpsystem.model;

import java.util.Date;

public class Shipment {
    private int id;
    private String trackingNumber;
    private Date carrier;
    private CRMLead status;
    private Date shipDate;
    private Date deliveryDate;
    private SalesPerson recipient;
    private User createdBy;

    // Constructor
    public Shipment(int id, String trackingNumber, Date carrier, CRMLead status, Date shipDate, Date deliveryDate, SalesPerson recipient, User createdBy) {
        this.id = id;
        this.trackingNumber = trackingNumber;
        this.carrier = carrier;
        this.status = status;
        this.shipDate = shipDate;
        this.deliveryDate = deliveryDate;
        this.recipient = recipient;
        this.createdBy = createdBy;
    }

    // Default constructor
    public Shipment() {
    }

    // Getter ve Setter metodları
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public Date getCarrier() {
        return carrier;
    }

    public void setCarrier(Date carrier) {
        this.carrier = carrier;
    }

    public CRMLead getStatus() {
        return status;
    }

    public void setStatus(CRMLead status) {
        this.status = status;
    }

    public Date getShipDate() {
        return shipDate;
    }

    public void setShipDate(Date shipDate) {
        this.shipDate = shipDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public SalesPerson getRecipient() {
        return recipient;
    }

    public void setRecipient(SalesPerson recipient) {
        this.recipient = recipient;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    // UML'de belirtilen Metotlar
    public void updateStatus(CRMLead newStatus) {
        this.status = newStatus;
    }

    public Date calculateEstimatedDelivery() {
        // Şu an basit bir örnek: Sevkiyat tarihine 5 gün ekleyelim
        if (shipDate != null) {
            long estimatedMillis = shipDate.getTime() + (5L * 24 * 60 * 60 * 1000);
            return new Date(estimatedMillis);
        }
        return null;
    }

    public void assignToRecipient(SalesPerson person) {
        this.recipient = person;
    }
}
