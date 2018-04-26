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
	<s:form action="xmlValidate_add" method="post">
		<s:textfield label="用户 ID：" name="vh.userId"/>
		<s:textfield label="用户密码：" name="vh.password"/>
		<s:textfield label="确认密码：" name="vh.confirmPassword"/>	
		<s:textfield label="用户年龄：" name="vh.age"/>
		<s:textfield label="用户薪资：" name="vh.salary"/>
		<s:textfield label="用户生日：" name="vh.birth"/>
		<s:textfield label="个人邮箱：" name="vh.email"/>
		<s:textfield label="个人网址：" name="vh.webSite"/>
		<s:textfield label="授权码：" name="vh.token"/>
		<s:submit value="注册"/>
	</s:form>
</body>
</html>