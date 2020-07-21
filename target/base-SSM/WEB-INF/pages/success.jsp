<%--
  Created by IntelliJ IDEA.
  User: kanouakira
  Date: 2020/7/21
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>
            姓名
        </td>
        <td>
            年龄
        </td>
    </tr>
    <c:forEach items="${userList}" var="user">
        <tr>
            <td>${user.username}</td>
            <td>${user.age}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
