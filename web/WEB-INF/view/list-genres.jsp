<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: bitstudent
  Date: 12/4/2019
  Time: 1:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Genres</title>
</head>
<body>
<h2>List Genres</h2>
<table>
    <c:forEach var="newGenre" items="${genres}">
        <tr>
            <td>${newGenre.genre}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
