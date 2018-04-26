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
	<h1>List Type!</h1>
	<s:form action="type_submitList" namespace="/chapter04">
	注意：当不指定下标时，回传回来的对象是整个列表，而不是列表中的某个元素。<br/>
	<s:textfield name="nameList" label="nameList:"/>
	<s:textfield name="nameList" label="nameList:"/>
	
	<s:textfield name="salaryList[0]" label="salaryList:"/>
	<s:textfield name="salaryList[1]" label="salaryList:"/>
	<s:submit value="submit"/>
	</s:form>
</body>
</html>