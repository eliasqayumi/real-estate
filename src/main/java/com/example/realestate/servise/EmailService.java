package com.example.realestate.servise;


import com.example.realestate.model.Email;

import java.util.List;

public interface EmailService {
    List<Email> getAll();
    void insert(Email email);
    void update(String emailId,Email email);
    void deleteById(String emailId);
    Email getById(String emailId);
}