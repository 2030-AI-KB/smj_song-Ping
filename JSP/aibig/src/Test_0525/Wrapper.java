package Test_0525;

public class Wrapper {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;

        System.out.println( num1 + num2 );

        Integer num3 = 1;
        Integer num4 = 2;
        System.out.println(num3 + num4);

        long num5 = 1;
        long num6 = 2;
        System.out.println(num5 + num6);

        Long num7 = 1L;
        Long num8 = 2L;
        System.out.println(num7 + num8);

        String a = "1";
        String b = "2";

        int a1 = Integer.parseInt(a);   //int형 정수로 바꿔주는 문법 Integer.parseInt()
        int a2 = Integer.parseInt(b);

        System.out.println(a1 + a2);


    }
}
