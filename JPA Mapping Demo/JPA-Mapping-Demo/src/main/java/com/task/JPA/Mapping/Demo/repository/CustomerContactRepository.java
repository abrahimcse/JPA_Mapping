package com.task.JPA.Mapping.Demo.repository;

import com.task.JPA.Mapping.Demo.entity.CustomerContact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerContactRepository extends JpaRepository<CustomerContact, Integer> {
}
