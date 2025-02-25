package com.address_book_app.address_book_app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address-book")
public class AddresBookController {

    @GetMapping(value = {"", "/"})
    public String getAllAddressBook(){
        return "get all address book";
    }

    @GetMapping("/{id}")
    public String getAddressBookById(@PathVariable String id){
        return "get address book of id "+id;
    }

    @PostMapping("")
    public String createAddressBook(){
        return "create address book";
    }

    @PutMapping("/{id}")
    public String updateAddressBook(@PathVariable String id){
        return "update address book of id "+id;
    }

    @DeleteMapping("/{id}")
    public String deleteAddressBook(@PathVariable String id){
        return "delete address book of id "+id;
    }

    @DeleteMapping(value = {"", "/"})
    public String deleteAllAddressBook(){
        return "delete all address book";
    }

}
