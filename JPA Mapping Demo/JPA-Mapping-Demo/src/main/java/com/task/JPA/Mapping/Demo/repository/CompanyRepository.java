package com.task.JPA.Mapping.Demo.repository;

import com.task.JPA.Mapping.Demo.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface CompanyRepository extends JpaRepository<Company,Integer> {

//    Set<Company> findByNameContaining(String name);
}
