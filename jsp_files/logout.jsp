<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.HttpSession" %>
<%
    HttpSession session = request.getSession();
    session.invalidate(); // Invalidate the session
    response.sendRedirect("index.jsp"); // Redirect to index page
%>
