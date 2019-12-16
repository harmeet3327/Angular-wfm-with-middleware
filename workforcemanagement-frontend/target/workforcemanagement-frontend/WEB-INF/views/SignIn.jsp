<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign In</title>
</head>
<body>
		
		
		<hr/>
		
		<div align="center">
		<div>  ${msg} </div>
			<h1>Sign In Form</h1>
			
			<form action="login" method="post">
	<fieldset>
		<legend>Login Company</legend>
		<table>
			<tr>
				<td>Company Id : </td>
				<td><input type="text" name="rId"></td>
			</tr>
			<tr>
				<td> password : </td>
				<td><input type="text" name="rPassward"></td>
			</tr>
			<tr>
				<td></td>
				<td>
					<input type="submit" value="Login"/>
					
				</td>
			</tr>
		</table>
	</fieldset>
</form>
		</div>
		
	</body>
</html>