import java.util.Scanner;	// 입력문 작성 시 필수로 작성할 것
// "해당 파일에, java.util.Scanner라는 라이브러리를 포함하도록 하라."
// 라이브러리 :: "도서관", 여러 명령문들을 포함하는 "도서관"

public class input {
	public static void main(String[] args) {
		// 변수(변하는 숫자), 상수(변하지 않는 숫자)
		// 타입의 종류
		int i;		// int(integer) :: 정수형(소수점이 없는 숫자) -128 ~ 127
		long l;		// long :: 정수형(소수점이 없는 숫자)		-1024 ~ 1023
			// -> int형보다 표현범위가 더 넓음
		float f;	// float :: 실수형(소수점이 있는 숫자)
		double d;	// double :: 실수형(소수점이 있는 숫자)
			// -> float형보다 더 자세한 표현 가능
		char c;		// char(charater) :: 문자형
		String s;	// String :: 문자열 (한글은 무조건 String에 담야아함)
		
		// * 변수 응용
		// 변수 선언(생성) :: [타입] [변수이름(name)];
			// "[타입]의 정보를 담을 수 있고, 이름이 [name]인 변수를 생성하라."
			// (ex) int num;	"int형 정보를 담을 수 있고, 이름이 num인 변수를 생성하라."
		// 값 저장(변경) :: [변수이름(name)] = [저장할 값];
			// "[name] 변수에 이 값을 저장하라."
			// (ex) num = 3;	"num 변수에 3이라는 값을 저장하라."
			// 주의점 :: 선언하지 않은 변수에는 값을 저장할 수 없다.
		// 초기화 :: [타입] [변수이름(name)] = [저장할 값];
			// 변수를 선언함과 동시에, 초기값을 바로 저장하게끔 하는 문법
			// (ex) int num=3;	"int형의 정보를 담을 수 있고, 이름이 num인 변수를 생성함과 동시에
			//					이 num이라는 변수에 3이라는 값을 저장하라."
		
		// 입력문
		Scanner sc=new Scanner(System.in);	// Scanner를 sc라는 이름으로 사용한다.
		int v1=sc.nextInt();	// int형 변수 입력문
		long v2=sc.nextLong();	// long형 변수 입력문
		float v3=sc.nextFloat();	// float형 변수 입력문
		double v4=sc.nextDouble();	// double형 변수 입력문
		char v5=sc.next().charAt(0);		// char형 변수 입력문
		String v6=sc.next();	// String형 변수 입력문
		
		System.out.println("두 입력값의 결과: "+(1+2));
	}
}