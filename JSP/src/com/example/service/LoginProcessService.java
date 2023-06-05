package com.example.service;

import com.common.AppService;
import com.common.BCrypt;
import com.common.ServiceForward;
import com.common.Validator;
import com.dto.MemberDTO;
import com.member.ds.MemberDs;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import static com.common.Constants.BASIC_VIEW_PATH;

public class LoginProcessService implements AppService {
    @Override
    public ServiceForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 폼의 데이터 로드
        String loginId = request.getParameter("loginId");
        String password = request.getParameter("password");
        // 데이터빈값검사
        if (Validator.isStringEmpty(loginId) || Validator.isStringEmpty(password)) {
            return null;
        }
        // 입력한 아이디로 데이터베이스에서 회원 정보 검색
        MemberDs ds = new MemberDs();
        MemberDTO memberDTO = ds.selectMemberInfoByLoginId(loginId);
        if (memberDTO == null) {
            return null;
        }
        // 비밀번호 비교
        boolean isSame = BCrypt.checkpw(password, memberDTO.getPassword());//입력한 비밀번호와 멤버dto에 있는 비밀번호가 같은지 확인
        if (!isSame) {
            return null;
        }
        // 세션에 회원정보 저장
        HttpSession session = request.getSession();
        session.setAttribute("mi", memberDTO);
        return ServiceForward.builder()
                .path(BASIC_VIEW_PATH + "main.jsp")
                .build();

    }
}
