<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<link rel="stylesheet" href="./css/reservation.css">


<title>受取予約</title>

</head>
<body>


<div class="head">
<h2 class="logo">cafe</h2><br>

	<a  class="button"  href='<s:url action="GoTopAction"/>'>ホーム</a>
	<a  class="button" href='<s:url action="ProductAction"/>'>商品</a>
	<a  id="btn"  href='<s:url action="GoReservationAction"/>'>予約</a>
	<s:if test="#session.Key">
				<a   class="button" href='<s:url action="GoManagerAction"/>'>管理者</a>
		</s:if>
</div>

<div class="main">

<P>内容入力</P>

<s:form action="ReservationConfirmAction" name="body">

<p>名前</p>
<s:textfield name="name"  />
<br>

 <p>メールアドレス</p>
 <s:textfield name="email" />
<br>

<p>受取希望日時</p>
 <input type="date" name="reservation_date" value="2017-06-01" />
 <br>

<p>詳細内容</p>
 <s:textarea name="body" />
<br>
<s:submit value="確認"/>

</s:form>
</div>
</body>
</html>