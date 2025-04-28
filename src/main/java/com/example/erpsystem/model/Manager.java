package com.example.erpsystem.model;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private boolean license;
    private String plan;
    private List<User> users;

    // Constructor
    public Manager(boolean license, String plan) {
        this.license = license;
        this.plan = plan;
        this.users = new ArrayList<>();
    }

    // Default constructor
    public Manager() {
        this.users = new ArrayList<>();
    }

    // Getter ve Setter metodları
    public boolean hasLicense() {
        return license;
    }

    public void setLicense(boolean license) {
        this.license = license;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public List<User> getUsers() {
        return new ArrayList<>(users);
    }

    // UML'de belirtilen Metotlar
    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }
}
