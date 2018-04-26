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
	<s:form action="i18n_addCustomer" method="post">
		<s:textfield key="customer.id"/>
		<s:textfield key="customer.name"/>
		<s:textfield key="customer.sex"/>	
		<s:textfield key="customer.age"/>
		<s:textfield key="customer.password"/>
		<s:textfield key="customer.group.groupId"/>
		<s:textfield key="customer.group.groupName"/>
		<s:textfield key="customer.group.groupLeader"/>
		<s:submit value="注册"/>
	</s:form>
</body>
</html>