<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Work force management</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<c:choose >
<c:when test="${rObj.roleId eq 201 }" >
<jsp:include page="ResourceHeader.jsp"></jsp:include>
</c:when>
<c:when test="${rObj.roleId eq 206 }" >
<jsp:include page="ManagerHeader.jsp"></jsp:include>
</c:when>
<c:otherwise>
<jsp:include page="ResourceHeader.jsp"></jsp:include>
</c:otherwise>

</c:choose>
<br/>
<br/>
<br/>
<div align="center" bold>
		Welcome ${rObj.rName}
		
	</div>
	<hr/>
	
<div class="container"> 
	<table  border="2" class="table table-striped" >
	<thead>
	<th>Id</th>
	<th>Name</th>
	<th>Gender</th>
	<th>Email</th>
	<th>Project</th>
	<th>Birthday</th>
</thead>
	<tr>
	
	<td>${rObj.rId}</td>
	<td>${rObj.rName}</td>
	<td>${rObj.rGender}</td>
	<td>${rObj.rEmail}</td>
	<td>${rObj.project.projectName}</td>
	<td>${rObj.rDOB}</td>

	</tr>
	
	</table>
	</div>
</body>
</html>