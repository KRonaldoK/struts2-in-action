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
	<h1>Ognl Shadow!</h1>
	通过 Ognl 对集合进行投影（获取指定的列）。<br/>
	<s:iterator value="#points.{x + ',' + y}" var="p">
		Point：<s:property value="#p"/><br/>
	</s:iterator>
	
	过滤和投影可以联合使用：<br/>
	<s:iterator value="#points.{? #this.x==5}.{x + ',' + y}" var="p">
		Point：<s:property value="#p"/><br/>
	</s:iterator>
</body>
</html>