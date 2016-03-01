<%--
  Created by IntelliJ IDEA.
  User: AroraA
  Date: 16-02-2016
  Time: 08:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>

      </title>
  </head>
  <body>
  <form action="EmailServlet" method="GET">
      <input type="submit" value="SEND MAIL">
  </form>
  <form action="FileUpload" method="post" enctype="multipart/form-data">
      Select File:<input type="file" name="fname"/><br/>
      <input type="submit" value="upload"/>
  </form>
  </body>
</html>
