package com.platform.dao;

import com.platform.model.Investor;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InvestorDAO {
    private Connection connection;

    public InvestorDAO() {
        connection = DBConnection.getConnection();
    }

    public void registerInvestor(Investor investor) {
        // SQL insert logic
    }

    public Investor getInvestor(String username) {
        // SQL select logic
        return new Investor();
    }

    public void updateInvestor(Investor investor) {
        // SQL update logic
    }

    public List<Investor> getAllInvestors() {
        // SQL select all logic
        return new ArrayList<>();
    }
}
