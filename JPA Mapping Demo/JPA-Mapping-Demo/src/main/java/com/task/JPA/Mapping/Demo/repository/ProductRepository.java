package com.task.JPA.Mapping.Demo.repository;

import com.task.JPA.Mapping.Demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
