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
	<h1>FromValueStack Show!</h1>
	访问 ValueStack 中的对象不需要加 # 号，如果想要访问指定栈位置的元素时，可以通过 #root[index] 的方式访问。<br/>
	Struts2 默认会从栈顶的元素开始寻找，一旦找到就会直接返回属性值，<br/>
	如果在当前对象中没有找到指定的属性，就会往栈底的方向一直寻找，直到找到指定的元素或到达栈底为止。<br/>
	<s:property value="group.groupName"/><br/>
	<s:property value="#root[0].group.groupName"/><br/>
	<s:property value="#root[1].group.groupName"/><br/>
	<s:property value="username"/><br/>
	<s:property value="#root[2].username"/><br/>
</body>
</html>