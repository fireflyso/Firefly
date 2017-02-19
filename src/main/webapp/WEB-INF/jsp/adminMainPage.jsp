<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h3>User Manager</h3>
		<br>
		<h3>welcome ${admin.userName }</h3>
		<hr style="height:4px;border:none;border-top:2px solid #555555;">
		<br>
		<a href="addUserPage" style="font-size: 20px;font-family: 楷体;">添加新用户</a>
		<br><br>
		<table border="1" cellpadding="10" cellspacing="0">
			<tr>
				<td>ID</td>
				<td>name</td>
				<td>password</td>
				<td>age</td>
				<td>gender</td>
				<td>admin</td>
				<td>active</td>
				<td colspan="2">set</td>
			</tr>
			<c:forEach items="${userList }" var="user">  
				<tr>
					<td>${user.userId }</td>
					<td>${user.userName }</td>
					<td>${user.userPassword }</td>
					<td>${user.userAge }</td>
					<td>${user.userGender }</td>
					<td>${user.userAdmin }</td>
					<td>${user.userActive }</td>
					<td><a href="">修改</a></td>
					<td><a href="activeUser?userId=${user.userId }&userActive=${user.userActive }">
						<c:if test="${user.userActive == '01' }">注销</c:if>	
						<c:if test="${user.userActive == '00' }">激活</c:if>	
						</a>
					</td>
				</tr>
    		</c:forEach>
		</table>
	</center>
</body>
</html>