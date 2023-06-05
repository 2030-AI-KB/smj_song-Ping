package Test_0523;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //스캐너 객체 선언
        Scanner sc = new Scanner(System.in);

        System.out.println("a에 들어갈 숫자를 입력해주세요");
        //정수형 변수 a를 선언하고 값을 스캐너로 받아온다.
        int a = sc.nextInt();

        System.out.println("b에 들어갈 숫자를 입력해주세요");
        //정수형 변수 b를 선언하고 값을 스캐너로 받아온다.
        int b = sc.nextInt();

        System.out.println("연산기호 +, -, *, / 중 하나를 입력해주세요");
        String c = sc.next();

        if (c.equals("+")) {                 //c 가 + 라면
            System.out.println("a 더하기 b 의 결과 : " + add(a, b));
        } else if (c.equals("-")) {         //c 가 - 라면
            System.out.println("a 빼기 b 의 결과 : " + sub(a, b));
        } else if (c.equals("/")) {        //c 가 / 라면
            System.out.println("a 나눗셈 b 의 결과 : " + div(a, b));
        } else {                          //c 가 * 라면
            System.out.println("a 곱셈 b 의 결과 : " + mul(a, b));
        }

    }

    /*
     * * method name : add
     *   parameter : int, int
     *   return : int
     *   description : 두 수를 더하여 리턴한다.
     */
    //덧셈 메소드 add 정의(return 타입은 int형으로 선언 하고 파라미터는 a와 b와 두개가 주어진다.)
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    /*
     * * method name : sub
     *   parameter : int, int
     *   return : int
     *   description : 두 수를 빼서 리턴한다.
     */
    //뺄셈  메소드 sub 정의(return 타입은 int형으로 선언 하고 파라미터는 a와 b와 두개가 주어진다.)
    public static int sub(int a, int b) {
        int sub = a - b;
        return sub;
    }

    /*
     * * method name : div
     *   parameter : int, int
     *   return : int
     *   description : 두 수를 나누어 리턴한다.
     */
    //나눗셈 메소드 div 정의(return 타입은 int형으로 선언 하고 파라미터는 a와 b와 두개가 주어진다.)
    public static int div(int a, int b) {
        int div = a / b;
        return div;
    }

    /*
     * * method name : mul
     *   parameter : int, int
     *   return : int
     *   description : 두 수를 곱하여 리턴한다.
     */
    //곱셈 메소드 mul 정의(return 타입은 int형으로 선언 하고 파라미터는 a와 b와 두개가 주어진다.)
    public static int mul(int a, int b) {
        int mul = a * b;
        return mul;
    }
}
