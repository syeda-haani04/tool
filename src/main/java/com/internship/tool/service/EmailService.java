package com.internship.tool.service;

import org.springframework.stereotype.Service;

@Service
public class EmailService {

    public String sendEmail(String to) {
        return "Email sent successfully to " + to;
    }
}
