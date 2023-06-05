<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
			<!-- "Ajax는 프로그래밍 언어는 아니다. -->
			<!--  Ajax : 로딩없이 웹페이지 갱신하고, 백그라운드 -> 웹서버로 데이터 상호전송 사용
						(Js 이벤트 동작을 도와주는 라이브러리) -->
			<!-- "바닐라(순수) Js 통해 구현" or Jquery 통해 구현 -->
<body>
<button id = "btn" onclick = "Func()">버튼을 눌러주세요</button>
<p id = "text"></p>	<!-- onprogress 함수 실행 결과 출력 -->
<p id = "test"></p> <!-- onload 함수 실행 결과 출력 -->
</body>
<script>
			/* XMLHttpRequest 객체 :  웹 서버와 "데이터 교환"에 사용*/
			/* 이 객체를 통해서, 페이지 중 일부만 업데이트 가능  */
			/* 응용 방법 */

			/*  콜백 함수 종류 */
			// onload : xhr 객체가 서버로부터 데이터를 성공적으로 받을 때 수행할 함수
			// onerror : xhr 객체 통한 데이터 발신 / 수신 또는 xhr 객체 자체에 문제 발생 시 수행할 함수
			// onprogress : xhr 객체에서 데이터 수신받을 때 호출할 함수
	
			/* 1. XMLHttpRequest 객체 생성 -> 내장된 생성자 이용 */
			/*  let xhttp = new XMLHttpRequest(); */
			/* 2. 콜백 함수(데이터 수신/발신(이벤트에 사용 될)을 할 시 수행할 함수) 정의 */
				function Func(){
				let xhttp = new XMLHttpRequest();
				
				/* xhr객체명.콜백함수명 = function(){
					(콜백 함수를 실행시키는 조건이 만족할 때) 수행할 명령문
				} */
				
				xhttp.onload = function(){
					document.getElementById("test").innerHTML = this.responseText;
				}
				
				xhttp.onprogress=function(){
					document.getElementById("text").innerHTML = "통신 중입니다";
				}
				/* 서버에 요청 보내기 : open(), send() */
				/* open() : 서버에 요청할 내용 기술 */
					/* xhr객체명.open("GET/POST", "서버에 요청할 데이터") */
						/* GET : 서버로부터 데이터를 받아올 때 사용(=데이터를 요청할 때 사용) */
						/* POST : 서버로 데이터를 보낼 때 사용 */
				xhttp.open('GET', 'txt.txt');	//"txt.txt 파일을 받아올 것을 요청한다."
				/* send() : 서버에 요청을 보냄 */
					/* xhr객체명.send(); -> POST 형식일 때, String형 매개변수가 있어야함(send(String)) */
				xhttp.send();
					// GET 형식을 사용할 때, open()의 두번째 매개변수 필요로 함
					// POST 형식을 사용할 때, send()의 첫번째 매개변수 필요로 함
				
			}
		
	
</script>
</html>