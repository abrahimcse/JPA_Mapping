package com.task.JPA.Mapping.Demo.controller;


import com.task.JPA.Mapping.Demo.dto.OrderRequest;
import com.task.JPA.Mapping.Demo.dto.OrderResponse;
import com.task.JPA.Mapping.Demo.entity.Company;
import com.task.JPA.Mapping.Demo.entity.Customer;
import com.task.JPA.Mapping.Demo.entity.CustomerContact;
import com.task.JPA.Mapping.Demo.entity.Shop;
import com.task.JPA.Mapping.Demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class OrderController {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CompanyRepository companyRepository;
    @Autowired
    private ShopRepository shopRepository;

    @Autowired
    private CustomerContactRepository customerContactRepository;

    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest orderRequest){
        return customerRepository.save(orderRequest.getCustomer());
    }

    @GetMapping("/findAllOrder")
    public List<Customer> findAllOrder(){
        return customerRepository.findAll();
    }

    @GetMapping("/getInfo")
    public List<OrderResponse> getJoinInfo(){
        return customerRepository.getJoinInformation();
    }

    @PostMapping ("/customerInfo")
    public CustomerContact contactInfo(@RequestBody OrderRequest orderRequest){
        return customerContactRepository.save(orderRequest.getCustomerContact());
    }
    @GetMapping("/contactInfo")
    public List<CustomerContact> getContact(){
        return customerContactRepository.findAll();
    }

    @PostMapping("/company")
    public Company saveCompanyWithShop(@RequestBody Company company){
        return companyRepository.save(company);
    }
    @GetMapping("allCompany")
    public List<Company> findAllCompany(){
        return companyRepository.findAll();
    }
    @GetMapping("/company/{id}")
    public Company findCompany(@PathVariable int companyId){
        return companyRepository.findById(companyId).orElse(null);
    }

}
