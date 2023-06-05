package com.example.service;

import com.common.AppService;
import com.common.ServiceForward;
import com.example.service.ds.ExampleDs;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.regex.Pattern;

import static com.common.Constants.BASIC_VIEW_PATH;

public class SearchService implements AppService {
    @Override
    public ServiceForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //String 형 input을 선언하고 입력한 id를 로드한다.
        String input = request.getParameter("myNameId");

        //input 변수의 데이터가 숫자인지 확인한다.
        //만약 숫자가 아니라면
        //'숫자만 입력해주세요.' 메시지 출력 후 뒤로 가기          // 오른쪽에는 비교할데이터가 들어가는데 주의할것은 문자형(String)밖에 안들어감.
        if (input == null || input.equals("") || !Pattern.matches("^[0-9]{1,9}$", input)) {
            //오류 메시지
            return null;
        }

        //정수형 id를 선언하고 input 변수를 숫자로 변환한다.
        int id = Integer.parseInt(input);   //정수로 변환시킴(예외는 위에 코드에서 다 제거했음(정규식표현코드))

        // String 형 name을 선언하고 데이터베이스에서 id로 이름을 검색하여 저장한다.
        ExampleDs ds = new ExampleDs();
        String name = ds.selectNameById(id);//selectNameById : 뭐를 이용해서 불러오라는 명령

        if (name == null) {
            name = "검색 결과가 존재하지 않습니다.";
        }
        //request 객체에 attribute에 검색한 이름을 저장한다.
        request.setAttribute("result", name);

        //view 리턴을 위한 forward 객체 리턴
        return ServiceForward.builder()
                .path(BASIC_VIEW_PATH + "search.jsp")
                .build();
    }
}
//정규표현식
//시작은 ^ 로 시작하고 []는 대괄호안에 잇는 것들만 받겟다는 의미
//ㄱ부터 ㅎ까지 자음모음 싹다 들어올수있다는 의미(가-힣)
//!@#$%^&*는 모든특수기호 들어올수있다는 의미
//{1,10) 한자리에서 열자리숫자까지 받겟다는 의미.
//$
//a-z(소문자만 받겟다)A-Z(대문자만 받겟다)


//  if (input == null) {
//          //오류 메시지
//          } else {
//          if (input.equals("")) {
//          //빈값 오류 메시지
//          } else {
//          // 정규 표현식 사용하여 숫자인지 확인
//          if (/*정규표현식 맞는지*/) {
//
//          } else {
//
//          }
//          }
//          }