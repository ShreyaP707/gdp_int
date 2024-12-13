package com.platform.controller;

import com.platform.model.Investor;
import com.platform.service.InvestorService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class InvestorController extends HttpServlet {
    private InvestorService investorService;

    public InvestorController() {
        investorService = new InvestorService();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        
        if ("register".equals(action)) {
            Investor investor = new Investor();
            investor.setUsername(request.getParameter("username"));
            investor.setPassword(request.getParameter("password"));
            investor.setInvestmentDetails(request.getParameter("investmentDetails"));
            investorService.registerInvestor(investor);
            response.sendRedirect("investorProfile.jsp");
        }
        // Additional actions like update, view, etc.
    }

    // Additional methods for handling other requests
}
