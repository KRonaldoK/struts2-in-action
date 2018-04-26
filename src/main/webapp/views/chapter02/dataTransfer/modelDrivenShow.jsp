<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>ModelDriven Register Successfully!</h1>
		用户姓名：${username}<br /> 
		用户密码：${password}<br /> 
		授权凭证：${token}<br /> 
		是否激活：${isActive}<br />
		集团编号：${group.groupId}<br />
		集团名称：${group.groupName}<br />
		集团领导：${group.groupLeader}<br />
</body>
</html>