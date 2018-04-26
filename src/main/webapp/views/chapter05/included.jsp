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
	<h3>被包含的页面</h3>
	使用 s:iterator 迭代 Map<br/>
	<s:iterator value="#nameMap">
		Key：<s:property value="key"/>——
		Value：<s:property value="value"/><br/>
	</s:iterator>
</body>
</html>