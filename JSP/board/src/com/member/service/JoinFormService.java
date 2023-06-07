package com.member.service;

import com.common.AppService;
import com.common.LoginUtil;
import com.common.ServiceForward;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

import static com.common.Constants.BASIC_VIEW_PATH;

public class JoinFormService implements AppService {
    @Override
    public ServiceForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // todo 로그인 여부 확인
        if (LoginUtil.isLogin(request)) {
//            response.setContentType("text/html;charset=UTF-8");
//            PrintWriter out = response.getWriter();
//            out.println("<script>alert('잘못된접근입니다.');location.href='/main.do';</script>");
//            out.close();

            return ServiceForward.builder()
                    .fail(true)
                    .message("alert('잘못된접근입니다.');location.href='/main.do';")
                    .build();
        }


        return ServiceForward.builder()
                .path(BASIC_VIEW_PATH + "member/joinform.jsp")
                .build();

    }
}
//alt + 6 클릭하면 t_o_d_o list 확인가능