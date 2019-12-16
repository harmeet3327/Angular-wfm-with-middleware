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
<jsp:include page="ManagerHeader.jsp"></jsp:include>
<br/>
<br/>
<br/>
<h1 style="text-align: center;font-family: verdana;color: green">
              
       
                     </h1>
<div align="center">
<h1>Suggestions for RequestId : ${reqId}</h1>

<<c:choose >
<c:when test="${empty resList  }" >
<div><h3>No suggestions For this request</h3></div>
</c:when>
</c:choose>

    <div class="container">

               <table border="2" class="table table-striped">
                <tr>
                
                 <th>Resource  Id</th>
                     <th>Resource Name</th>
                     <th>resource Role</th>
                     <th>Lock</th>
                 
                    
                     </tr>
<c:forEach items="${resList}" var="resList">
                     
                     <tr>
                           
                           <td>${resList.rId}</td>
                           <td>${resList.rName}</td>
                          <td>${resList.role.roleType}</td>
                         
                           
                           <td><a href="${pageContext.request.contextPath}/lockSuggestion/${reqId}/${resList.rId}"><button class="btn btn-primary">Lock</button></a></td>
                           

       </tr>
       
              </c:forEach>
              </table>
              </div>
              </div>
</body>
</html>
