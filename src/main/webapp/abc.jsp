<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>

</head>
<body>

<form:form action="signupStudent" modelAttribute="loginStudent">


<h3>Welcome to Login Page</h3>


<input type="submit" value="loginredirect">


</form:form>

</body>
</html>