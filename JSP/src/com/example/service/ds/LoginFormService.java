package com.example.service.ds;

import com.common.AppService;
import com.common.ServiceForward;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.common.Constants.BASIC_VIEW_PATH;

public class LoginFormService implements AppService {
    @Override
    public ServiceForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        return ServiceForward.builder()
                .path(BASIC_VIEW_PATH + "member/login.jsp")
                .build();

    }
}
