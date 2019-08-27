<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: SEZGIN
  Date: 23.08.2019
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="navbar.jsp" />
<html>
<head>

    <title>Title</title>
</head>
<body>
<div class="border">
<form>
     <div>
        <label for="title">Blog Basligi</label>
        <input class="form-control" type="text" id="title" name="post_title">
    </div>
    <div>
        <label for="post">Blog Alani</label>
        <textarea id="post" name="user_post"></textarea>
    </div>

    <div class="button">
        <button type="submit" class="btn btn-success">Send your post</button>
    </div>
</form>
</div>
<!-- <div class="md-form" >
    <i class="fas fa-pencil-alt prefix"></i>
    <textarea id="form10"  rows="10" cols="90"></textarea>

</div> -->


</body>

<style>
    form {
        /* Just to center the form on the page */

        margin: 10% 9%;
        width: 400px;
        /* To see the outline of the form */

    }
    .border{
        margin: 5% auto;
        border: 1px solid #CCC;
        width: 700px;
        height: 520px;
        border-radius: 25px;

    }

    form div + div {
        margin-top: 1em;
    }

    label {
        /* To make sure that all labels have the same size and are properly aligned */
        display: inline-block;
        width: 90px;
        text-align: right;
    }

    input, textarea {
        /* To make sure that all text fields have the same font settings
           By default, textareas have a monospace font */
        font: 1em sans-serif;

        /* To give the same size to all text fields */
        width: 600px;
        box-sizing: border-box;

        /* To harmonize the look & feel of text field border */
        border: 1px solid #999;
    }

    input:focus, textarea:focus {
        /* To give a little highlight on active elements */
        border-color: #000;
    }

    textarea {
        /* To properly align multiline text fields with their labels */
        vertical-align: top;

        /* To give enough room to type some text */
        height: 15em;
    }


    .button {

        padding-left: 230px;
        padding-top: 20px;
    }


</style>
</html>
