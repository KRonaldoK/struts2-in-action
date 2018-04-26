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
	<h1>Array Type!</h1>
	<s:form action="type_submitArray" namespace="/chapter04">
	注意：当不指定下标时，回传回来的对象是整个数组，而不是数组中的某个元素。
	<s:textfield name="nameArray" label="nameArray:"/>
	<s:textfield name="nameArray" label="nameArray:"/>
	<s:textfield name="salaryArray[0]" label="salaryArray:"/>
	<s:textfield name="salaryArray[1]" label="salaryArray:"/>
	<s:submit value="submit"/>
	</s:form>
</body>
</html>