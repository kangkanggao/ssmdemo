<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录</title>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
</head>
<body>
   <form action="<%=basePath%>page/user/login.action">
    用户名: <input type="text" name="name"><br>
     密码:<input type="password" name="pwd"><br>
     <input type="submit" value="提交">
   </form>
</body>
</html>