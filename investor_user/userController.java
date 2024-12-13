package com.platform.controller;

import com.platform.model.User;
import com.platform.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserController extends HttpServlet {
    private UserService userService;

    public UserController() {
        userService = new UserService();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        
        if ("register".equals(action)) {
            User user = new User();
            user.setUsername(request.getParameter("username"));
            user.setPassword(request.getParameter("password"));
            user.setEmail(request.getParameter("email"));
            user.setProfileDetails(request.getParameter("profileDetails"));
            userService.registerUser (user);
            response.sendRedirect("login.jsp");
        }
        // Additional actions like login, update, etc.
    }

    // Additional methods for handling other requests
}
