package com.task.JPA.Mapping.Demo.repository;

import com.task.JPA.Mapping.Demo.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<Shop,Integer> {


}
