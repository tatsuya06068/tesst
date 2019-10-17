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
	<link rel="stylesheet" href="./css/managerchange.css">
	<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<title>編集</title>
</head>
<body>
<div class="main">
<s:form action="ManagerChangeCompleteAction" method="post"
					enctype="multipart/form-data" name="itemInfo">
								<input type="file" accept='image/*' name="file" id="file"  required/>
		<s:property value="id" />   		<s:hidden value="%{id}" name="id" />
		<s:textfield  value="%{productName}"  name="productName" />
			<s:textfield value="%{productDiscription}"  name="productDiscription"/>
				<select name="categoryId">
							<option value="1" selected="selected">ケーキ</option>
							<option value="2">飲み物</option>
						</select>
  <s:submit value="変更"/>

			</s:form>

			</div>
</body>
</html>