<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
</head>
<body>
    <h2>User Registration</h2>
    <form action="User Controller" method="post">
        <input type="hidden" name="action" value="register">
        Username: <input type="text" name="username"><br>
        Password: <input type="password" name="password"><br>
        Email: <input type="email" name="email"><br>
                Profile Details: <textarea name="profileDetails"></textarea><br>
        <input type="submit" value="Register">
    </form>
    <a href="login.jsp">Already have an account? Login here</a>
</body>
</html>
