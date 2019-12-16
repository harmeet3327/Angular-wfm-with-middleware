<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WFM</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<style>
#lg
{

margin-left: 200px;
text-decoration:line;
}
#wkm
{
margin-left: 5px;
}
#clicks
{
margin-left: 500px;;
}
#nav
{
background-color:lightgray;
color:white;
width:100%;
position:fixed;
}
</style>
</head>
<body>


 <nav id="nav" class="navbar navbar-expand-sm bg-dark navbar-dark">
          <!-- Brand/logo -->
          <a class="navbar-brand" href="${pageContext.request.contextPath}/admin">
          <h2> Admin </h2>
          </a>
          <div id="clicks">
         <a class="navbar-brand" id="wkm" href="${pageContext.request.contextPath}/Addres"><h6>Add Employee</h6></a>
          <a class="navbar-brand" id="wkm" href="${pageContext.request.contextPath}/requestdetail"><h6>Request Details</h6></a>
          <a class="navbar-brand" id="wkm" href="${pageContext.request.contextPath}/allDetails"><h6>Resources</h6></a>
               <a class="navbar-brand" id="wkm" href="${pageContext.request.contextPath}/allReq"><h6>All Request</h6></a>
          </div>
      
          <!-- Links -->
          <ul class="navbar-nav">
            <li class="nav-item" >
                
              <a class="nav-link" id="lg" href="${pageContext.request.contextPath}/logout" > <b>Logout</b></a>
               
            </li>
            <li></li>
           
          </ul>
    
        </nav>

