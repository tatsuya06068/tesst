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
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<link rel="stylesheet" href="./css/manager.css">
<script>
	function clickSwitch() {
		'use strict';
		var isA = 0; // 現在地判定
		var btnA = document.getElementById('a');
		var btnB = document.getElementById('b');
		var divA = document.getElementById('divA');
		var divB = document.getElementById('divB');

		function setState(isA) {
			btnA.className = (isA == 0) ? 'btn inactive' : 'btn'; // Aのとき非表示
			divA.className = (isA == 0) ? 'boxDisplay' : 'boxNone'; // Aのとき表示
			btnB.className = (isA == 1) ? 'btn inactive' : 'btn'; // Bのとき非表示
			divB.className = (isA == 1) ? 'boxDisplay' : 'boxNone'; // Bのとき表示
		}
		setState(0);

		btnA.addEventListener('click', function() {
			if (isA == 0)
				return;
			isA = 0;
			setState(0);
		});
		btnB.addEventListener('click', function() {
			if (isA == 1)
				return;
			isA = 1;
			setState(1);
		});
	};
	document.addEventListener("DOMContentLoaded", clickSwitch, false);
</script>
<title>商品追加</title>

</head>
<body>
	<div class="head">
		<h2 class="logo">cafe</h2>
		<br> <a id="btn" href='<s:url action="GoTopAction"/>'>ホーム</a> <a
			class="button" href='<s:url action="ProductAction"/>'>商品</a> <a
			class="button" href='<s:url action="GoReservationAction"/>'>予約</a>
		<s:if test="#session.Key">
			<a class="button" href='<s:url action="GoManagerAction"/>'>管理者</a>
		</s:if>

	</div>


	<div class="main">

		<ul id="switch">
			<li id="a">商品追加</li>
			<li id="b">予約一覧</li>
		</ul>


		<div class="a">
			<div id="divA">
				<h4>追加したい商品情報を入力してください。</h4>

			<s:form action="ManagerAction" method="post"
					enctype="multipart/form-data" name="itemInfo"
					onsubmit="return fileCheck();">

					<p class="name">画像</p>


						<input type="file" accept='image/*' name="file" id="file"  required/>


					<p class="name">
					<p>商品名</p>
					<s:textfield name="name" />
					<p>商品紹介</p>
					<s:textfield name="productDiscription" />
					<p>
						<select name="categoryId">
							<option value="1" selected="selected">ケーキ</option>
							<option value="2">飲み物</option>
						</select>
					</p>
					<button class="btn-layout" type='submit' name='addFlg'>確認</button>


				</s:form>
			</div>
		</div>


	<div  class="b">
    <div id="divB" >
			<s:iterator value="ReservationDTOList" status="st">
				<s:form >
					<s:property value="name" />
					<s:property value="email" />
					<s:property value="reservation_date" />
					<s:property value="body" />

					<s:hidden value="%{name}" name="name" />
					<s:hidden value="%{email}" name="email" />
					<s:hidden value="%{reservation_date}" name="reservation_date" />

				</s:form>
			</s:iterator>
		</div>
</div>
</div>


</body>
</html>