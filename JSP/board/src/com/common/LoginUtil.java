package com.common;

import com.dto.MemberDTO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginUtil {
    public static boolean isLogin(HttpServletRequest request) {
        HttpSession session = request.getSession();

        MemberDTO dto = (MemberDTO) session.getAttribute("mi");
        //null이 아니면 로그인된상태라 메인으로 보내버리기.
        if (dto != null) {
            return true;
        } else {
            return false;//로그인 안한상태
        }
    }

    public static int getMemberId(HttpServletRequest request) {//세션에서 가지고 와야해서 서블릿객체씀
        HttpSession session = request.getSession();
        MemberDTO dto = (MemberDTO) session.getAttribute("mi");

        return dto.getId();
    }

    public static void setRequestURI(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String requestURI = request.getRequestURI();
        session.setAttribute("goto", requestURI);
    }

    public static String getRequestURI(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String requestURI = (String) session.getAttribute("goto");
        session.removeAttribute("goto");
        return requestURI;
    }
}
