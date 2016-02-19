<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<jsp:useBean id="itemBean" scope="request" class="test.Test" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>
</head>
<body> 

<!--http://www.java2ee.ru/jsp/actions.html  -->

<jsp:getProperty name="itemBean" property="flag1">



</body>
</html>