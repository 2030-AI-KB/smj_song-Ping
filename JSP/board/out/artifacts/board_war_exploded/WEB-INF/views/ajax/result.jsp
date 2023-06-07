<%@ page contentType="text/plain;charset=UTF-8" language="java" %>
<%
    boolean usable = (boolean) request.getAttribute("result");
%>
{
    "usable" : "<%=usable%>"
}
<%--데이터덩어리 만들기위해서 plain으로 써줌--%>