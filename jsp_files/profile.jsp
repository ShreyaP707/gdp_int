<!DOCTYPE html>
<html>
<head>
    <title>User Profile</title>
</head>
<body>
    <h2>User Profile</h2>
    <form action="User Controller" method="post">
        <input type="hidden" name="action" value="update">
        Username: <input type="text" name="username" value="${user.username}" readonly><br>
        Email: <input type="email" name="email" value="${user.email}"><br>
        Profile Details: <textarea name="profileDetails">${user.profileDetails}</textarea><br>
        <input type="submit" value="Update Profile">
    </form>
    <a href="logout.jsp">Logout</a>
</body>
</html>
