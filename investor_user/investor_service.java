package com.platform.service;

import com.platform.dao.InvestorDAO;
import com.platform.model.Investor;

public class InvestorService {
    private InvestorDAO investorDAO;

    public InvestorService() {
        investorDAO = new InvestorDAO();
    }

    public void registerInvestor(Investor investor) {
        investorDAO.registerInvestor(investor);
    }

    public Investor getInvestor(String username) {
        return investorDAO.getInvestor(username);
    }
    
    // Other service methods
}
