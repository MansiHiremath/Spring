<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
${logonError}
<form action="login" method="post">
<input type="text" name="username" placeholder="Enter username">
<input type="password" name="password" placeholder="Enter password">
<input type="submit" name="submit">

</form>
</body>
</html>