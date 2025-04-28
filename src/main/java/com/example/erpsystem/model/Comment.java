package com.example.erpsystem.model;

import java.util.Date;

public class Comment {
    private int id;
    private String content;
    private Date createdDate;
    private Task task;

    // Constructor
    public Comment(int id, String content, Date createdDate, Task task) {
        this.id = id;
        this.content = content;
        this.createdDate = createdDate;
        this.task = task;
    }

    // Default constructor
    public Comment() {
    }

    // Getter ve Setter metodları
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    // UML'de belirtilen Metotlar
    public void editContent(String newContent) {
        if (newContent != null && !newContent.isEmpty()) {
            this.content = newContent;
        }
    }

    public Date getCreatedDateInfo() {
        return createdDate;
    }
}
