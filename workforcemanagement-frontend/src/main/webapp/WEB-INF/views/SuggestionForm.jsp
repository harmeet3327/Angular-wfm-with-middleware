<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
  <jsp:include page="AdminHeader.jsp"></jsp:include>
  <br/>
  <br/>
  <br/>
<h1 style="text-align: center;font-family: verdana;color: green">
              
              <c:set var="reqId" value="${reqId}" scope="page" /> 
              
                     </h1>
<div align="center" class="container" >
<div>.</div>
<h1>Suggestions For ${reqId} </h1>
	<c:choose >
<c:when test="${empty suggList }" >
<div><h3>No Suggestions Available</h3></div>
</c:when>
</c:choose>

     <table border="2" class="table table-striped">
                <tr>
                
                     <th>Resource Id</th>
                     <th>Name</th>
                     <th>Experience</th>
                    
                     <th>DOB</th>
                     <th>Gender</th>
                     <th>Skills</th>
                     <th>Status</th>
                   
                     <th>Role ID</th>
                     <th>Project ID</th>
                     <th>Suggest this Resource</th>
                     </tr>
<c:forEach items="${suggList}" var="suggList">
                     
                     <tr>
                           
                           <td>${suggList.rId}</td>
                           <td>${suggList.rName}</td>
                           <td>${suggList.rExperience}</td>

                           <td>${suggList.rDOB}</td>
                           <td>${suggList.rGender}</td>
                           <td>${suggList.rSkills}</td>
                           <td>${suggList.rStatus}</td>
                          
                           <td>${suggList.role.roleType}</td>
                           <td>${suggList.projectId}</td>
                           
                           <td><a href="${pageContext.request.contextPath}/addSuggestion/${suggList.rId}/${pageScope.reqId}"><button class="btn btn-primary">Suggest</button></a></td>
                           

       </tr>
       
              </c:forEach>
              </table>       
               </div>
</body>
</html>
