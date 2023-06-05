package com.member.service;

import com.common.AppService;
import com.common.ServiceForward;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.common.Constants.BASIC_VIEW_PATH;

public class JoinFormService implements AppService {
    @Override
    public ServiceForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // todo 로그인 여부 확인


        return ServiceForward.builder()
                .path(BASIC_VIEW_PATH + "member/joinform.jsp")
                .build();

    }
}
//alt + 6 클릭하면 t_o_d_o list 확인가능