package com.task.JPA.Mapping.Demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerContact {

    @Id
    private int id;
    private Long phone;

    @OneToOne(targetEntity = Customer.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "c_fk" , referencedColumnName = "id")
    private Customer customer;

}
