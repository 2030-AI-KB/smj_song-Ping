package com.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//컨트롤러는 받아서 올바른거 실행시켜주면됨
//forward나 redirect
//등은 컨트롤러가 할일은 아님
public interface AppService {   //리다이렉트 여부와 경로를 리턴값을 쓸것임. 그값을 서비스에서 다 해결해주고 넘겨줄것임. 컨트롤러가 아니라
    ServiceForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception;    //excute : 실행하다
    //컨트롤러에서 호출할때 각각의 서비스를 할떄 AppService에 있는 메소드를 이용해 호출.

}
