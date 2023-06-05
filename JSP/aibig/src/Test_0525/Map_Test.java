package Test_0525;

import java.util.HashMap;
import java.util.Map;

public class Map_Test {
    public static void main(String[] args) {
        Map<String, String> myMap = new HashMap<>();
        //맵은 컬렉션을 상속받진 않지만 컬렉션의 형태를 따라서 컬렉션의 일종이라 한다.

        myMap.put("smj","송민정");
        myMap.put("hgd","홍길동");
        myMap.put("jjj","지지지");
        myMap.put("iii","이영아");

        System.out.println(myMap.get("smj"));
    }
}
