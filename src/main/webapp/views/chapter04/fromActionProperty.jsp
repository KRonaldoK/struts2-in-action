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
	<h1>FromActionProperty Show!</h1>
	由于 Action 对象被 Struts2 放置到了 ValueStack 的栈顶，访问 Acton 中的属性时，不需要加 # 号。<br/>
	<s:property value="username"/><br/>	
	<s:property value="password"/><br/>	
	<s:property value="user"/><br/>	
</body>
</html>