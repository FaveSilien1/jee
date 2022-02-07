<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello Struts 2 !</title>
</head>
<body>

<s:url var="indexEN" namespace="/" >
		<s:param name="request_locale">en</s:param>
	</s:url>
	<s:a href="%{indexEN}">English</s:a>

	<s:url var="indexFR" namespace="/" >
		<s:param name="request_locale">fr</s:param>
	</s:url>
	<s:a href="%{indexFR}">France</s:a>

<h2><s:property value="messageStore.message"/></h2>
<!-- <h2>Welcome !<s:property value="name"/></h2> -->
<h2><s:property value="personne"/></h2>
<h2><s:property value="getText('global.success')"/></h2>


	

</body>
</html>