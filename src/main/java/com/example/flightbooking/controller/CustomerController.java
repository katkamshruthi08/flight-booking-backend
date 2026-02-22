package com.example.flightbooking.controller;

import com.example.flightbooking.dto.CustomerDTO;
import com.example.flightbooking.service.CustomerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public CustomerDTO registerCustomer(@RequestBody CustomerDTO customerDTO) {
        return customerService.registerCustomer(customerDTO);
    }

    @GetMapping("/{id}")
    public CustomerDTO getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }
}