<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String inputName = (String) request.getAttribute("name");
    // String inputAge = (String) request.getAttribute("age");
%>
<!doctype html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <script src="https://code.jquery.com/jquery-3.7.0.js"
            integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM="
            crossorigin="anonymous"></script>
    <title>Document</title>
</head>
<body>
<%=inputName%>님, 어서오세요.<br>
<button onclick="location.href='/main.do'">홈으로</button>
</body>
</html>
<%--location은 자바스크립트에서 위치를 나타내주는 역할.'/' 도메인 톰캣의 루트(localhost:8080)임--%>
<%--<%=inputName%>님의 나이는 <%=inputAge%> 입니다.--%>