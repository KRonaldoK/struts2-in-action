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
	<h1>Property Tag!</h1>
	从 ValueStack 中获取：<s:property value="user" /><br/>
	从 ActionContext 中获取：<s:property value="#user" /><br/>
	从 ServletAPI 中获取<s:property value="#request.user" /><br/>
	不存在的属性：<s:property value="notExisted" default="不存在的属性"/>
</body>
</html>