<%@ page import="com.dto.MemberDTO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    MemberDTO dto = (MemberDTO) session.getAttribute("mi");
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
    <script>
        function searchSubmit() {
            var input = $('#keywordInput').val();//keywordInput id를 가진곳에 입력되어있는 값을 가지고 온다는 코드.
            if (input == '') {//빈값이라면
                alert('검색 키워드를 입력해 주세요.');
                return;
            }
            $('#searchForm').submit();//빈값이 아니면 submit되야함.
        }

    </script>
</head>
<body>
<%if (dto == null) {%>
<a href="/member/join/form.do">회원가입</a>
<a href="/login.do">로그인</a>
<%} else {%>
<%=dto.getName()%>님 안녕?
<a href="/member/info.do">마이페이지</a>
<a href="/logout.do">로그아웃</a>
<%}%>


<%--<%if(){%>--%>
<%--<%}else if() {%>--%>
<%--<%}else if() {%>--%>
<%--<%}else {%>--%>
<%--<%}%>--%>

</body>
</html>
<%--MVC2 : 사용자가 뷰에 요청을 하면 컨트롤러(경로담당)가 받아서 요청에 해당하는 서비스를 호출.
    db에 갓다올일 생기면 dao 갓다옴 접속해서 데이터를 가져와서 서비스로 넘기고
    컨트롤러로 돌려준다. 컨트롤러는 뷰페이지를 반환한다.--%>
<%--자바스크립트 디버깅은 인터넷 실행하고 f12번 누르고 Sources 탭에서 숫자라인 코드 누르면 디버깅 실행된 f10번으로 한줄씩 디버깅됨--%>
<%--<form action="/result.do" method="post">--%>
<%--이름--%>
<%--<input type="text" name="myName">--%>
<%--<!-- 나이 -->--%>
<%--<!--  <input type="text" name="myAge"> -->--%>
<%--<input type="submit" value="확인">--%>
<%--</form>--%>

<%--<form action="/search.do" method="post" id="searchForm">--%>
<%--검색--%>
<%--<input type="text" name="myNameId" id="keywordInput">--%>
<%--<button type="button" onclick="searchSubmit()">확인</button>--%>
<%--&lt;%&ndash;버튼 타입쓸때 조심해서 잘써야함. 안그러면 데이터 2개씩 들어옴.&ndash;%&gt;--%>
<%--&lt;%&ndash;<input type="submit" value="확인">&ndash;%&gt;--%>
<%--</form>--%>
