package com.example.erpsystem.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CRMLead {
    private int id;
    private String title;
    private String status;
    private Date createDate;
    private User user;
    private Company company;
    private List<Note> notes;

    // Constructor
    public CRMLead(int id, String title, String status, Date createDate, User user, Company company) {
        this.id = id;
        this.title = title;
        this.status = status;
        this.createDate = createDate;
        this.user = user;
        this.company = company;
        this.notes = new ArrayList<>();
    }

    // Default constructor
    public CRMLead() {
        this.notes = new ArrayList<>();
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Note> getNotes() {
        return notes;
    }

    // UML'de belirtilen Metotlar
    public String changeState(String newStatus) {
        this.status = newStatus;
        return this.status;
    }

    public void addNote(Note note) {
        notes.add(note);
    }

    public List<Note> getNotesList() {
        return new ArrayList<>(notes);
    }

    public void assignTo(User user) {
        this.user = user;
    }
}
