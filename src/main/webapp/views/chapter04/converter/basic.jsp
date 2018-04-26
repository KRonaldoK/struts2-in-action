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
	<h1>Basic Type!</h1>
	<s:form action="type_submitBasic" namespace="/chapter04">
	<s:textfield name="username" label="username"/>
	<s:textfield name="age1" label="age1:"/>
	<s:textfield name="age2" label="age2:"/>
	<s:textfield name="salary1" label="salary1:"/>
	<s:textfield name="salary2" label="salary2:"/>
	<s:textfield name="sex1" label="sex1:"/>
	<s:textfield name="sex2" label="sex2:"/>
	<s:submit value="submit"/>
	</s:form>
</body>
</html>