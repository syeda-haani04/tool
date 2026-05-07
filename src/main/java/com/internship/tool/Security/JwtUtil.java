package com.internship.tool.Security;

public class JwtUtil {

    public String generateToken(String username) {
        return "jwt_token_for_" + username;
    }
}