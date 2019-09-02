<%--
  Created by IntelliJ IDEA.
  User: SEZGIN
  Date: 22.08.2019
  Time: 13:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<jsp:include page="navbar.jsp" />

<html xmlns="http://www.w3.org/1999/xhtml" xmlns: th="http://www.thymeleaf.org"
      xmlns: sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Title</title>
</head>
<body>
<div style="width:60%; margin:5% 25%;">
<table class="table table-striped">
    <thead>
    <tr>
        <th scope="col">Kullanici Listesi</th>

   </tr>
    </thead>

    <tbody>

       <!-- foreachten cıkmadan usernameyi veya id yi methoda gönder -->
         <c:forEach var = "i" items="${users}">
         <tr>

             <td><c:out value = "${i}"/>  <br></td>
             <td>
                 <div class="btn-group">
                 <a href= "UserEdit.jsp" class="btn btn-xs btn-primary"><i class="glyphicon glyphicon-edit"></i>Düzenle</a>
                 <a href= "/deleteByUsername/<c:out value = "${i}"/>" class="btn btn-xs btn-danger"><i class="glyphicon glyphicon-remove"></i>Sil</a>
             </div>
             </td>
         </tr>
        </c:forEach>



    </tbody>
</table>
</div>
</body>
</html>
