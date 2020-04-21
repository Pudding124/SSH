<%--
  Created by IntelliJ IDEA.
  User: surpr
  Date: 2020/4/19
  Time: 下午 08:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Hello, it's for car action</h1>
    <s:form action="carAction">
        <s:textfield key="number"></s:textfield>
        <s:submit></s:submit>
    </s:form>
    <h1><s:property value="name"/></h1>
</body>
</html>
