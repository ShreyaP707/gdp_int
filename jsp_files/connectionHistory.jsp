<!DOCTYPE html>
<html>
<head>
    <title>Connection History</title>
</head>
<body>
    <h2>Connection History</h2>
    <table>
        <tr>
            <th>Investor</th>
            <th>Meeting Link</th>
            <th>Date</th>
        </tr>
        <c:forEach var="connection" items="${connections}">
            <tr>
                <td>${connection.investor}</td>
                <td>${connection.meetingLink}</td>
                <td>${connection.date}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="profile.jsp">Back to Profile</a>
</body>
</html>
