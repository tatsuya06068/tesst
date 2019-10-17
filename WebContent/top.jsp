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

<link rel="stylesheet" href="./css/top.css">
<title>cafetop</title>
</head>

<body>


<div class="head">
<h2 class="logo">cafe</h2><br>

	<a  id="btn"  href='<s:url action="GoTopAction"/>'>ホーム</a>
	<a  class="button" href='<s:url action="ProductAction"/>'>商品</a>
	<a class="button" href='<s:url action="GoReservationAction"/>'>予約</a>
		<s:if test="#session.Key">
				<a   class="button" href='<s:url action="GoManagerAction"/>'>管理者</a>
		</s:if>
<a class="btn" href='<s:url action="GoLoginAction"/>'>ログイン</a>
</div>


<div class="main">

<h1 class="introduction">お店紹介</h1><br>
<div style="margin-left: 10%; margin-right:10%;margin-bottom: 10px; background-color: #009999; color: #ffffff;border: 5px double #333333; widtn:30px;">
  <h3>町はずれにある小さなケーキ屋ですが、職人が一つ一つ丁寧に仕上げ長年住民に愛されています。<br>
また、季節の果物をふんだんに使用した、タルトケーキが当店一番人気となっております。</h3>

</div>


</div>

</body>
</html>