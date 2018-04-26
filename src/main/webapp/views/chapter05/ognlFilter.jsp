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
	<h1>Ognl Filter!</h1>
	通过 Ognl 对集合进行过滤（格式是固定的），#this 表示集合中当前进行过滤的对象。
	对 #points 键映射的集合进行过滤，过滤出对象的 x 属性大于 2 并且小于 6 的所有元素。<br/>
	<s:iterator value="#points.{? #this.x>2 && #this.x<6}">
		Point：<s:property value="x" />
		，<s:property value="y" /><br/>
	</s:iterator>

</body>
</html>