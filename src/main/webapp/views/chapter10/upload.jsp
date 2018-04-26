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
	<h3>单个文件上传</h3>
	<s:property value="#message"/><br/>
	<s:form action="others_Upload_upload" enctype="multipart/form-data">
		<s:file name="upload" label="选择文件"/>
		<s:submit value="上传"/>
	</s:form>
</body>
</html>