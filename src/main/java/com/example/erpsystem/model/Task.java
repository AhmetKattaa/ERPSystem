package com.example.erpsystem.model;

import java.util.Date;

public class Task {
    private int id;
    private String title;
    private String description;
    private String status;
    private Date dueDate;
    private User assignedTo;

    // Constructor
    public Task(int id, String title, String description, String status, Date dueDate, User assignedTo) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.dueDate = dueDate;
        this.assignedTo = assignedTo;
    }

    // Default constructor
    public Task() {
    }

    // Getter ve Setter metodları
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public User getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(User assignedTo) {
        this.assignedTo = assignedTo;
    }

    // UML'de belirtilen Metotlar
    public void changeStatus(String newStatus) {
        this.status = newStatus;
    }

    public void assignUser(User user) {
        this.assignedTo = user;
    }

    public void editTask(String newTitle, String newDescription) {
        this.title = newTitle;
        this.description = newDescription;
    }

    public boolean isOverDue() {
        if (dueDate == null) {
            return false;
        }
        Date today = new Date();
        return today.after(dueDate);
    }
}
