package com.task.JPA.Mapping.Demo.dto;
import com.task.JPA.Mapping.Demo.entity.Company;
import com.task.JPA.Mapping.Demo.entity.Customer;
import com.task.JPA.Mapping.Demo.entity.CustomerContact;
import com.task.JPA.Mapping.Demo.entity.Shop;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {

    private Customer customer;
    private CustomerContact customerContact;


}
