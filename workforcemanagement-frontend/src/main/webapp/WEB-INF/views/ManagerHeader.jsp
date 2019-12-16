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

margin-left: 300px;
text-decoration:line;
}
#wkm
{
margin-left: px;
}
#clicks
{
margin-left: 300px;;
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
          <a class="navbar-brand" href="${pageContext.request.contextPath}/manager">
          <h2> MANAGER  </h2>
          
          </a><div id="clicks">
         <a class="navbar-brand" id="wkm" href="${pageContext.request.contextPath}/detail"><h6>Personal Details</h6></a>
         <a class="navbar-brand" id="wkm" href="${pageContext.request.contextPath}/req"><h6>Raise Request</h6></a>
         <a class="navbar-brand" id="wkm" href="${pageContext.request.contextPath}/adminSugg/${rObj.project.projectId}"><h6>Suggestion List</h6></a>
 	    <a class="navbar-brand" id="wkm" href="${pageContext.request.contextPath}/managerReq/${rObj.project.projectId}"><h6>All Requests</h6></a>
 	    
          </div>
      
          <!-- Links -->
          <ul class="navbar-nav">
            <li class="nav-item" >
                
              <a class="nav-link" id="lg" href="${pageContext.request.contextPath}/logout" > <b>Logout</b></a>
               
            </li>
            <li></li>
           
          </ul>
    
        </nav>


