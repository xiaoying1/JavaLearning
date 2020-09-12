<%--
  Created by IntelliJ IDEA.
  User: linxy
  Date: 2020/9/10
  Time: 21:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.tplink.lxy.bean.User" %>
<%
  User user = (User) request.getAttribute("user");
%>
<html>
<head>
  <title>Hello World - JSP</title>
</head>
<body>
<h1>Hello <%= user.name %>!</h1>
<p>School Name:
  <span style="color:red">
        <%= user.school.name %>
    </span>
</p>
<p>School Address:
  <span style="color:red">
        <%= user.school.address %>
    </span>
</p>
</body>
</html>

