<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Form Login</h1>
<html:form action="/hello">
	Name:<html:text property="userName"></html:text>
	Pass:<html:text property="password"></html:text>
	<html:submit value="Login"></html:submit>
</html:form>

<!--<html:link action="/hello">Demo</html:link>-->
</body>
</html>