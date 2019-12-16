<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<title>Sign In</title>
<style>
body {
    
    margin:0px;
    background-color:lightgray;
}

.form_bg {
    background-color:#eee;
    color:#666;
    padding:20px;
    border-radius:10px;
    position: absolute;
    border:1px solid #fff;
    margin: auto;
    top: 0;
    right: 0;
    bottom: 0;
    left: 0;
    width: 320px;
    height: 280px;
}

.align-center {
    
    text-align:center;
}
#btn
{
background-color:gray;
width:100%;
}
#login
{

margin-left: 300px;
text-decoration:line;
}
#wkm
{
margin-left: 100px;
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
		
		
		<hr/>
		
		<div class="container">
    <div class="row">
        <div class="form_bg">
            <form action="login" method="post">
                 <h2 class="text-center"><b>SignIn<b></h2>
                <br/>
                <div>  ${msg} </div>
                <div class="form-group">
                    <input type="number" name="rId" class="form-control" id="userid" required placeholder="User id">
                </div>
                <div class="form-group">
                    <input type="password" name="rPassward" class="form-control" id="pwd" required placeholder="Password">
                
                    </div>
                    <br/>
                   <div class="align-center">
                <button type="submit" class="btn btn-default" id="btn">Login</button>
                    </div>
            </form>
        </div>
		
	</body>
</html>