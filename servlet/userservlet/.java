@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    // Here you would typically save the user to the database
    UserDAO userDAO = new UserDAO();
    userDAO.saveUser (new User(username, password)); // Assuming User is a model class

    // Redirect to the profile page
    response.sendRedirect("profile.jsp");
}
