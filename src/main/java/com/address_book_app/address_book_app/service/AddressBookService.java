package com.address_book_app.address_book_app.service;

import com.address_book_app.address_book_app.dto.AddressBookDto;
import com.address_book_app.address_book_app.model.AddressBook;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService {

    private final List<AddressBook> addressBooks = new ArrayList<>();

    public ResponseEntity<List<AddressBook>> getAllAddressBook() {
        return new ResponseEntity<>(addressBooks, HttpStatus.OK);
    }

    public ResponseEntity<AddressBook> getAddressBookByName(String name) {
        for (AddressBook addressBook : addressBooks){
            if (addressBook.getName().equals(name)) return new ResponseEntity<>(addressBook, HttpStatus.FOUND);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<AddressBook> createAddressBook(AddressBookDto addressBookDto) {
        AddressBook newAddressBook = new AddressBook(addressBookDto.getName(), addressBookDto.getPhoneNumber());
        addressBooks.add(newAddressBook);
        return new ResponseEntity<>(newAddressBook, HttpStatus.CREATED);
    }

    public ResponseEntity<AddressBook> updateAddressBook(Long id, AddressBookDto addressBookDto) {
        for (int i=0; i<addressBooks.size(); i++){
            if (addressBooks.get(i).getId() == id){
                addressBooks.set(i, new AddressBook(addressBookDto.getName(), addressBookDto.getPhoneNumber()));
                return new ResponseEntity<>(addressBooks.get(i), HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<String> deleteAddressBook(Long id) {
        for (int i=0; i<addressBooks.size(); i++){
            if (addressBooks.get(i).getId() == id){
                addressBooks.remove(i);
                return new ResponseEntity<>("Deleted successfully", HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("Unable to delete address book "+id, HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<String> deleteAllAddressBook() {
        if (addressBooks.removeAll(addressBooks)) return new ResponseEntity<>("delete all address book", HttpStatus.OK);
        return new ResponseEntity<>("Unable to delete address books", HttpStatus.OK);
    }
}
