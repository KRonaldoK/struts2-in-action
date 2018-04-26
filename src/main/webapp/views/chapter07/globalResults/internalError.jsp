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
	<h1>发生了内部错误，请联系管理员！</h1>
	错误信息：<s:property value="exception.message"/>	<br/>
	<s:property value="exceptionStack"/>
</body>
</html>