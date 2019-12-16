<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
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
	

	<table  border='1'>
	<th>Id</th>
	<th>Name</th>
	<th>Gender</th>
	<th>Email</th>
	<th>Birthday</th>

	<tr>
	<td>${robj.rId}</td>
	<td>${rObj.rName}</td>
	<td>${rObj.rGender}</td>
	<td>${rObj.rEmail}</td>
	<td>${rObj.rDOB}</td>

	</tr>
	
	</table>
</body>
</html>