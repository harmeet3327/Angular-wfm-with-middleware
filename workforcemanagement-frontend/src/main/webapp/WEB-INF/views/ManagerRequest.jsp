<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> WFM</title>
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
<br/>
<div> ${msg} </div>
       <f:form action="managerReqSubmit" method="post" modelAttribute="reqObj">
             <div class="container">
              <table align="center" class="table table-striped">
                     <tr  class="form-group">
                           <td>
                                  <label class="form-check-label">PROJECT NAME</label>
                           </td>
                           <td>
                                   <input class="form-control" name="projectId" value="${rObj.project.projectId}"  readonly placeholder="${rObj.project.projectName}"/>
                           </td>
                     </tr>
                     <tr class="form-group">
                           <td>
                                  <label class="form-check-label">REQUIRED ROLE</label>
                           </td>
                           <td>
                                  <f:select path="rarRoleId" class="form-control">
                    <f:option value="0" label="NONE">-------Select Role-------------</f:option>
                           <f:options items="${rlist}" itemValue="roleId" itemLabel="roleType" />
                           
                                  </f:select>
                                  <div style="color:red;"><f:errors path="rarRoleId"></f:errors></div>
                           </td>
                     </tr>
                     <tr  class="form-group">
                     
                     
                           <td>
                                  <label class="form-check-label">REQUIRED EXPERIENCE(in years)</label>
                           </td>
                           <td>
                                  <f:input class="form-control"  type="number" path="reqRequiredExp"/>
                           <div style="color:red;"><f:errors path="reqRequiredExp"></f:errors></div>
                           </td>
                     </tr>
                     <tr  class="form-group">
                           <td>
                                  <label class="form-check-label">REQUIRED SKILL</label>
                           </td>
                           <td>
                                  <f:select path="reqSkills" class="form-control">
                    <f:option value="0" label="NONE">-------Select Skill-------------</f:option>
                           <f:options items="${slist}" itemValue="skillName" itemLabel="skillName" />
                                  </f:select>
						<div style="color:red;"><f:errors path="reqSkills"></f:errors></div>
                           </td>
                     </tr>
                     <tr  class="form-group">
                           <td>
                                  <label class="form-check-label">REQUEST START DATE</label>
                           </td>
                           <td>
                                  <f:input class="form-control"  type="date" path="reqProjStartDate"/>
                                                          <div style="color:red;"><f:errors path="reqProjStartDate"></f:errors></div>
                           </td>
                     </tr>
                     <tr  class="form-group">
                           <td>
                                  <label class="form-check-label">REQUEST END DATE</label>
                           </td>
                           <td>
                                  <f:input type="date" class="form-control" path="reqProjEndDate"/>
                                 <div style="color:red;"><f:errors path="reqProjEndDate"></f:errors></div>
                           </td>
                     </tr>
                     <tr  class="form-group">
                           <td>
                                  <label class="form-check-label">REMARKS</label>
                           </td>
                           <td>
                                  <f:textarea path="reqRemarks" rows="5" class="form-control" cols="30" />
							<div style="color:red;"><f:errors path="reqRemarks"></f:errors></div>
                           </td>
                     </tr>
                     <tr  class="form-group">
                           <td>
                           </td>
                           <td>
                                  <input type="submit" value="submit" id="btn" class="btn btn-primary"/>
                           </td>
                     </tr>
              </table>
              </div>
       </f:form>
</body>
</html>
