package com.internship.tool.controller;

import com.internship.tool.Security.JwtUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private final JwtUtil jwtUtil = new JwtUtil();

    @GetMapping("/login")
    public String login() {
        return jwtUtil.generateToken("admin");
    }

    @GetMapping("/register")
    public String register() {
        return "User Registered Successfully";
    }

    @GetMapping("/refresh")
    public String refresh() {
        return jwtUtil.generateToken("refreshedUser");
    }
}