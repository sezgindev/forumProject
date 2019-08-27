<%--
  Created by IntelliJ IDEA.
  User: SEZGIN
  Date: 22.08.2019
  Time: 13:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html xmlns="http://www.w3.org/1999/xhtml" xmlns: th="http://www.thymeleaf.org"
      xmlns: sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>Title</title>
</head>
<body>






    <c:forEach var = "i" items="${users}">

   <c:out value = "${i}"/>  <br>

    </c:forEach>







</body>
</html>
