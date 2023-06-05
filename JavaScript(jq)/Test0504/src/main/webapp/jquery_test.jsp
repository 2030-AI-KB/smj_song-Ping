<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.6.4.min.js"
	integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8="
	crossorigin="anonymous"></script>
<!--
<script>
	//jquery문의 script 태그는 보통 head 안에서 작성함
	//jquery : js 언어 사용을 간편하게 하는 데에 도움을 주는 js 라이브러리
	//jquery는 프로그래밍 언어가 아니다.
	
	// 기본 문법 : $(선택자).동작함수()
</script>
  -->
<script>
	$(function() { // == window.onload
		document.getElementById("h").innerHTML = "성공적으로 문자열 삽입이 수행되엇음";
	});
	$(function() { //
		$("button").click(function() {
			$("p").hide();
		});
	});
	$(function() {
		$("#h").css("color", "coral");
	});
	$(function() {
		$("p").css("fontSize", "25px");
	});
</script>
<meta charset="UTF-8">
<title>개발새발</title>
</head>
<body>
	<h2 id="h"></h2>
	<p>button 이용해서 숨겨주세요!</p>
	<button>click me</button>
</body>
</html>