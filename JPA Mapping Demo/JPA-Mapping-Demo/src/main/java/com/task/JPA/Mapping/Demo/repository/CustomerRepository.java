package com.task.JPA.Mapping.Demo.repository;

import com.task.JPA.Mapping.Demo.dto.OrderResponse;
import com.task.JPA.Mapping.Demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    @Query("SELECT new com.task.JPA.Mapping.Demo.dto.OrderResponse (c.name , p.productName) FROM Customer c JOIN c.products p") //select package name.class name
    public List<OrderResponse> getJoinInformation();
}
