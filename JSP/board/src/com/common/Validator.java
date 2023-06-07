package com.common;

import java.util.regex.Pattern;

public class Validator {
    // 선택값일 때 데이터검사
    // 필수값일 때 데이터검사
    public static boolean isValidated(String data, String regexp, boolean isEssential) {
        boolean isValidated = true;

        if (isEssential) {  //필수일경우(true)
            if (data == null || data.equals("") || !Pattern.matches(regexp, data)) {
                return isValidated = false;
            }
        } else {    //선택값일 경우
            if (data != null && !data.equals("") && !Pattern.matches(regexp, data)) {   // 데이터 입력시
                isValidated = false;
            }
        }
        return isValidated;
    }

    public static boolean isStringEmpty(String str) {
        return str == null || str.isEmpty();//isEmpty() : 공백인지 묻는 메소드
    }
}
