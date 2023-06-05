package com.example.service;

import com.AppDao;
import com.common.AppService;
import com.common.ServiceForward;
import com.example.service.ds.ExampleDs;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.common.Constants.BASIC_VIEW_PATH;

public class ResultService implements AppService {
    @Override
    public ServiceForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //String형 name을 선언하고 myname 키 값으로 입력한 데이터를 저장한다.
        String name = request.getParameter("myName");
//        String age = request.getParameter("myAge");

        ExampleDs ds = new ExampleDs();
        //request 객체에 뷰로 전송할 name 데이터를 저장한다.
        ds.insertName(name);

        request.setAttribute("name", name);
//        request.setAttribute("age", age);

        // ServiceForward 객체 forward를 선언하고 빌더를 통해 경로 데이터를 저장한다.
        ServiceForward forward = ServiceForward.builder()
                .path(BASIC_VIEW_PATH + "result.jsp")
                .build();
        // forward 객체를 리턴한다.
        return forward;
    }
}
