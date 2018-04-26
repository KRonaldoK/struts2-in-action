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
	<h3>访问国际化资源文件的三种方式：</h3>
	<h4>1）通过 Struts 表单标签的 key 属性访问：</h4><s:textfield key="customer.id"/>
	<h4>2）通过 text 标签访问：</h4><s:text name="customer.id"/>
	<h4>3）通过 Ognl 调用 getText() 方法访问</h4><s:property value="getText('customer.id')"/>
</body>
</html>