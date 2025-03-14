package com.address_book_app.address_book_app.exception;

public class AddressBookNotFoundException extends RuntimeException {

    public AddressBookNotFoundException(String name) {
        super("Unable to find address book with name "+name);
    }

    public AddressBookNotFoundException(Long id) {
        super("Unable to find address book with id "+id);
    }

}
