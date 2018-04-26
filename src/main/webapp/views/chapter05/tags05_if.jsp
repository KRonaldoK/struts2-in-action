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
	<h1>If Tag!</h1>
	<s:if test="#age lt 18"><h3>未成年</h3></s:if>
	<s:elseif test="#age gt 30"><h3>人妻</h3></s:elseif>
	<s:else><h3>少女</h3></s:else>
</body>
</html>