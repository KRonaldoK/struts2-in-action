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
	<h1>FromServleAPI Show!</h1>
	由于 ServletAPI 是被放置在 ActionContext 中的，所以访问 request，session，application 时，需要加 # 号。<br/>
	Request 中的属性值：<s:property value="#request.username"/><br/>
	Request 中的属性值：<s:property value="#request.password"/><br/>
	Session 中的属性值：<s:property value="#session.username"/><br/>
	Session 中的属性值：<s:property value="#session.password"/><br/>
	Application 中的属性值：<s:property value="#application.username"/><br/>
	Application 中的属性值：<s:property value="#application.password"/><br/>
</body>
</html>