package com.example.requisitionapp.model;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Requisition extends BaseEntity {
    private String firstName;
    private String lastName;
    private String fathersName;
    private Boolean isActive;
    private String passportNumber;

    private String monthlyIncome;
    private String email;

    @ManyToOne
    @JoinColumn(name = "requisition_id")
    private Person person;

    public Requisition() {
    }

    public Requisition(Person person, String firstName, String lastName, String fathersName, Boolean isActive, String passportNumber, String monthlyIncome, String email) {
        this.person = person;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fathersName = fathersName;
        this.isActive = isActive;
        this.passportNumber = passportNumber;
        this.monthlyIncome = monthlyIncome;
        this.email = email;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(String monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
