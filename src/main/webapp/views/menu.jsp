<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath }"></c:set>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>导航菜单</h1>
	<ol>
		<li>chapter01
			<ol>
				<li><a href="${ctx}/chapter01/hello.action">HelloStruts</a></li>
			</ol>
		</li>

		<li>chapter02
			<ol>
				<li><a href="${ctx}/chapter02/addUser.action">addUser</a> <a
					href="${ctx}/chapter02/updateUser.action">updateUser</a> <a
					href="${ctx}/chapter02/deleteUser.action">deleteUser</a></li>
				<li><a href="${ctx}/chapter02/roleAction!addRole.action">addRole</a>
					<a href="${ctx}/chapter02/roleAction?method:updateRole">updateRole</a>
					<a href="${ctx}/chapter02/roleAction!deleteRole.action">deleteRole</a></li>
				<li><a href="${ctx}/chapter02/wild_Resource_addResource.action">addResource</a>
					<a href="${ctx}/chapter02/wild_Resource_updateResource.action">updateResource</a>
					<a href="${ctx}/chapter02/wild_Resource_deleteResource.action">deleteResource</a>
				</li>
				<li><a
					href="${ctx}/chapter02/dataTransfer_ParamInject_inject.action">ParamInject</a>
					<a href="${ctx}/chapter02/dataTransfer_Property_execute.action">PropertyInject</a>
					<a href="${ctx}/chapter02/dataTransfer_JavaBean_execute.action">JavaBeanInject</a>
					<a href="${ctx}/chapter02/dataTransfer_ModelDriven_execute.action">ModelDrivenInject</a>
				</li>
			</ol>
		</li>

		<li>chapter03
			<ol>
				<li><a href="${ctx}/chapter03/interceptor_show.action">InterceptorShow</a></li>
				<li><a href="${ctx}/chapter03/interceptor_login.action">InterceptorLogin</a></li>
			</ol>
		</li>

		<li>chapter04
			<ol>
				<li><a href="${ctx}/chapter04/ognl_fromActionProperty.action">fromActionProperty</a>
					<a href="${ctx}/chapter04/ognl_fromActionContext.action">fromActionContext</a>
					<a href="${ctx}/chapter04/ognl_fromServletAPI.action">fromServletAPI</a>
					<a href="${ctx}/chapter04/ognl_fromValueStack.action">fromValueStack</a></li>
				<li><a href="${ctx}/chapter04/type_basic.action">BasicType</a>
					<a href="${ctx}/chapter04/type_array.action">ArrayType</a> <a
					href="${ctx}/chapter04/type_list.action">ListType</a> <a
					href="${ctx}/chapter04/type_map.action">MapType</a></li>
				<li><a href="${ctx}/chapter04/converter_localConverter.action">SelfLocalConverter</a>
					<a href="${ctx}/chapter04/converter_globalConverter.action">SelfGlobalConverter</a></li>
			</ol>
		</li>

		<li>chapter05
			<ol>
				<li><a href="${ctx}/chapter05/tags_propertyTag.action">property</a>
					<a href="${ctx}/chapter05/tags_setTag.action">set</a> <a
					href="${ctx}/chapter05/tags_pushTag.action">push</a> <a
					href="${ctx}/chapter05/tags_beanParamTag.action">bean & param</a></li>
				<li><a href="${ctx}/chapter05/tags_ifTag.action">if-elseif-else</a>
					<a href="${ctx}/chapter05/tags_iteratorTag.action">iterator</a></li>
				<li><a href="${ctx}/chapter05/tags_includeTag.action">include</a>
					<a href="${ctx}/chapter05/tags_urlTag.action">url</a> <a
					href="${ctx}/chapter05/tags_i18nTextTag.action">i18n & text</a></li>
				<li><a href="${ctx}/chapter05/ognl_filter.action">Ognl
						Filter</a> <a href="${ctx}/chapter05/ognl_shadow.action">Ognl
						Shadow</a> <a href="${ctx}/chapter05/ognl_ognlStatic.action">Ognl
						Static</a></li>
			</ol>
		</li>

		<li>chapter06
			<ol>
				<li><a href="${ctx}/chapter06/formTags_formTag.action">form</a>
					<a href="${ctx}/chapter06/formTags_textfieldTag.action">textfield</a>
					<a href="${ctx}/chapter06/formTags_passwordTag.action">password</a>
					<a href="${ctx}/chapter06/formTags_textareaTag.action">textarea</a>
					<a href="${ctx}/chapter06/formTags_checkboxTag.action">checkbox</a>
					<a href="${ctx}/chapter06/formTags_hiddenTag.action">hidden</a></li>
				<li><a href="${ctx}/chapter06/formTags_selectTag.action">select</a>
					<a href="${ctx}/chapter06/formTags_radioTag.action">radio</a> <a
					href="${ctx}/chapter06/formTags_checkboxlistTag.action">checkboxlist</a>
				</li>

				<li><a href="${ctx}/chapter06/formTags_labelTag.action">label</a>
					<a href="${ctx}/chapter06/formTags_dateTag.action">date</a></li>
			</ol>
		</li>

		<li>chapter07
			<ol>
				<li><a href="${ctx}/chapter07/dispatcher.action">dispatcher</a>
					<a href="${ctx}/chapter07/relative.action">relative redirect</a> <a
					href="${ctx}/chapter07/absolute.action">absolute redirect</a> <a
					href="${ctx}/chapter07/redirectAction.action">redirectAction</a> <a
					href="${ctx}/chapter07/velocity.action">velocity</a> <a
					href="${ctx}/chapter07/freemarker.action">freemarker</a> <a
					href="${ctx}/chapter07/selfJson.action">selfJson</a></li>
				<li><a href="${ctx}/chapter07/exception_internalError.action">internalError</a>
					<a href="${ctx}/chapter07/exception_unAuthorizedError.action">unAuthorizedError</a>
					<a href="${ctx}/chapter07/exception_unhandledError.action">unhandledError</a>
				</li>
			</ol>
		</li>

		<li>chapter08
			<ol>
				<li><a href="${ctx}/chapter08/validate_input.action">Validatable</a>
					<a href="${ctx}/chapter08/xmlValidate_input.action">Xml
						Validation</a> <a
					href="${ctx}/chapter08/visitorXmlValidate_input.action">Visitor
						Validation</a></li>
			</ol>
		</li>
		
		<li>chapter09
			<ol>
				<a href="${ctx}/chapter09/i18n_changeLocale.action">Change Locale</a>
			</ol>
		</li>
		
		<li>chapter10
			<ol>
				<a href="${ctx}/chapter10/others_Upload_toUpload.action">Single FileUpload</a>
				<a href="${ctx}/chapter10/others_BatchUpload_toUpload.action">Batch FileUpload</a>
				<a href="${ctx}/chapter10/others_Download_download.action?fileName=struts-2.5.5-all.7z">File Download</a>
				<a href="${ctx}/chapter10/download.action">Struts File Download</a>
			</ol>
		</li>
	</ol>
</body>
</html>