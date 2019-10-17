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
<title>商品確認</title>

</head>
<body>

<div class="main">
			<p>送信する内容は以下でよろしいでしょうか？</p>

					<s:form action="ManagerAddCompleteAction" ENCTYPE="multipart/form-data" >

						<label>画像</label>
						<s:property value="imageFileName"  />




					<p>商品名：</p>
					<s:property value="name" escape="true"/>
					<p>カテゴリー</p>
					<s:property value="categoryId" escape="true" />
						<p>内容</p>
					<s:property value="productDiscription" />


		<!-- ここからhidden  -->
				<input type="hidden" name="name" value='<s:property value="name" />'>
				<input type="hidden" name="categoryId" value='<s:property value="categoryId" />'>
				<input type="hidden" name="productDiscription" value='<s:property value="productDiscription"/>'>
					<input type="hidden" name="imageFileName" value="<s:property value="imageFileName"/>" />

		<!-- ここまでhidden -->


			<!-- 	<s:submit class="button-layout long" value="戻って修正する" onclick="goInquiryBackAction();" />--><br>
			  	<s:submit class="button-layout" value="送信する"  />

			</s:form>
</div>
</body>
</html>