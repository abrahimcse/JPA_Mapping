package com.task.JPA.Mapping.Demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.*;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Shop {

    @Id
    @GeneratedValue
    private int id;
    private String shopName;
    private String shopLocation;
    private int shopPhone;

    @ManyToMany(mappedBy = "shopSet" ,fetch = FetchType.LAZY)
    private Set<Company> companySet;

}
