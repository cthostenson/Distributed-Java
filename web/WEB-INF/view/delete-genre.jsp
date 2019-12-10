<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>Delete Genre</title>
</head>
<body>
<form:form action="/deleteGenre">
    <h2>Delete A Genre</h2>
    <table>
        <c:forEach var="newGenre" items="${genres}">
            <tr>
                <td>${newGenre.genreId}</td>
                <td>${newGenre.genre} </td>
                <td><input type="submit" value="Delete Genre"/></td>
            </tr>
        </c:forEach>
    </table>
</form:form>
</body>
</html>
