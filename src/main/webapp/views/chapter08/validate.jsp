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
	<s:form action="validate_addCustomer" method="post">
		<s:textfield label="客户编号：" name="customer.id"/>
		<s:textfield label="客户姓名：" name="customer.name"/><s:property value="fieldErrors.name"/>
		<s:textfield label="客户性别：" name="customer.sex"/>	<s:property value="errors.sex"/>
		<s:textfield label="客户年龄：" name="customer.age"/><s:fielderror fieldName="age"/>
		<s:textfield label="客户密码：" name="customer.password"/><s:fielderror fieldName="password"/>
		<s:textfield label="集团编号：" name="customer.group.groupId"/><s:fielderror fieldName="groupId"/>
		<s:textfield label="集团名称：" name="customer.group.groupName"/><s:fielderror fieldName="groupName"/>
		<s:textfield label="集团主席：" name="customer.group.groupLeader"/><s:fielderror fieldName="groupLeader"/>
		<s:submit value="注册"/>
	</s:form>
</body>
</html>