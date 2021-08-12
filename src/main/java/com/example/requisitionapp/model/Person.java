package com.example.requisitionapp.model;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Set;

@Entity
public class Person extends BaseEntity{

    private String phoneNumber;

    @OneToMany(mappedBy = "person")
    private Set<Requisition> requisitionList;

    public Person() {
    }

    public Person(String phoneNumber, Set<Requisition> requisitionList) {
        this.phoneNumber = phoneNumber;
        this.requisitionList = requisitionList;
    }


}
