<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h3>add User page</h3>
		<hr style="height:4px;border:none;border-top:2px solid #555555;">
		<br>
		<td><a href="adminMainPage">放弃添加</a></td>
		<br><br>
		<form action="addUser">
			<table border="1" cellpadding="10" cellspacing="0">
				<tr>
					<td>userId</td>
					<td><input type="text" name="userId"></td>
				</tr>
				<tr>
					<td>userName</td>
					<td><input type="text" name="userName"></td>
				</tr>
				<tr>
					<td>userPassword</td>
					<td><input type="text" name="userPassword"></td>
				</tr>
				<tr>
					<td>userAge</td>
					<td><input type="text" name="userAge"></td>
				</tr>
				<tr>
					<td>userGender</td>
					<td><input type="text" name="userGender"></td>
				</tr>
				<tr>
					<td>userPhoto</td>
					<td><input type="text" name=""></td>
				</tr>
				<tr>
					<td>userAdmin</td>
					<td><input type="text" name="userAdmin"></td>
				</tr>
				<tr>
					<td>userActive</td>
					<td><input type="text" name="userActive"></td>
				</tr>
				<tr>
					<td colspan="2"><center><input type="submit" value="添加"></center></td>
					
				</tr>
			</table>	
		</form>
	</center>
</body>
</html>