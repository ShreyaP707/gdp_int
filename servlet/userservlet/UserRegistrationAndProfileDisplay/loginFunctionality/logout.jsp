<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Profile</title>
</head>
<body>
    <h1>User Profile</h1>
    <c:if test="${not empty sessionScope.loggedInUser }">
        <p>Welcome, ${sessionScope.loggedInUser .username}!</p>
        <a href="logout">Logout</a>
    </c:if>
    <c:if test="${empty sessionScope.loggedInUser }">
        <p>Please <a href="login.jsp">login</a>.</p>
    </c:if>
</body>
</html>
