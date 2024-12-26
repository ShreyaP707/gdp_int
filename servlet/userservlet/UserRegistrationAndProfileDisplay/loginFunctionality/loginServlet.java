@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private UserDAO userDAO = new UserDAO();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = userDAO.getUser ByUsername(username);
        if (user != null && BCrypt.checkpw(password, user.getPassword())) {
            // Successful login
            request.getSession().setAttribute("loggedInUser ", user);
            response.sendRedirect("profile.jsp?username=" + username);
        } else {
            // Invalid credentials
            request.setAttribute("errorMessage", "Invalid username or password.");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}
