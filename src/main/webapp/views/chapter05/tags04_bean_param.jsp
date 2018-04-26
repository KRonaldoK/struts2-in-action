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
	<h1>Bean&Param Tag!</h1>
	<s:bean name="org.zxd.struts.common.model.User" var="userBean">
		<s:param name="username" value="猪八戒"/>
		<s:param name="password" value="111111"/>
		<s:param name="token" value="123"/>
		<s:param name="isActive" value="true"/>
	</s:bean>	
	<s:property value="userBean"/><br/>
	中文字符串无法直接设置到属性中？
</body>
</html>