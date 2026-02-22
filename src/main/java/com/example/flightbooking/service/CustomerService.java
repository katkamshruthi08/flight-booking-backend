package com.example.flightbooking.service;

import com.example.flightbooking.dto.CustomerDTO;
import com.example.flightbooking.entity.Customer;
import com.example.flightbooking.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerDTO registerCustomer(CustomerDTO customerDTO) {

        // Convert DTO → Entity
        Customer customer = new Customer();
        customer.setName(customerDTO.getName());
        customer.setEmail(customerDTO.getEmail());

        Customer savedCustomer = customerRepository.save(customer);

        // Convert Entity → DTO
        return new CustomerDTO(
                savedCustomer.getCustomerId(),
                savedCustomer.getName(),
                savedCustomer.getEmail()
        );
    }

    public CustomerDTO getCustomerById(Long id) {
        Optional<Customer> customerOptional = customerRepository.findById(id);

        if (customerOptional.isPresent()) {
            Customer customer = customerOptional.get();
            return new CustomerDTO(
                    customer.getCustomerId(),
                    customer.getName(),
                    customer.getEmail()
            );
        }

        return null;
    }
}