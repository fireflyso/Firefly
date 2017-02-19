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
		<h2>Login For Admin</h2>
		<hr style="height:4px;border:none;border-top:2px solid #555555;">
		<br><br>
		<form action="adminLogin">
			<table border="1" cellpadding="10" cellspacing="0">
				<tr>
					<td>username:</td>
					<td><input type="text" name="userName"></td>
				</tr>
				<tr>
					<td>password:</td>
					<td><input type="password" name="userPassword"></td>
				</tr>
				<tr>
					<td><input type="submit" vaule="login"></td>
					<td>
						<input type="reset" vaule="reset">
					</td>
				</tr>
			</table>
		</form>
		<br><br>
		<font color="red" >${msg }</font>
	</center>
	
</body>
</html>