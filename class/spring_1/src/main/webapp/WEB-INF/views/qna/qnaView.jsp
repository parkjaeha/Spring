<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1>${board} View</h1>
		<div>
		<h3> title : ${view.title}</h3>
		<h3> title : ${view.writer}</h3>
		<h3> title : ${view.age}</h3>
		</div>
		<a href="./qnaWrite">qna write</a>
</body>
</html>