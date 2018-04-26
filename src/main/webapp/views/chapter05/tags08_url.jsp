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
	<h1>Url Tag!</h1>
	<s:url action="tags_showTags" encode="true" includeContext="true" includeParams="get" method="post" namespace="/chapter05">
		<s:param name="name" value="kristy"/>
		<s:param name="age" value="27"/>
	</s:url><br/>：无法导出值为字符串的参数，可以导出值为数字的参数？
	
</body>
</html>