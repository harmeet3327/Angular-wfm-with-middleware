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
	
<div align="center" bold>
		Welcome ${rObj.rName}
		
	</div>
	<hr/>
	
<div align="center">
	
		
		${msg}
		<h1>Request List</h1>
		<div class="container">
		<c:choose >
<c:when test="${empty reqList }" >
<div><h3>No Request Available</h3></div>
</c:when>
<c:otherwise>
		<table border="2" class="table table-striped" >
		<tr>
			<th>Request Id</th>
			<th>Project </th>
			<th>Role</th>
			<th>Required Experience</th>
			<th>Skills </th>
			<th> StartDate</th>
			<th>EndDate </th>
			<th>reqRemarks </th>
			<th>reqFlag</th>
		
		
		</tr>
		<c:forEach items="${reqList}" var="rL">
			<tr>
				<td>${rL.reqId}</td>
				<td>${rL.project.projectId}</td>
				<td>${rL.role.roleId}</td>
				<td>${rL.reqRequiredExp}</td>
				<td>${rL.reqSkills}</td>
				<td>${rL.reqProjStartDate}</td>
				<td>${rL.reqProjEndDate}</td>
				<td>${rL.reqRemarks}</td>
				<td>${rL.reqFlag}</td>
				
				
			</tr>
		</c:forEach>
		</table>
		</c:otherwise>
</c:choose>
		</div>
	</div>

	</table>
</body>
</html>