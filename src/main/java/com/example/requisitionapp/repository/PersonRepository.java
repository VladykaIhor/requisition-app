package com.example.requisitionapp.repository;

import com.example.requisitionapp.model.Person;
import com.example.requisitionapp.model.Requisition;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
}
