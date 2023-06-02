import java.util.Scanner;

public class Function {

	static int s1() {
		return 1+1;
	}

	static int getSum(int a, int b) {
		System.out.println("덧셈을 수행합니다.");
		int sum = a + b;
		return sum;
	}

//	static int getSum(int a, int b) {
//		return a+b;
//	}

	// 함수 : 프로그램에게 지시할 명령문들을 묶어놓은 것.
	// 함수 안에 함수를 작성할 수는 없기 때문에, 외부에 선언해야 함.
	// 반환 : "뱉어낸다"
	// 매개변수 : 함수를 실행할 때 필요한 정보를 전달받는 역할 ("순서대로" 들어옴)

	// 함수 선언부 원형
	// 반환형 함수이름(매개변수타입 매개변수이름, ...){

	// }
	// 반환형 : 함수에서 "뱉어내는" 값의 타입(실제로 반환하는 값의 타입과 동일하지 않으면 에러 발생)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 프로그램을 실행하면, main 함수에 있는 내용만 실행

		// 예제 : 2개의 숫자를 입력받고 이들의 합을 출력하기.
		// 1. 2개의 숫자 입력받기
		int a = sc.nextInt();
		int b = sc.nextInt();

		
		s1();
		
		// 2. 2개의 숫자 합 출력
		// 함수 호출 : [함수이름](전송할 값, ...);
		// 전송할 값의 개수는 매개변수쌍의 개수와 동일해야 함
		int sum = getSum(a, b); // a와 b의 값을 전송하면서 getSum 함수를 실행하라.

		System.out.println("a와 b의 합은 : " + sum);
	}

}
