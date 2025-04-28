package com.example.erpsystem.model;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private int id;
    private String name;
    private String industry;
    private String phone;

    private List<CRMLead> leads;  // Company'nin birden fazla CRMLead'i olabilir

    // Constructor
    public Company(int id, String name, String industry, String phone) {
        this.id = id;
        this.name = name;
        this.industry = industry;
        this.phone = phone;
        this.leads = new ArrayList<>();
    }

    // Default constructor
    public Company() {
        this.leads = new ArrayList<>();
    }

    // Getter ve Setter metodları
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<CRMLead> getLeads() {
        return leads;
    }

    // UML'de belirtilen Metotlar
    public void addLead(CRMLead lead) {
        leads.add(lead);
    }

    public List<CRMLead> getLeadsList() {
        return new ArrayList<>(leads);
    }

    public void updateInfo(String name, String industry, String phone) {
        this.name = name;
        this.industry = industry;
        this.phone = phone;
    }
}
