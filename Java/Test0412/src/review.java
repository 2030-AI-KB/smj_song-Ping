import java.util.Scanner;
//"java.util.Scanner를 현재 파일에 포함한다.(사용 예고)"

public class review {
	// 실행을 할 때, 메인 함수에 있는 내용만 실행한다.
	public static void main(String[] args) {
		// 출력문
		System.out.print("Hello, world!\n");// ()안의 내용만 출력. ()안에 아무것도 쓰지 않으면 아무것도 입력치 않은 것이라 빨간줄뜸.
		System.out.println("Hello, world!");// ()안의 내용 + 줄바꿈(\n)을 출력.

		// 변수 : "변할 수 있는 숫자",
		// ;(세미콜론) : 문장을 끝내는 역할.(=마침표)
		// 변수 선언(생성) : [자료형/타입] [변수이름];
		// 값 저장 : [변수이름] = [저장할 값];
		// 변수 초기화 : [자료형/타입] [변수이름] = [저장할 값];

		// 입력문
		Scanner sc = new Scanner(System.in);// "Scanner를 sc라는 이름으로 선언(사용)한다."

		//자료형 마다 입력받는 구문이 다름.
		int i = sc.nextInt();
		long l = sc.nextLong();
		float f = sc.nextFloat();
		double d = sc.nextDouble();
		char c = sc.next().charAt(0);
		String s = sc.next();

		sc.close();
	}

}
