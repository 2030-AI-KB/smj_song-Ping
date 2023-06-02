import java.util.Scanner;

public class switch0412 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 예제 : 입력받는 평점에 따라 학점을 출력하기
		// 1.평점 입력받기
		int score;

		System.out.print("학점을 입력해주세요  ");
		score = sc.nextInt();

		// 평점에 따라 학점 출력하기.
		// 평점의 값에 따라 학점을 다르게 출력해야함 -> 조건문 사용
		// switch(값을 비교할 변수 v){
		//	case [값1]:
		//		[값1]과 v가 같을 경우 실행할 명령문
		//	case [값2]:
		//		[값2]과 v가 같을 경우 실행할 명령문
		//	default:
		//		위의 case에 제시된 값들과 모두 같지 않을 경우 실행할 명령문.
		score = score/10;
		
		switch (score) {
		case 10:
		case 9:
			System.out.println("A학점입니다.");
			break;
		case 8:
			System.out.println("B학점입니다.");
			break;
		case 7:
			System.out.println("C학점입니다.");
			break;
		default:
			System.out.println("F학점입니다.");
			break;
		}
		sc.close();
	}

}
