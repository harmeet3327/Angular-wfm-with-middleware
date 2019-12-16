<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
  <style>
  body
  {
  background-color:lightgray;
  }
  #container
  {
  background-color: white;
  }
  </style>
<title>WFM</title>
</head>
<body>
<jsp:include page="AdminHeader.jsp"></jsp:include>
<br/>
<br/>
<br/>
<br/>

<div class="container" id="container">
					<div align="center"><h3><b>Add Resource Details</b></h3></div>
	<f:form action="addRes" method="post" modelAttribute="rObj">
			<table class="table table-striped">
				<tr class="form-group">
					<td> Name : </td>
					<td><f:input class="form-control" path="rName" />
					<div style="color:red;"><f:errors path="rName" ></f:errors></div>
					</td>
				</tr>	
				<tr class="form-group">
					<td>Experience : </td>
					<td><f:input class="form-control" path="rExperience" />
					<div style="color:red;"><f:errors path="rExperience" ></f:errors></div>
					</td>
				</tr>
				<tr class="form-group">
                    <td>Role : </td>
					<td>
                    <f:select path="roleId" class="form-control" >
                    <f:option value="0" label="Select"  />
                    <f:options items="${rlist}" itemValue="roleId" itemLabel="roleType" />
                    </f:select>           
                    <div style="color:red;"><f:errors path="roleId"></f:errors></div>
                    </td>
                </tr>
				<tr class="form-group">
					<td>Password : </td>
					<td><f:password class="form-control" path="rPassward" value="T123"   />
					
					</td>
				</tr>
				<tr class="form-group">
					<td>Marital Status : </td>             
                    <td>
            			<f:radiobutton path="rMaritalStatus" value="UNMARRIED" label="UnMarried" /> 
            			<f:radiobutton path="rMaritalStatus" value="MARRIED" label="Married" />
            			<div style="color:red;"><f:errors path="rMaritalStatus"></f:errors></div>
            		</td>         
				 </tr>
				<tr class="form-group">
					<td>Email : </td>
					<td><f:input path="rEmail" class="form-control"/>
					<div style="color:red;"><f:errors path="rEmail"></f:errors></div></td>
				</tr>
				<tr class="form-group">
					<td>Date of Birth  : </td>
					<td><f:input type="date" path="rDOB" class="form-control" />
					<div style="color:red;"><f:errors path="rDOB"></f:errors></div>
					</td>
				</tr>
				<tr class="form-group">
					<td>Select Gender  : </td>
					<td><f:radiobutton  path="rGender" value="male" />male
					<f:radiobutton  path="rGender" value="female" />female
					<f:radiobutton  path="rGender" value="Others" />Others
					<div style="color:red;"><f:errors path="rGender"></f:errors></div>
					</td>
				</tr>
				<tr class="form-group">
					<td>Phone no : </td>
					<td><f:input type="number" path="rPhoneNumber" class="form-control"/>
					<div style="color:red;"><f:errors path="rPhoneNumber"></f:errors></div>
					</td>
				</tr>
				<tr class="form-group">
					<td>Skills : </td>
	                <td><f:checkboxes path="rSkills"   items="${slist}" itemValue="skillName" itemLabel="skillName" />                    
					<div style="color:red;"><f:errors path="rSkills"></f:errors></div>
					</td>
                </tr>
                
				<tr><td></td><td><input type="submit" value="submit" class="btn btn-primary"/></td></tr>
				
				
				
		</table>
		</f:form>
		</div>
</body>
</html>