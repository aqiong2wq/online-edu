<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<font color="red">${requestScope.error}</font>
<form action="loginAction" method="post">
 用户名：<input type="text" name="username"><br><font color="red"><s:fielderror fieldName="username"/></font>
密码：<input type="password" name="password"> <br><font color="red"><s:fielderror fieldName="password"/></font>
用户类型：<select name="type">
                 <option >管理员</option>
                  <option>普通用户</option>
         </select><br>
验证码:<input type="text" name="checking">&emsp;<img src="image.jsp"> <font color="red"><a href="" target="_self">看不清，换一张</a><br><s:fielderror fieldName="checking"/></font>
<input type="submit" value="登录">
</form>
</body>
</html>