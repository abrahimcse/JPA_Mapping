package com.task.JPA.Mapping.Demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class OrderResponse {

    private String name;
    private String productName;
    public OrderResponse(String name, String productName) { // Constructor with arguments
        this.name = name;
        this.productName = productName;
    }
    private int price;
}
