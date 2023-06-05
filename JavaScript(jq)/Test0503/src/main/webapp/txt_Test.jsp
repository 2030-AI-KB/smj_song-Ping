<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- <script src="https://code.jquery.com/jquery-3.6.4.min.js"
	integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8="
	crossorigin="anonymous"></script> -->
<meta charset="UTF-8">
<script src="../jquery-3.6.4.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<p>아래는 저의 인적사항입니다.</p>
	<p id="introduce"></p>
	<button id="introduce" onclick="Func()">버튼</button>
	<!-- onprogress 함수 실행 결과 출력 -->

	<p>지금까지 수업했던 내용을 불러옵니다</p>

	<p>자바</p>
	<p id="java"></p>
	<button id="btn1" onclick="Func1()">버튼</button>

	<p>html/css</p>
	<p id="html"></p>
	<!-- onload 함수 실행 결과 출력 -->
	<button id="btn2" onclick="Func2()">버튼</button>

	<p>javascripts</p>
	<p id="js"></p>
	<!-- onprogress 함수 실행 결과 출력 -->
	<button id="btn3" onclick="Func3()">버튼</button>

	<p>ajax</p>
	<p id="ajax">AJAX</p>
	<!-- onload 함수 실행 결과 출력 -->
	<button id="btn4" onclick="Func4()">버튼</button>
</body>
<script>
	function Func() {
		let xhttp = new XMLHttpRequest();

		xhttp.onprogress = function() {
			alert("클릭");

			document.getElementById("introduce").innerHTML = this.responseText;
		}
		xhttp.open('GET', 'introduce.txt'); //"txt.txt 파일을 받아올 것을 요청한다."
		xhttp.send();

		function Func1() {
			let xhttp = new XMLHttpRequest();

			xhttp.onprogress = function() {
				document.getElementById("java").innerHTML = this.responseText;
			}
			xhttp.open('GET', 'java.txt');
			xhttp.send();
		}
		function Func2() {
			let xhttp = new XMLHttpRequest();

			document.getElementById("html").innerHTML = this.responseText;
		}
		xhttp.open('GET', 'html.txt');
		xhttp.send();
		function Func3() {
			let xhttp = new XMLHttpRequest();

			document.getElementById("js").innerHTML = this.responseText;
		}
		xhttp.open('GET', 'js.txt');
		xhttp.send();
		function Func3() {
			let xhttp = new XMLHttpRequest();

			document.getElementById("ajax").innerHTML = this.responseText;
		}
		xhttp.open('GET', 'ajax.txt');
		xhttp.send();

	}
</script>
</html>