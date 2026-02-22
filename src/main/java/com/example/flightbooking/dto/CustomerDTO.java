package com.example.flightbooking.dto;

public class CustomerDTO {

    private Long customerId;
    private String name;
    private String email;

    public CustomerDTO() {
    }

    public CustomerDTO(Long customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}