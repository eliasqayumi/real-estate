package com.example.realestate.controller;

import com.example.realestate.model.Contact;
import com.example.realestate.serviceImpl.ContactServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("contact")
public class ContactController {
    private ContactServiceImpl contactService;

    public ContactController(ContactServiceImpl contactService) {
        this.contactService = contactService;
    }

    @GetMapping
    public List<Contact> getAll() {
        return this.contactService.getAll();
    }

    @GetMapping("/{id}")
    public Contact getById(@PathVariable("id") String contactId) {
        return this.contactService.getById(contactId);
    }

    @PostMapping
    public void insert(@RequestBody Contact contact) {
        this.contactService.insert(contact);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String contactId, @RequestBody Contact contact) {
        this.contactService.update(contactId, contact);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") String contactId) {
        this.contactService.deleteById(contactId);
    }
}
