<%@ page import="com.oreilly.servlet.MultipartRequest" %><%--
  Created by IntelliJ IDEA.
  User: AroraA
  Date: 16-02-2016
  Time: 08:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<html>
  <head>
      <title>
          <script>

          </script>

      </title>

  </head>
  <body>
  <form action="EmailServlet" method="GET">
      <input type="submit" value="SEND MAIL">
  </form>

  <form action="BiometricServlet" method="post" enctype="multipart/form-data">
      <input type="file" name="biometricFile"/><br/>
      <input type="submit" value="Upload Biometric Excel" onchange="checkFileExists()"/>
  </form>

  <form action="SalesforceServlet" method="post" enctype="multipart/form-data">
      <input type="file" name="salesforceFile"/><br/>
      <input type="submit" value="Upload Salesforce Excel" />
  </form>
  <form action="EmailListServlet" method="post" enctype="multipart/form-data">
      <input type="file" name="emailListFile"/><br/>
      <input type="submit" value="Upload Email Excel" />
  </form>
  <form action="HolidayListServlet" method="post" enctype="multipart/form-data">
      <input type="file" name="holidayListFile"/><br/>
      <input type="submit" value="Upload Holiday Excel" />
  </form>

  <form action="FileDownload" method="get">
      <input type="submit" value="Generate Report">
  </form>

  </body>
</html>
