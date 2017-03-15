<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
<link rel="stylesheet" href="../css/all.css" type="text/css">  
<link rel="stylesheet" href="../css/select.css" type="text/css">  
<link rel="stylesheet" href="../css/user_model.css" type="text/css">
<script src="../js/user_model.js"></script>
 


</head>
<body>


<div class="logo">
	<img alt="logo" src="../img/logo.png">
</div>

<div class="model">
	<div class="select_box"> <font>></font> <span>云文档</span>
	    <ul>
	      <li>我的收藏</li>
	      <li>聊天记录</li>
	      <li>个人信息</li>
	    </ul>
	</div>
</div>

<div class="search"></div>

<div class="userInfo">
	<div class="userInfoHead"></div>
	<div class="userInfoName">${user.userName }</div>
	<div class="userInfoSet">set</div>
</div>

<br><br><br><br>

<hr style="height:4px;border:none;border-top:2px solid #555555;">


<div class="docTree">
	<table border="1" cellpadding="10" cellspacing="0">
		<tr>
			<td width="130px">名称</td>
			<td colspan="2"><center>操作</center></td>
		</tr>
		<c:forEach items="${folderList }" var="folder">
			<tr>
				<td>${folder.folderName }</td>
				<td>新建</td>
				<td>删除</td>
			</tr>
		</c:forEach>
	</table>

</div>
<div class="docGrid">
	<table border="1" cellpadding="10" cellspacing="0">
		<tr>
			<td width="300px">名称</td>
			<td width="80px">作者</td>
			<td width="80px">类型</td>
			<td width="130px">上传时间</td>
			<td colspan="3"><center>操作</center></td>
		</tr>
		<c:forEach items="${docList }" var="document">
			<tr>
				<td>${document.docName }</td>
				<td>${document.docAuthor.userName }</td>
				<td>${document.docType }</td>
				<td>${document.docCreatetime }</td>
				<td><a href="">预览</a></td>
				<td>下载</td>
				<td>删除</td>
			</tr>
		</c:forEach>
	</table>

</div>


</body>
</html>