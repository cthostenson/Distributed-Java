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
    <title>Choose Genre To Edit</title>
</head>
<body>
<form:form action="editGenre" modelAttribute="aGenre" enctype="multipart/form-data">
    <h2>Edit Genre</h2>
    <table></table>
        <tr>
            <td>Genre ID: </td>
            <td><form:input path="genreId"/></td>
        </tr>
        <tr>
            <td>Genre: </td>
            <td><form:input path="genre"/></td>
        </tr>
    </table>
    <input type="submit" value="Edit Genre">
</form:form>
</body>
</html>
