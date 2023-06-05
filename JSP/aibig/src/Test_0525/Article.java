package Test_0525;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data           //정의하면 getter/setter 적어놓지않아도 자동으로 쓸수있음
@Builder        //
public class Article {
    // 글번호 (pk후보)
    private int id;
    // 제목
    private String title;
    // 글쓴이(fk, 이너조인을 떠올리기)
    private int memberId;
    // 날짜 (날짜와 시간까지 다 저장)
    private LocalDateTime writeDate;
    // 추천수
    private int recommendNo;
    // 조회
    private int hit;
    // 글 내용
    private String contents;
}
