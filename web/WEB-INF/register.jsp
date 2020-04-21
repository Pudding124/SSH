<%--
  Created by IntelliJ IDEA.
  User: surpr
  Date: 2020/4/20
  Time: 下午 01:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Registered State</h1>
<s:form action="carSaveAction">
    <s:textfield key="name"></s:textfield>
    <s:textfield key="number"></s:textfield>
    <s:submit></s:submit>
</s:form>
<h1><s:property value="state"/></h1>
</body>
</html>
