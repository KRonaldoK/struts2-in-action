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
	<h1>Map Type!</h1>
	<s:form action="type_submitMap" namespace="/chapter04">
	<s:textfield name="nameMap.zxd" label="nameMap:"/>
	<s:textfield name="nameMap.kristy" label="nameMap:"/>
	<s:textfield name="salaryMap['key1']" label="salaryMap:"/>
	<s:textfield name="salaryMap['key2']" label="salaryMap:"/>
	<s:submit value="submit"/>
	</s:form>
</body>
</html>