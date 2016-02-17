<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*, java.io.*"%>
<%

Map map = request.getParameterMap();
Object[] keys = map.keySet().toArray();
%>
<html><head><title>Request Parameters</title></head><body>
Map size = <%=map.size()%>
<table border="1">
<tr><td>Map element</td><td>Par name</td><td>Par value[s]</td></tr>
<%
for (int k = 0; k < keys.length; k++) {
/*
 Т.О. массив pars будет содержать динамические параметры, передаваемые в
http://localhost:8080/tests/req_params.jsp?a=b&c=d&a=zzz&empty=&empty=&1=22
*/
String[] pars = request.getParameterValues((String)keys[k]);

//out.println("Печать тест "+pars[j]);

out.print("<tr><td>" + k + "</td><td>'" + keys[k] + "'</td><td>");
for (int j = 0; j < pars.length; j++) {
	
	
if (j > 0) out.print(", ");
out.print("'" + pars[j] + "'");

out.println("Печать тест "+pars[j]);
}
out.println("</td></tr>");
}
//Test
//out.println(keys[k]);
%>


<form action="Test2" method="POST">
<input type="submit" value="Servlet">
</form>
 
</table>
</body></html>