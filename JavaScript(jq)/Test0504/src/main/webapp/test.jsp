<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.6.4.min.js"
	integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8="
	crossorigin="anonymous"></script>
<script>
$(function() { //
	$("button").click(function() {
		$("#p1").html("- 편의점 음식")
		 $("p").css("fontSize", "50px");
	});
});
$(function() { //
	$("button").click(function() {
		document.getElementById("p2").innerHTML = "성공적으로 문자열 삽입이 수행되엇음";
		$("p").css("color", "blue");
		 $("p").css("fontSize", "30px");
	});
});
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<p id = "p1"></p>
	<button id = "btn1">1순위 메뉴 보기</button>
	<p id = "p2"></p>
	<button id = "btn2">2순위 메뉴 보기</button>
	<p></p>
	<button>3순위 메뉴 보기</button>
	<p></p>
	<button>후보 지우기</button>
	<p></p>
</body>
</html>