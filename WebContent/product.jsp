<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<link href="https://fonts.googleapis.com/css?family=Pacifico"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Roboto+Slab:400,700"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=PT+Sans"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Cookie"
	rel="stylesheet">
	<link rel="stylesheet" href="./css/product.css">
	<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<title>商品</title>

<script>


</script>
</head>

<body>


<div class="head">
<h2 class="logo">cafe</h2><br>

	<a  class="button"  href='<s:url action="GoTopAction"/>'>ホーム</a>
	<a  id="btn"  href='<s:url action="ProductAction"/>'>商品</a>
	<a class="button" href='<s:url action="GoReservationAction"/>'>予約</a>
	<s:if test="#session.Key">
				<a   class="button" href='<s:url action="GoManagerAction"/>'>管理者</a>
		</s:if>
</div>

<div class="main">
	<p>商品一覧</p>

	<s:iterator value="productDTOList " status="st">
		<s:form class="product" action="ManagerAction" method="post">
						<p>
							<img class="image_file_path"
								src="<s:property value="image_file_path"/>" alt="Photo"
								width="70%" height="170">
						</p>

            	<s:if test="categoryId==1">
							<span>ケーキ</span>
						</s:if>
						<s:elseif test="category_id==2">
							<span>ドリンク</span>
						</s:elseif><br>
			<s:property value="productName" /><br>
			<s:property value="productDiscription" />




			<s:hidden value="%{id}" name="id" />
			<s:hidden value="%{categoryId}" name="categoruId" />
			<s:hidden value="%{productName}" name="productName" />
			<s:hidden value="%{productDiscription}" name="productDiscription" />


			<s:if test="#session.Key">
<%-- 	<span>
					<button class="btn" type='submit' name='changeFlg'>商品情報変更</button>
			</span> --%>
			<br>

			<span>
				<button class="btn" type='submit' name='deleteFlg'
					onclick='return confirm("削除してよろしいですか？")'>削除</button>
			</span>
						</s:if>


		</s:form>
	</s:iterator>
</div>

</body>
</html>