<%@page import="java.util.Date" session="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>


<!DOCTYPE html>
<html lang="fr">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <link href="${pageContext.request.contextPath}/styles/style.css" rel="stylesheet" id="bootstrap-css">
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <title>Examples Servlet</title>
    <style>
    
    </style>
</head>

<body>
<div class="sidenav">
         <div style ="text-align: center; padding:5px 0; marging">
          <a href="${pageContext.request.contextPath}/home?lang=en&empid=${emp.empId}"> Login English</a>
          &nbsp;&nbsp;
          <a href="${pageContext.request.contextPath}/home?lang=fr&empid=${emp.empId}">Login French</a>
          
         </div>
         <div class="login-main-text">
            <h2>Application<br> JAVA EE</h2>
            <p>Example Servlet.</p>
            <br>
         
         </div>
      </div>
      <div class="main">
         <div class="col-md-6 col-sm-12">
            <div class="login-form">
               <h1> <label><s:message code="label.hello"/> ${emp.firstName} ${emp.lastName }</label></h1>
            </div>
         </div>
      </div>
</body>

</html>