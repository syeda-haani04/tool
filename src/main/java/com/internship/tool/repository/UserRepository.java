package com.internship.tool.repository;

import com.internship.tool.entity.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository {

    private final Map<String, User> users = new HashMap<>();

    public UserRepository() {
        users.put("admin", new User(1L, "admin", "admin123", "ADMIN"));
        users.put("user", new User(2L, "user", "user123", "USER"));
    }

    public User findByUsername(String username) {
        return users.get(username);
    }

    public void save(User user) {
        users.put(user.getUsername(), user);
    }
}
