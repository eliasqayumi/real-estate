package com.example.realestate.serviceImpl;

import com.example.realestate.model.Contact;
import com.example.realestate.repository.ContactRepository;
import com.example.realestate.servise.ContactService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {
    private ContactRepository contactRepository;

    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public List<Contact> getAll() {
        return this.contactRepository.findAll();
    }

    @Override
    public void insert(Contact contact) {
        this.contactRepository.save(contact);
    }

    @Override
    public void update(String contactId, Contact contact) {
        Contact updateContact=this.contactRepository.getById(contactId);
        updateContact.setTcNo(contact.getTcNo());
        this.contactRepository.save(updateContact);
    }

    @Override
    public void deleteById(String contactId) {
        this.contactRepository.deleteById(contactId);
    }

    @Override
    public Contact getById(String contactId) {
        return this.contactRepository.getById(contactId);
    }
}
