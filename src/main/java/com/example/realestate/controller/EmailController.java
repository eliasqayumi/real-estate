package com.example.realestate.controller;

import com.example.realestate.model.Email;
import com.example.realestate.serviceImpl.EmailServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("email")
public class EmailController {
    private EmailServiceImpl emailService;

    public EmailController(EmailServiceImpl emailService) {
        this.emailService = emailService;
    }

    @GetMapping
    public List<Email> getAll() {
        return this.emailService.getAll();
    }

    @GetMapping("/{id}")
    public Email getById(@PathVariable("id") String emailId) {
        return this.emailService.getById(emailId);
    }

    @PostMapping
    public void insert(@RequestBody Email email) {
        this.emailService.insert(email);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String emailId, @RequestBody Email email) {
        this.emailService.update(emailId, email);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") String emailId) {
        this.emailService.deleteById(emailId);
    }
}
