<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:debug></s:debug>
	<h1>Push Tag!</h1>
	<s:push value="user.group">
		集团编号：<s:property value="groupId"/><br/>
		集团名称：<s:property value="groupName"/><br/>
		集团领导：<s:property value="groupLeader"/><br/>
	</s:push>
</body>
</html>