package aaa;

public class AutoCasting {
    public static void main(String[] args) {
        // int형 변수 num1를 선언하고 5를 대입한다.
        int num1 = 5;

        // int형 변수 num2를 선언하고 2를 대입한다.
        int num2 = 2;

        // num1/num2를 출력한다.
        System.out.println(num1 / num2);

        // 더블형으로 형변환(캐스팅)해서 num1/num2를 출력한다
        System.out.println((double)num1 / num2);
    }
}
