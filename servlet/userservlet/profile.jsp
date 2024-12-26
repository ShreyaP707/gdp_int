<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User Profile</title>
</head>
<body>
    <h1>User Profile</h1>
    <c:if test="${not empty user}">
        <p>Username: ${user.username}</p>
        <p>Email: ${user.email}</p>
        <!-- Add more user details as needed -->
    </c:if>
    <c:if test="${empty user}">
        <p>No user data available.</p>
    </c:if>
</body>
</html>
