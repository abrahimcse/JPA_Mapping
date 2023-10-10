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

public class Company {

    @Id
    @GeneratedValue
    private int id;
    private String comName;
    private String comLocation;
    private int comPhone;

    @ManyToMany(targetEntity = Shop.class, cascade = CascadeType.ALL)
    @JoinTable(name = "Company_Shop",
            joinColumns = {
            @JoinColumn (name = "company_id" ,referencedColumnName = "id")
            },
            inverseJoinColumns = {
            @JoinColumn( name = "shop_id", referencedColumnName = "id")
            }
    )
    private Set<Shop> shopSet;

}
