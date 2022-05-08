package com.example.realestate.serviceImpl;

import com.example.realestate.model.Email;
import com.example.realestate.repository.EmailRepository;
import com.example.realestate.servise.EmailService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailServiceImpl implements EmailService {
    private EmailRepository emailRepository;

    public EmailServiceImpl(EmailRepository emailRepository) {
        this.emailRepository = emailRepository;
    }

    @Override
    public List<Email> getAll() {
        return this.emailRepository.findAll();
    }

    @Override
    public void insert(Email email) {
        this.emailRepository.save(email);
    }

    @Override
    public void update(String emailId, Email email) {
        Email updateEmail = this.emailRepository.getById(emailId);
        updateEmail.setId(email.getId());
        this.emailRepository.save(updateEmail);
    }

    @Override
    public void deleteById(String emailId) {
        this.emailRepository.deleteById(emailId);
    }

    @Override
    public Email getById(String emailId) {
        return this.emailRepository.getById(emailId);
    }
}
