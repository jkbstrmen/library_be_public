package sk.umb.example.library.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sk.umb.example.library.customer.service.CustomerRequestDTO;
import sk.umb.example.library.customer.service.CustomerResponseDTO;
import sk.umb.example.library.customer.service.CustomerService;

import java.util.Collections;
import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/api/customers")
    public List<CustomerResponseDTO> searchCustomer(@RequestParam(required = false) String lastName) {
        System.out.println("Search customer called.");
        return Collections.EMPTY_LIST;
    }

    @GetMapping("/api/customers/{customerId}")
    public CustomerResponseDTO getCustomer(@PathVariable Long customerId) {
        System.out.println("Get customer called.");
        return new CustomerResponseDTO();
    }

    @PostMapping("/api/customers")
    public void createCustomer(@RequestBody CustomerRequestDTO customerRequestDTO) {
        System.out.println("Create customer called:");
    }

    @PutMapping("/api/customers/{customerId}")
    public void updateCustomer(@PathVariable Long customerId, @RequestBody CustomerRequestDTO customerRequestDTO) {
        System.out.println("Update customer called: ID = " + customerId);
    }

    @DeleteMapping("/api/customers/{customerId}")
    public void deleteCustomer(@PathVariable Long customerId) {
        System.out.println("Delete customer called: ID = " + customerId);
    }
}
