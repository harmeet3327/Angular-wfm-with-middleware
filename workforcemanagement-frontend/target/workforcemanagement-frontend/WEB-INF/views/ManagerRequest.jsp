<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> RAISE REQUEST FORM</title>
</head>
<body>
<div> ${msg} </div>
       <f:form action="managerReqSubmit" method="post" modelAttribute="reqObj">
              <table>
                     <tr>
                           <td>
                                  PROJECT NAME
                           </td>
                           <td>
                                   <input name="projectId" value="${rObj.project.projectId}"  />${rObj.project.projectName}
                           </td>
                     </tr>
                     <tr>
                           <td>
                                  REQUIRED ROLE
                           </td>
                           <td>
                                  <f:select path="rarRoleId">
                    <f:option value="0" label="NONE">-------Select Role-------------</f:option>
                           <f:options items="${rlist}" itemValue="roleId" itemLabel="roleType" />
                                  </f:select>
                           </td>
                     </tr>
                     <tr>
                           <td>
                                  REQUIRED EXPERIENCE(in years)
                           </td>
                           <td>
                                  <f:input type="number" path="reqRequiredExp"/>
                           </td>
                     </tr>
                     <tr>
                           <td>
                                  REQUIRED SKILL
                           </td>
                           <td>
                                  <f:select path="reqSkills">
                    <f:option value="0" label="NONE">-------Select Skill-------------</f:option>
                           <f:options items="${slist}" itemValue="skillId" itemLabel="skillName" />
                                  </f:select>
                           </td>
                     </tr>
                     <tr>
                           <td>
                                  REQUEST START DATE
                           </td>
                           <td>
                                  <f:input type="date" path="reqProjStartDate"/>
                           </td>
                     </tr>
                     <tr>
                           <td>
                                  REQUEST END DATE
                           </td>
                           <td>
                                  <f:input type="date" path="reqProjEndDate"/>
                           </td>
                     </tr>
                     <tr>
                           <td>
                                  REMARKS
                           </td>
                           <td>
                                  <f:textarea path="reqRemarks" rows="5" cols="30" />
                           </td>
                     </tr>
                     <tr>
                           <td>
                           </td>
                           <td>
                                  <input type="submit" value="submit" id="btn"/>
                           </td>
                     </tr>
              </table>
       </f:form>
</body>
</html>
