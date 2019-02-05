<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<link href='<c:url value="/assets/css/NewFile.css"/>' rel="stylesheet">


<!------ Include the above in your HEAD tag ---------->

</head>

<body>

<form:form 
 		action="/login"
 		method="POST"
 		modelAttribute="userLogin" >
 		
 		
 		<!------ he dejado el otro login como guia----
 		
 		
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet"> 
<!------  ---------->

<div class="container">
    <div class="row">
        <div class="col-md-offset-5 col-md-3">
            <div class="form-login">
            <h4>Welcome back.</h4>
            <form:input path="email" type="text" id="userName" class="form-control input-sm chat-input" placeholder="username" />
            </br>
            <form:input path="password" type="text" id="userPassword" class="form-control input-sm chat-input" placeholder="password" />
            </br>
            <div class="wrapper">
            <button type="submit" >Acceder</button>
            </div>
            </div>
        
        </div>
    </div>
</div>

</form:form>
<script src=webjars/bootstrap/3.3.7-1/js/bootstrap.min.js></script>
<script src=webjars/jquery/1.11.1/jquery.min.js></script>
</body>
</html>