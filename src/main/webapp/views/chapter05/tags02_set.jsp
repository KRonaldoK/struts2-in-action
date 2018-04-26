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
	<h1>Set Tag!</h1>
	<s:set var="groupLeader1" value="user.group.groupLeader"/>
	<s:set var="groupLeader2" scope="request" value="groupLeader1"/>
	<s:set var="groupLeader3" scope="session" value="groupLeader1"/>
	<s:set var="groupLeader4" scope="application" value="groupLeader1"/>
	将对象放入 action 中：<s:property value="groupLeader1"/><br/>
	将对象放入 request 中：<s:property value="#request.groupLeader2"/><br/>
	将对象放入 session 中：<s:property value="#session.groupLeader3"/><br/>
	将对象放入 application 中：<s:property value="#application.groupLeader4"/><br/>
</body>
</html>