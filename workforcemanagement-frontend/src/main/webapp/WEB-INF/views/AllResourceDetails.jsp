<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<title>WFM</title>
<style>
#d1
{
margin-top:00px; 
}
</style>
</head>
<body>
<%@ include file="AdminHeader.jsp" %>
<br/>
<br/>
<br/>
	
	
<div align="center" class="container" id="d1">
	<c:choose >
<c:when test="${empty resList }" >
<div><h3>No Resources Available</h3></div>
</c:when>
<c:otherwise>
		
		${msg}
		<h1>Resource  List</h1>
		
		<table border="2" class="table table-striped">
		<tr>
			<th>Resource Id</th>
			<th>Project </th>
			<th>Role</th>
			<th>Experience</th>
			<th>Skills </th>
			<th>DOB</th>
			<th>Email </th>
			<th>Gender </th>
			
		
		</tr>
		<c:forEach items="${resList}" var="rL">
			<tr>
				<td>${rL.rId}</td>
				<td>${rL.project.projectName}</td>
				<td>${rL.role.roleId}</td>
				<td>${rL.rExperience}</td>
				<td>${rL.rSkills}</td>
				<td>${rL.rDOB}</td>
				<td>${rL.rEmail}</td>
				<td>${rL.rGender}</td>
				
				
			</tr>
		</c:forEach>
		</table>
		</c:otherwise>
</c:choose>
	</div>
	
	</table>
</body>
</html>