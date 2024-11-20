package com.example.casemanagementsystem.Model;

public class Case {
    private int id;
    private String caseName;
    private String description;
    private String status;

    public Case(int id, String caseName, String description) {
        this.id = id;
        this.caseName = caseName;
        this.description = description;
        this.status = "Pending";
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCaseName() {
        return caseName;
    }
    public void setCaseName(String caseName) {
        this.caseName = caseName;
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
}
