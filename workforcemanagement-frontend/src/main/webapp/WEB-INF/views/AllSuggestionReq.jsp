
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WFM</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>

<jsp:include page="ManagerHeader.jsp"></jsp:include>
<br/>
<br/>
<br/>
<div align="center" bold>
		Welcome ${rObj.rName}
		
	</div>
	<hr/>
	
<div align="center">
<c:choose >
<c:when test="${empty reqList  }" >
<div><h3>No Suggested Request </h3></div>
</c:when>
<c:otherwise>
	
		
		${msg}
		<h1> Suggested Request List</h1>
		<div class="container">
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
			<th> Suggest</th>
		
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
				<td><a href="${pageContext.request.contextPath}/suggestionByAdmin/${rL.reqId}"><button class="btn btn-primary">See Suggestions</button></a></td>
				
			</tr>
		</c:forEach>
		</table>
		</div>
		</c:otherwise>
</c:choose>
	</div>

	</table>
</body>
</html>