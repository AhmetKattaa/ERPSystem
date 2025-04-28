package com.example.erpsystem.model;

import java.util.Date;

public class Note {
    private int id;
    private String content;
    private Date createDate;
    private CRMLead lead;

    // Constructor
    public Note(int id, String content, Date createDate, CRMLead lead) {
        this.id = id;
        this.content = content;
        this.createDate = createDate;
        this.lead = lead;
    }

    // Default constructor
    public Note() {
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public CRMLead getLead() {
        return lead;
    }

    public void setLead(CRMLead lead) {
        this.lead = lead;
    }

    // UML'de belirtilen Metotlar
    public boolean editContent(String newContent) {
        if (newContent != null && !newContent.isEmpty()) {
            this.content = newContent;
            return true;
        }
        return false;
    }

    public Date getCreatedDate() {
        return createDate;
    }
}
