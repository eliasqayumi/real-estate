package com.example.realestate.servise;

import com.example.realestate.model.Contact;

import java.util.List;

public interface ContactService {
    List<Contact> getAll();
    void insert(Contact contact);
    void update(String contactId,Contact contact);
    void deleteById(String contactId);
    Contact getById(String contactId);
}
