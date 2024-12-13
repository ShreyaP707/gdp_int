package com.platform.dao;

import com.platform.model.User;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private Connection connection;

    public UserDAO() {
        connection = DBConnection.getConnection();
    }

    public void registerUser (User user) {
        // SQL insert logic
    }

    public User getUser (String username) {
        // SQL select logic
        return new User();
    }

    public void updateUser (User user) {
        // SQL update logic
    }

    public List<User> getAllUsers() {
        // SQL select all logic
        return new ArrayList<>();
    }
}
