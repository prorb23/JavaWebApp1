<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h2>Login Page</h2>
    <form action="login" method="post">
        Email: <input type="text" name="email" required /><br>
        Password: <input type="password" name="password" required /><br>
        <input type="submit" value="Login" /><br>
    </form>

    <% if (request.getParameter("error") != null) { %>
        <p style="color: red;">Invalid email or password!</p>
    <% } %>
</body>
</html>
