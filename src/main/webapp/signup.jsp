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

<form:form action="signupStudent" modelAttribute="signupStudent">

<form:label path="name">Name: </form:label>
<form:input path="name"/><br><br>

<form:label path="phone">Phone: </form:label>
<form:input path="phone"/><br><br>

<form:label path="school">School: </form:label>
<form:input path="school"/><br><br>

<form:label path="email">Email: </form:label>
<form:input path="email"/><br><br>

<form:label path="password">Password: </form:label>
<form:input path="password"/><br><br>

</form:form>

</body>
</html>