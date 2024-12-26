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
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Assuming user data is set in request
    User user = userDAO.getUser ByUsername("someUsername"); // Fetch user data
    request.setAttribute("user", user); // Set user data in request scope
    request.getRequestDispatcher("profile.jsp").forward(request, response);
}
