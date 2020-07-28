<%--
  Created by IntelliJ IDEA.
  User: Y
  Date: 2020/7/26
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <script src="js/jquery-3.2.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <title>首页</title>
</head>
<body>

    <a href="account/findAll">查询所有</a>

    <h3>保存用户</h3>

    <form action="account/saveAccount" method="post" class="form-inline">
        <div class="form-group">
            <label for="exampleInputName2">姓名:</label>
            <input type="text" class="form-control" id="exampleInputName2" name="name">
        </div>
        <div class="form-group">
            <label for="exampleInputEmail2">金额:</label>
            <input type="text" class="form-control" id="exampleInputEmail2" name="money">
        </div>
        <button type="submit" class="btn btn-default">提交</button>
    </form>

</body>
</html>
