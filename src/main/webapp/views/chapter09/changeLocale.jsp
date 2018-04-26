<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:debug></s:debug>
	<s:select list="#localeMap" listKey="key" listValue="value"
		key="select.language" id="requestLocale" value="locale" /><br/>
	<s:a href="i18n_addCustomer"><s:text name="customer.add"/></s:a><br/>
	<s:a href="i18n_visitorMessages"><s:text name="visitorMessages"/></s:a><br/>
	<s:a href="i18n_showResources"><s:text name="showResources"/></s:a><br/>
	<s:a href="i18n_parameteredMessage"><s:text name="parameteredMessage"/></s:a><br/>
	
<script type="text/javascript" src="${ctx}/views/chapter09/jquery-3.0.0.js"></script>		
<script type="text/javascript" src="${ctx}/views/chapter09/changeLocale.js"></script>		
</body>
</html>