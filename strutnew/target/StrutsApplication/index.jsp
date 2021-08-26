<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Struts 2 - Login Application | ViralPatel.net</title>
</head>

<body>
<h2>Struts 2 - Login Application</h2>
<s:actionerror />
<s:form action="dbInitialize">
	<s:submit method="execute" key="label.login" align="center" />
</s:form>
</body>
</html>