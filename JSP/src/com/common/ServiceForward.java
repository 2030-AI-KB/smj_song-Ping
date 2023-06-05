package com.common;

import lombok.Builder;
import lombok.Data;

//서비스를 실행하고 나서 뷰페이지경로와 리다이렉트 or 포워드할껀지 저장하는 페이지
@Data
@Builder
public class ServiceForward {
    private String path;    //경로

    // true 일때는 리다이렉트 false일때는 포워드로 할것임. 컨트롤러타고 주소바뀌는 redirect의 경우는 많지 않음 압도적으로 forward 많이 씀.
    private boolean redirect;


}
