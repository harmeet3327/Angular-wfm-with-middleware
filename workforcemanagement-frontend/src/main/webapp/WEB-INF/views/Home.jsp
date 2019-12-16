<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>WFM</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>


<style>
#login
{

margin-left: 300px;
text-decoration:line;
}
#wkm
{
margin-left: 100px;
}
body
{
margin:0px;
}
#nav
{

color:white;
width:100%;
position:fixed;
}
</style>
</head>
<body>
<nav id="nav" class="navbar navbar-expand-sm bg-dark navbar-dark">
  <!-- Brand/logo -->
  <a class="navbar-brand" href="${pageContext.request.contextPath}">
   <img src="${pageContext.request.contextPath}/resources/images/irislogo.gif" alt="iris logo">
  
  </a>
  <a class="navbar-brand" id="wkm" href="#"><h1 align="center" >WORKFORCE MANAGEMENT</h1></a>
  <!-- Links -->
  <ul class="navbar-nav">
    <li class="nav-item" >
      <a class="nav-link" id="login" href="signin" > <b>Login</b></a>
       
    </li>
    
   
  </ul>
</nav>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<div align="center"><img src="${pageContext.request.contextPath}/resources/images/pic2.png" alt="pic1"></div>
   </body>
</html>