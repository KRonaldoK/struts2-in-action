<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>User Register Successfully!</h1>
		用户姓名：${user.username}<br/>
		用户密码：${user.password}<br/>
		授权凭证：${user.token}<br/>
		是否激活：${user.isActive}<br/>
		集团编号：${user.group.groupId}<br/>
		集团名称：${user.group.groupName}<br/>
		集团领导：${user.group.groupLeader}<br/>
</body>
</html>