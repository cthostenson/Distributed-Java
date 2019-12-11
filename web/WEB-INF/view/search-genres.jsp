<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: bitstudent
  Date: 12/4/2019
  Time: 2:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search Genres</title>
</head>
<body>
<form:form method="get" action="search">
    Genre Search <input type="text" name="searchTerm"/><br/><br/>
    <input type="submit">
</form:form>
</body>
</html>
