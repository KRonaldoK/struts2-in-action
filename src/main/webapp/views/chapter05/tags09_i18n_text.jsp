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
	<h1>I18n & Text Tag!</h1>
	<s:i18n name="MessageResources">
		<s:text name="username"/><br/>
		<s:text name="password"/><br/>
		<s:text name="group.groupId" var="groupId"/>
		<s:text name="group.groupName" var="groupName"/>
		<s:text name="group.groupLeader" var="groupLeader"/>
		<s:property value="#groupId"/><br/>
		<s:property value="#groupName"/><br/>
		<s:property value="#groupLeader"/><br/>	
	</s:i18n>
	
</body>
</html>