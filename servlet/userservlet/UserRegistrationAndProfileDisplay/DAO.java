package com.platform.dao;

import com.platform.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserDAO {
    private Map<String, User> userDatabase = new HashMap<>();

    public void saveUser (User user) {
        // In a real application, save to a database
        userDatabase.put(user.getUsername(), user);
    }

    public User getUser ByUsername(String username) {
        // In a real application, retrieve from a database
        return userDatabase.get(username);
    }
}
