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
    <title>Add Genre</title>
</head>
<body>
<h2>Create A Genre</h2> <!--  modelAttribute="genre"   type="text" name="genre" -->
    <form:form action="addGenre" modelAttribute="aGenre" enctype="multipart/form-data">
        Genre <form:input path="genre"/><br/><br/>
        <input type="submit" value="AddGenre">
    </form:form>
</body>
</html>
