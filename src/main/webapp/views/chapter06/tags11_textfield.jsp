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
	<s:form action="formTags_textfieldTag" namespace="/chapter06" method="get" >
		<s:textfield name="ph.username" label="Username:" maxlength="20" size="24"/><br/>
		<s:password name="ph.password" label="Password:" readonly="true"/><br/>
		<s:textfield name="ph.url" label="Url:" maxlength="20" size="24"  type="url" readonly="false"/>
		<s:textfield name="ph.email" label="Email:" maxlength="20" size="24"  type="email"/>
		<s:submit value="登录"/>
	</s:form>
</body>
</html>