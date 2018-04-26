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
	<h1>FromActionContext Show!</h1>
	访问 ActionContext 中的数据时，必须加 # 号。<br/>
	<s:property value="#username"/><br/>
	<s:property value="#password"/><br/>
	<s:property value="#session.username"/><br/>
	<s:property value="#session.password"/><br/>
	<s:property value="#application.username"/><br/>
	<s:property value="#application.password"/><br/>
</body>
</html>