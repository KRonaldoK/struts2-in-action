<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:debug></s:debug>
	<h1>Ognl Static!</h1>
	调用静态方法：
	<s:push value="@org.zxd.struts.common.model.ObjectFactory@getCQ()">
		<s:property value="username"/>——
		<s:property value="group.groupName"/>
	</s:push>
	<br/>	
	调用静态属性：
	<s:property value="@org.zxd.struts.common.model.ObjectFactory@Name"/>
</body>
</html>