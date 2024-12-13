package com.platform.service;

import com.platform.dao.UserDAO;
import com.platform.model.User;

public class UserService {
    private UserDAO userDAO;

    public UserService() {
        userDAO = new UserDAO();
    }

    public void registerUser (User user) {
        userDAO.registerUser (user);
    }

    public User getUser (String username) {
        return userDAO.getUser (username);
    }
    
    // Other service methods
}
