package sk.umb.example.library.customer.service;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class CustomerRequestDto {
    @NotBlank(message = "First name must not be empty.")
    private String firstName;
    @NotBlank(message = "Last name must not be empty.")
    private String lastName;

    @Pattern(regexp = "^\\S+@\\S+\\.\\S+$")
    private String emailContact;

    @NotNull
    private Long addressId;

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailContact() {
        return emailContact;
    }

    public void setEmailContact(String emailContact) {
        this.emailContact = emailContact;
    }
}
