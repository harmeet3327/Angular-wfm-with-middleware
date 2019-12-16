<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center" bold>
		Welcome ${rObj.rName}
		
	</div>
	<hr/>
	
<div align="center">
	
		
		${msg}
		<h1>Users List</h1>
		
		<table border="1">
		<tr>
			<th>Request Id</th>
			<th>Project </th>
			<th>role</th>
			<th>Required Experience</th>
			<th>reqSkills </th>
			<th>reqProjStartDate</th>
			<th>reqProjEndDate </th>
			<th>reqRemarks </th>
		
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
				<td><a href="${path}/updateUser/${rL.reqId}">Find</a></td>
				
			</tr>
		</c:forEach>
		</table>
	</div>
	
	</table>
</body>
</html>