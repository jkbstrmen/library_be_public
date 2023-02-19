package sk.umb.example.library.address.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class AddressController {
    @GetMapping("/api/addresses")
    public void getAllAddresses() {
        System.out.println("Get addresses called.");
    }

    @GetMapping("/api/addresses/{addressId}")
    public void getAddress(@PathVariable Long addressId) {
        System.out.println("Get address called.");
    }

    @PostMapping("/api/addresses")
    public void createAddress() {
        System.out.println("Create address called:");
    }

    @PutMapping("/api/addresses/{addressId}")
    public void updateAddress(@PathVariable Long addressId) {
        System.out.println("Update address called: ID = " + addressId);
    }

    @DeleteMapping("/api/addresses/{addressId}")
    public void deleteAddress(@PathVariable Long addressId) {
        System.out.println("Delete address called: ID = " + addressId);
    }
}
