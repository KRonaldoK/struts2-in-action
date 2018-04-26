<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>User Register Now!</h1>
	<form action="dataTransfer_JavaBean_register.action">
		用户姓名：<input name="user.username" type="text"><br /> 
		用户密码：<input name="user.password" type="text"><br /> 
		授权凭证：<input name="user.token" type="text"><br /> 
		是否激活：<input name="user.isActive" type="text"><br />
		集团编号：<input name="user.group.groupId" type="text"><br />
		集团名称：<input name="user.group.groupName" type="text"><br />
		集团领导：<input name="user.group.groupLeader" type="text"><br />
		<input type="submit" value="申请">
	</form>
</body>
</html>