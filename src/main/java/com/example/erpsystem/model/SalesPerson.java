package com.example.erpsystem.model;

public class SalesPerson {
    private double salary;
    private String region;

    // Constructor
    public SalesPerson(double salary, String region) {
        this.salary = salary;
        this.region = region;
    }

    // Default constructor
    public SalesPerson() {
    }

    // Getter ve Setter metodları
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
