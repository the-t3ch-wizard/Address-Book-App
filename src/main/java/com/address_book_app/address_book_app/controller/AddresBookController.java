package com.address_book_app.address_book_app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address-book")
public class AddresBookController {

    @GetMapping(value = {"", "/"})
    public ResponseEntity<String> getAllAddressBook(){
        return new ResponseEntity("get all address book", HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getAddressBookById(@PathVariable String id){
        return new ResponseEntity("get address book of id "+id, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<String> createAddressBook(){
        return new ResponseEntity("create address book", HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateAddressBook(@PathVariable String id){
        return new ResponseEntity("update address book of id "+id, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAddressBook(@PathVariable String id){
        return new ResponseEntity("delete address book of id "+id, HttpStatus.OK);
    }

    @DeleteMapping(value = {"", "/"})
    public ResponseEntity<String> deleteAllAddressBook(){
        return new ResponseEntity("delete all address book", HttpStatus.OK);
    }

}
