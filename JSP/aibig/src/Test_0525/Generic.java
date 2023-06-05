package Test_0525;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@data  -> 자바 컴파일러에게 메시지를 전달하는 목적의 메모
public class Generic {
    public static void main(String[] args) {
        List<Article> list = new ArrayList<>();// List<E> E 안에는 클래스만 들어올수 있음 ex. Integer, Long, Double, String
        //어레이리스트의 단점은 연산을 하게 되서  메모리를 많이 먹고 조금더 느리다.
        //링크드리스트는 null값은 비워놓고 가고 어레이리스트는 빈공간을 만들지 않고 당겨온다.
        //연속으로 메소드 하면 builder메소드 실행하고 build실행시킨다.


//        Article article1 = Article.builder()
//                .id(1)
//                .title("제목1")           // 생략가능. 그러면 default값 입력됨
//                .memberId(10)
//                .recommendNo(3)
//                .hit(100)
//                .writeDate(LocalDateTime.now())
//                .contents("내용1")
//                .build();

//        list.add(Article.builder()
//                .id(1)
//                .title("제목1")           // 생략가능. 그러면 default값 입력됨
//                .memberId(10)
//                .recommendNo(3)
//                .hit(100)
//                .writeDate(LocalDateTime.now())
//                .contents("내용1")
//                .build());
//
//        list.add(Article.builder()
//                .id(2)
//                .title("제목2")           // 생략가능. 그러면 default값 입력됨
//                .memberId(11)
//                .recommendNo(5)
//                .hit(200)
//                .writeDate(LocalDateTime.now().minusHours(1))//.minusHours(1)(==기준 시간보다 한시간 전)
//                .contents("내용2")
//                .build());
//
//        list.add(Article.builder()
//                .id(3)
//                .title("제목3")           // 생략가능. 그러면 default값 입력됨
//                .memberId(12)
//                .recommendNo(7)
//                .hit(300)
//                .writeDate(LocalDateTime.now().minusHours(2))//.minusHours(1)(==기준 시간보다 한시간 전)
//                .contents("내용3")
//                .build());
//
////        for (int i = 0; i < list.size(); i++) {   // 이 for문은 i 기반으로 돌아가고
////            System.out.println(list.get(i).toString());//toString()은 문자열로 만들어주는 과정
////        }
//        for(Article article : list){        // 이 for문은 article 객체로 돌아간다
//            System.out.println(article.toString());
//        }

        Map<String, Article> myArticle = new HashMap<>();

        myArticle.put("1", Article.builder()
                .id(1)
                .title("제목1아티클")           // 생략가능. 그러면 default값 입력됨
                .memberId(10)
                .recommendNo(3)
                .hit(100)
                .writeDate(LocalDateTime.now())
                .contents("내용1")
                .build());

        myArticle.put("2", Article.builder()
                .id(2)
                .title("제목2")           // 생략가능. 그러면 default값 입력됨
                .memberId(11)
                .recommendNo(5)
                .hit(200)
                .writeDate(LocalDateTime.now().minusHours(1))//.minusHours(1)(==기준 시간보다 한시간 전)
                .contents("내용2")
                .build());

        System.out.println(myArticle.get("1").getContents());


    }
}
