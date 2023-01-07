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

<form:form action="loginStudent" modelAttribute="loginStudent">



<form:label path="email">Email: </form:label>
<form:input path="email"/><br><br>


<form:label path="password">Password: </form:label>
<form:input path="password"/><br><br>







</form:form>

</body>
</html>