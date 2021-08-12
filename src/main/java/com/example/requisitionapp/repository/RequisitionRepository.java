package com.example.requisitionapp.repository;

import com.example.requisitionapp.model.Requisition;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequisitionRepository extends CrudRepository<Requisition, Long> {
}
