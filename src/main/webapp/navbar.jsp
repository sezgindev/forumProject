<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<c:if test="${pageContext.request.userPrincipal.name != null}">
    <form id="logoutForm" method="POST" action="${contextPath}/logout">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    </form>
    <nav>
        <div class="navbar">
            <a href="welcome.jsp" >AnaSayfa</a>
            <a href="postAdd.jsp">Blog Yaz</a>
            <a href="">Bloglarım</a>

            <a href=""  style="float:right;" >Hosgeldin ${pageContext.request.userPrincipal.name}</a>
            <a href="#about"  style="float:right;"  onclick="document.forms['logoutForm'].submit()">Logout</a>
        </div>
    </nav>
</c:if>
</body>
<style>
    .navbar {
        overflow: hidden;
        background-color: #333;
        position: fixed;
        top: 0; /* Position the navbar at the top of the page */
        width: 100%; /* Full width */
    }
    .navbar a {
        float:left;
        display: block;
        color: #f2f2f2;
        text-align: center;
        padding: 12px 16px;
        text-decoration: none;
    }


    .navbar a:hover {
        background: #ddd;
        color: black;
    }

</style>
</html>
