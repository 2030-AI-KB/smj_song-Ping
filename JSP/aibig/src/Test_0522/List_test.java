package Test_0522;


public class List_test {
    public static void main(String[] args) {
        // i가 0부터 9까지 반복한다. 단 i는 1 씩 증가한다.
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        //2단을 출력하세요
        //정수형 변수 x를 선언하고 2를 입력한다(2단출력을 위해서 x값 고정)

        // 정수형 x를 선언하고 x가 2부터 9까지 반복한다. 단 i는 1씩 증가한다
        for (int x = 2; x < 10; x++) {
            // 정수형 i를 선언하고 i가 1부터 9까지 반복한다. 단 i는 1씩 증가한다
            for (int i = 1; i < 10; i++) {
                System.out.println(x + " * " + i + " = " + (x * i));
            }
            System.out.println();
        }
    }
}
