<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.6.4.min.js"
	integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8="
	crossorigin="anonymous"></script>
<script>
	// Jquery를 이용한 Ajax 구현
	//
/* 	$(function(){
		$("#btn").click(function(){
		$("#p").load("txt.txt");
			});
		}); */
	// get(), post() 메소드 사용
	//$.get("받아올데이터","콜백함수")
	$(function(){
		$("#btn").click(function(){
			$.get("txt.txt",function(data, status){
		/* 		alert("통신성공 했습니다."); */
		$("p").html("데이터 : " + data + "<br>상태 : " + status )
			});
		});
	});
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p id="p"></p>
	<button id ="btn">버튼 클릭하기</button>
</body>
</html>