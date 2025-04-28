package com.example.erpsystem.model;

import java.util.ArrayList;
import java.util.List;

public class IT {
    private double salary;
    private List<User> users;

    // Constructor
    public IT(double salary) {
        this.salary = salary;
        this.users = new ArrayList<>();
    }

    // Default constructor
    public IT() {
        this.users = new ArrayList<>();
    }

    // Getter ve Setter metodları
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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
