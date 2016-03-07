<%--
  Created by IntelliJ IDEA.
  User: AroraA
  Date: 06-03-2016
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String name = request.getParameter("uname");
    out.print("welcome " + name);
%>
</body>
</html>
