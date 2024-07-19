package com.example.employeemanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String name;
    private String designation;

    @Id
    private String lanID;
    private String taskAssigned;

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getLanID() {
        return lanID;
    }

    public void setLanID(String lanID) {
        this.lanID = lanID;
    }

    public String getTaskAssigned() {
        return taskAssigned;
    }

    public void setTaskAssigned(String taskAssigned) {
        this.taskAssigned = taskAssigned;
    }
}
