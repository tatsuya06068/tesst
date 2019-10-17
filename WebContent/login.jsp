<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/fifties.css"/>
<link href="https://fonts.googleapis.com/css?family=Pacifico" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Roboto+Slab:400,700" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=PT+Sans" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Cookie" rel="stylesheet">
<title>Login</title>
<link rel="stylesheet" href="./css/login.css">
</head>

<body>
<div class="main">
<s:form action="LoginAction">
<s:property value="	errorMessage " /><br>

<s:property value="nameErrorMessage" /><br>
<s:property value="PasswordErrorMessage"/><br>
<b>管理者ID:</b>

<s:textfield name="UserName"  size="24" label="ユーザID"/><br>

<b>パスワード:</b>
<s:password name="Password"  size="24" label="パスワード"/>


<s:submit value="ログイン"/>

</s:form>

</div>

</body>
</html>