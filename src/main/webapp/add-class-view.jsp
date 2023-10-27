<%--
  Created by IntelliJ IDEA.
  User: AD
  Date: 04/03/2023
  Time: 11:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="ClassesControllers">
        <input type="hidden" name="action" value="add_class"/>
        <h2>THEM LOP MOI</h2>
        MSLop:<input style="margin-left: 35" type="text" name="msLop">
        <br/>
        <br/>
        TenLop:<input style="margin-left: 35" type="text" name="tenLop">
        <br/>
        <br/>
        GiaoVienCN:<input type="text" name="giaovienCN">
        <br/>
        <br/>
        <button type="submit">ADD Class</button>
        <br>
        <br>
        <a href="ClassesControllers?action=home">Quay lai trang chinh</a>
    </form>
</body>
</html>
