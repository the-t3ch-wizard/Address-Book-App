package com.address_book_app.address_book_app.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Setter
@Getter
public class AddressBookDto {

    @NotNull
    @Size(min = 2, message = "Name should be atleast 2 characters long")
    @Pattern(regexp = "^[A-Za-z]+$", message = "Name should contain alphabets only!")
    private String name;

    @NotNull
    private Long phoneNumber;

    public AddressBookDto() {}

    public AddressBookDto(String name, Long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

}
