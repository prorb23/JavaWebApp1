<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
</head>
<body>
    <h2>Registration Page</h2>
    <form action="register" method="post">
        Name: <input type="text" name="name" required /><br>
        Email: <input type="text" name="email" required /><br>
        Password: <input type="password" name="password" required /><br>
        <input type="submit" value="Register" /><br>
    </form>

    <% if (request.getParameter("error") != null) { %>
        <p style="color: red;">Registration failed! Please try again.</p>
    <% } %>
</body>
</html>