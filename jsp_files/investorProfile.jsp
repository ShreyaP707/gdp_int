<!DOCTYPE html>
<html>
<head>
    <title>Investor Profile</title>
</head>
<body>
    <h2>Investor Profile</h2>
    <form action="InvestorController" method="post">
        <input type="hidden" name="action" value="update">
        Username: <input type="text" name="username" value="${investor.username}" readonly><br>
        Investment Details: <textarea name="investmentDetails">${investor.investmentDetails}</textarea><br>
        <input type="submit" value="Update Profile">
    </form>
    <a href="logout.jsp">Logout</a>
</body>
</html>
