<%@ page import="java.util.List" %>
<%@ page import="com.example.duc.entity.Student" %><%--
  Created by IntelliJ IDEA.
  User: AD
  Date: 04/03/2023
  Time: 10:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <% List<Student> lsStudent =(List<Student>)session.getAttribute("students"); %>
    <h2 style="margin-left: 500">DANH SACH SINH VIEN THEO LOP</h2>
    <label>Category</label>
            <select name="category">
            	<% for (Student stu : lsStudent) {%>
                <option value=""><%= stu.getMsLop() %></option>
                <% } %>
            </select>
    <br/>
    <table border="1" width="80%" align="center">
        <tr>
            <th>Mssv</th>
            <th>Ho va ten</th>
            <th>Email</th>
            <th>Dia Chi</th>
        </tr>
        <% for (Student stu : lsStudent) {%>
            <tr>
                <td><%= stu.getMssv() %></td>
                <td><%= stu.getHoTen() %></td>
                <td><%= stu.getEmail() %></td>
                <td><%= stu.getDiaChi() %></td>
            </tr>
        <% } %>
    </table>
    <br>
    <a style="margin-left: 150" href="StudentControllers?action=home">Nhan day de quay lai trang chinh</a>
</body>
</html>
