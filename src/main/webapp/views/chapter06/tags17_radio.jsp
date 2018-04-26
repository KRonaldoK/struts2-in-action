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
	生成动作的规则：<br/>
	1）如果没有指定 action 属性，则会重新指向生成当前页面的动作。<br/>
	2）如果指定了 action 属性，它首先被当做 Struts 动作解析，如果没有声明 namespace 属性，那么它会在当前请求的命名
	空间中查找。如果指定了 namespace 属性，那么 Struts 会在指定的命名空间中查找。<br/>
	3）如果 action 属性中指定的值不是声明性架构中 Struts 的动作，那么这个值会被用来直接构建 URL。
	如果指定的值以 / 开头，它会被假定与 ServletContext 相关，框架会在它之前添加 ServletContext 的路径构建一个
	Url。如果指定的值没有以 / 开头，那么该值会被直接当做 Url 解析。<br/>
	<hr/>
	<s:form action="formTags_radioTag" namespace="/chapter06" method="get" >
		<s:radio lable="选择珍品" name="ph.tonic" list="#tonics" listKey="key" listValue="value"/>
		<s:radio label="选择家乡" name="ph.hometown" list="#hometownMap" listKey="key" listValue="value"/>
		<s:radio label="选择爱好" name="ph.hoppy" list="#hoppies" listKey="key" listValue="value"/>
		<s:submit value="登录"/>
	</s:form>
</body>
</html>