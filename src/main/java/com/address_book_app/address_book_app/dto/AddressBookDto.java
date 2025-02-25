package com.address_book_app.address_book_app.dto;

public class AddressBookDto {

    private String name;
    private Long phoneNumber;

    public AddressBookDto() {}

    public AddressBookDto(String name, Long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
