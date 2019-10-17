<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="">
<meta name="keywords" content="" />
<link rel="stylesheet" href="./css/confirm.css">

<title>予約確認</title>

</head>
<body>


	<div class="main">


		<h2 class="b">送信する内容は以下でよろしいでしょうか？</h2>
		<s:form action="ReservationCompleteAction">
			<p>お名前：</p>
			<s:property value="name" escape="true" />
			<p>メールアドレス</p>
			<s:property value="email" escape="true" />
			<p>日付</p>
			<s:property value="reservation_date" />
			<p>内容</p>
			<s:property value="body" />


			<!-- ここからhidden  -->
			<input type="hidden" name="name" value='<s:property value="name" />'>
			<input type="hidden" name="email"
				value='<s:property value="email" />'>
			<input type="hidden" name="body" value='<s:property value="body"/>'>
			<input type="hidden" name="reservation_date"
				value='<s:property value="reservation_date"/>'>
			<!-- ここまでhidden -->


			<!-- 	<s:submit class="button-layout long" value="戻って修正する" onclick="goInquiryBackAction();" />-->
			<br>
			<s:submit class="button-layout" value="送信する" />

		</s:form>
	</div>

</body>
</html>