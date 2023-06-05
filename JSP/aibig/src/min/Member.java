package min;

import lombok.Data;

@Data// @ : 어떠한것을 하게 해주는 기능 지금 @Data 기능은 getter/setter, toString 기능 만들어줌
public class Member {

    // 문자열 이름
    private String name;

    // 문자열 아이디
    private String id;

    // 문자열 비밀번호
    private String pw;

    // 문자열 생년월일
    private String birthday;

    // 문자열 주소
    private String address;

    // 문자열 휴대전화번호
    private String phone;

    // 정수형 나이
    private int age;

    // 논리형(boolean) 성별
    private boolean gender;

    public Member(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Member() {
    }

}

