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
	<h1>Iterator Tag!</h1>
	<s:iterator var="g" value="#groups" status="s" begin="0" end="#groups.size()-2" step="1">
		<s:push value="#g">
			当前迭代的集团编号：<s:property value="groupId"/>——
			当前迭代的集团名称：<s:property value="groupName"/>——
			当前迭代的集团领导：<s:property value="groupLeader"/>——
			<s:push value="#s">
			当前已经迭代了几个对象，从 1 开始：<s:property value="count"/>——
			当前对象在集合中的索引：<s:property value="index"/>——
			是否是第一个对象：<s:property value="first"/>——
			是否是最后一个对象：<s:property value="last"/>——
			索引是否是奇数：<s:property value="odd"/>——
			索引是否是偶数：<s:property value="even"/><br/>
			</s:push>
		</s:push>
	</s:iterator><br/>
	
	使用 s:iterator 迭代 Map<br/>
	<s:iterator value="#nameMap">
		Key：<s:property value="key"/>——
		Value：<s:property value="value"/><br/>
	</s:iterator>
</body>
</html>