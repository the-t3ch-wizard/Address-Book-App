package com.address_book_app.address_book_app.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AddressBookService {

    public ResponseEntity<String> getAllAddressBook() {
        return new ResponseEntity<>("get all address book", HttpStatus.OK);
    }

    public ResponseEntity<String> getAddressBookById(String id) {
        return new ResponseEntity<>("get address book of id "+id, HttpStatus.OK);
    }

    public ResponseEntity<String> createAddressBook() {
        return new ResponseEntity<>("create address book", HttpStatus.OK);
    }

    public ResponseEntity<String> updateAddressBook(String id) {
        return new ResponseEntity<>("update address book of id "+id, HttpStatus.OK);
    }

    public ResponseEntity<String> deleteAddressBook(String id) {
        return new ResponseEntity<>("delete address book of id "+id, HttpStatus.OK);
    }

    public ResponseEntity<String> deleteAllAddressBook() {
        return new ResponseEntity<>("delete all address book", HttpStatus.OK);
    }
}
