package com.platform.controller;

import com.platform.dao.UserDAO;
import com.platform.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user")
public class UserServlet extends HttpServlet {
    private UserDAO userDAO = new UserDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Forward to the registration page
        request.getRequestDispatcher("register.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email"); // Assuming you have an email field in your form

        // Create a new User object
        User user = new User(username, password);
        user.setEmail(email); // Set email if applicable

        // Save the user to the database (or in this case, the in-memory map)
        userDAO.saveUser (user);

        // Redirect to the profile page after registration
        response.sendRedirect("profile.jsp?username=" + username);
    }
}
