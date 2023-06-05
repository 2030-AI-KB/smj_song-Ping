package com;

import com.common.AppService;
import com.common.ServiceForward;
import com.example.service.LoginProcessService;
import com.example.service.MainService;
import com.example.service.ds.LoginFormService;
import com.member.service.AjaxCheckIdService;
import com.member.service.JoinFormService;
import com.member.service.JoinService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("*.do") // 톰캣 기준 모든것을 (*) 다 캐치할께(.do)라는 의미. 컨트롤러에서는 예외발생할일 없음. 보통 서비스에서 예외상황 많이 발생함.
public class FrontController extends HttpServlet {//HttpServlet은 오버라이딩 되어있음

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doProcess(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doProcess(request, response);
    }


    private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String command = request.getRequestURI();   //getRequestURI() : 요청한 경로가 리턴이됨
        // http://torang.co.kr/user?id=107
        //  http://torang.co.kr/user 까지가 URL // ?id=107 쿼리스트링
        // id 가 key 107 이  value
        //WEB-INF에 놔두면 접근안됨 프라이빗함

        ServiceForward forward = null;  //서비스만들것 2개있음 각각의 경로마다 서비스가 필요함.

        try {
            if (command.equals("/main.do")) {  // /(루트)로 요청하면 if문이 실행되고 슬러쉬기호 꼭 붙여야됨(/)
                //public final static String BASIC_VIEW_PATH = "/WEB-INF/views/" ; 맵핑해서 선언해놓음
                AppService service = new MainService();
                forward = service.excute(request, response);
            } else if (command.equals("/member/join/form.do")) {
                AppService service = new JoinFormService();
                forward = service.excute(request, response);
            } else if (command.equals("/member/check/id.do")) {
                AppService service = new AjaxCheckIdService();
                forward = service.excute(request, response);
            }else if (command.equals("/member/join.do")) {
                AppService service = new JoinService();
                forward = service.excute(request, response);
            }else if (command.equals("/login.do")) {
                AppService service = new LoginFormService();
                forward = service.excute(request, response);
            }else if (command.equals("/loginProcess.do")) {
                AppService service = new LoginProcessService();
                forward = service.excute(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();//어떤 예외 무엇인지 출력하는 메소드
        }
        if (forward != null) {
            if (forward.isRedirect()) {//boolean 타입은 is로 많이 물음 (isRedirect
                //리다이렉트
            } else {
                //포워드
                RequestDispatcher dispatcher                //BASIC_VIEW_PATH는 상수. 공통적인 부분은 상수로 빼서 쓴다.(Constansts.java파일에 상수선언해놧음)
                        = request.getRequestDispatcher(forward.getPath());//getRequestDispatcher 는 이동할경로와 함께 가져오면된다는 뜻.
                dispatcher.forward(request, response);  //forward는 위에 경로가 바뀌지 않는다. 요청한 경로 그대로 남아있음. 요청이랑 응답이랑 끝날때 까지 정보가 유지 o.
                //redirect는 경로가 바뀐다. 주소가 바뀌니까 요청이랑 응답이 새로 생성됨(정보 유지 x)
            }
        } else {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('잘못된 접근입니다.1');history.back();</script>");
            out.close();
        }


    }


}
//else if (command.equals("/result.do")) { // result를 요청받으면 else 문이 실행된다.
//        AppService service = new ResultService();
//        forward = service.excute(request, response);
//        } else if (command.equals("/search.do")) { // result를 요청받으면 else 문이 실행된다.
//        AppService service = new SearchService();
//        forward = service.excute(request, response);
//        }

