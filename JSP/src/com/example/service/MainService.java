package com.example.service;

import com.common.AppService;
import com.common.ServiceForward;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.common.Constants.BASIC_VIEW_PATH;

public class MainService implements AppService {
    @Override
    public ServiceForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
//        ServiceForward forward = ServiceForward.builder()
//                .path(BASIC_VIEW_PATH + "main.jsp")
//                .build();     //이 변수선언을 굳이 안해도 되고 리턴에 바로 써도 된다.
        return ServiceForward.builder()
                .path(BASIC_VIEW_PATH + "main.jsp")
                .build();

    }
}
