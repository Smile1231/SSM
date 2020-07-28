<%--
  Created by IntelliJ IDEA.
  User: Y
  Date: 2020/7/26
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>list</title>
</head>
<body>
<h2> 这是查询所有界面 </h2>
    <c:forEach items="${list}" var="account">
        ${account.name}<br>
        ${account.money}
    </c:forEach>

</body>
</html>
