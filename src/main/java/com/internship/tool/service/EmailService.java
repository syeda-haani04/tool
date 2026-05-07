package com.internship.tool.service;

import org.springframework.stereotype.Service;

@Service
public class EmailService {

    public String sendEmail() {
        return "Email notification sent successfully";
    }
}
