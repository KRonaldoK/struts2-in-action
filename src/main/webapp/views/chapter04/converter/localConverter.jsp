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
	<h1>Local Converter!</h1>
	<s:form action="converter_localConverter.action" namespace="/chapter04">
	<s:textfield name="date1" label="Date1(yyyy-MM-dd):"/>
	<s:textfield name="date2" label="Date2(yyyy/MM/dd):"/>
	<s:submit value="submit"/>
	</s:form>
</body>
</html>