package Test_0525;

import java.util.ArrayList;
import java.util.List;

public class List_Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();// list는 상위 인터페이스고 arraylist는 list를 확장한 개념.
//        ArrayList<String> list1 = new ArrayList<>();    //쓸 수는 잇지만 위에 방법으로 씀.
        // list는 배열과 달리 가변적임.
        list.add("String");
        list.add("add");
        list.add("minjeong");
        list.add("mini");
        list.add("gaga");
        list.add("listlist");


//        for(int i=0; i<list.size(); i++){
//            System.out.println(list.get(i));
//        }
        for (String str : list) { //str뒤에 list객체가 온다. 클래스명 명시해주고 list에 반복되는 데이터들을 str에 담는다.
            System.out.println(str);
        }
    }
}
