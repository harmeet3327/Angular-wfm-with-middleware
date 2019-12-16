
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<f:form action="addRes" method="post" modelAttribute="rObj">
			<table>
				<tr>
					<td> Name : </td>
					<td><f:input path="rName" /></td>
				</tr>
					<tr>
					<td>Experience : </td>
					<td><f:input path="rExperience" /></td>
					</tr>
				                                  <tr>
                                  <td>Role : </td>
                                  <td>
                    <f:select path="roleId" >
                    <f:option value="0" label="Select"  />
                    <f:options items="${rlist}" itemValue="roleId" itemLabel="roleType" />
                    </f:select>
       
                           
                                  </td>
                           </tr>

				<tr>
					<td>Password : </td>
					<td><f:password path="rPassward" value="T123"  /></td>
				</tr>
				                           <tr>
                                  <td>Marital Status : </td>
                                  
                           <td>
            <f:radiobutton path="rMaritalStatus" value="UNMARRIED" label="UnMarried" /> 
            <f:radiobutton path="rMaritalStatus" value="MARRIED" label="Married" />
            </td>
                                  
                           </tr>
				
				<tr>
					<td>Email : </td>
					<td><f:input path="rEmail"/></td>
				</tr>
				<tr>
					<td>Date of Birth  : </td>
					<td><f:input type="date" path="rDOB"/></td>
				</tr>
					<tr>
					<td>Select Gender  : </td>
					<td><f:radiobutton  path="rGender" value="male" />male</td>
					<td><f:radiobutton  path="rGender" value="female" />female</td>
					<td><f:radiobutton  path="rGender" value="Others" />Others</td>
				</tr>
					<tr>
					<td>Phone no : </td>
					<td><f:input type="number" path="rPhoneNumber"/></td>
				</tr>
					                           <tr>
                                  <td>Skills : </td>
                                  <td><f:checkboxes path="rSkills" items="${slist}" itemValue="skillName" itemLabel="skillName" />
                           
                                  </td>
                           </tr>

				
				<tr><td><input type="submit" value="submit" /></td></tr>
				
				
				
		</table>
		</f:form>
</body>
</html>