<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">MOM'S CAFE</h1>
	<hr>
	<form action=processOrder>
	<div align = center>
		<label for="item-name">Order Input: </label>
		<input type="text" name = "foodType" placeholder="Food type?" id="item-name"/>
		<input type="submit" value="order now"/>
	</div>
	</form>
</body>
</html>