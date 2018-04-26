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
	<h3>参数化消息文本</h3>
	<s:text name="paramtered.message1"/><br/>
	<s:text name="paramtered.message2">
		<s:param value="#local1"/>
		<s:param value="#local2"/>
	</s:text>
</body>
</html>