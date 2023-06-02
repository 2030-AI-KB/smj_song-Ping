import java.util.Scanner;

public class if_0412 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 연산자
		// 산술연산자 : +, -, *, /(몫 나누기), % (나머지 나누기)
		// 대입연산자 : = (오른쪽의 값을 왼쪽에 '대입'한다.)
		// 비교연산자 : <, <=, >, >=, ==(같다), !=(다르다)
		// 논리연산자 : && (그리고), || (또는)

		// 조건문 (if) : "만약 ~ 한다면", 조건을 따지면서 명령문을 선택하게끔 하는 조건문.
		// if - else if - else, switch
		// else if, else 는 생략 가능하지만, if를 제외하고 else if, else를 사용하면 오류 발생

		// 예제 : 입력받는 평점에 따라 학점을 출력하기
		// 1.평점 입력받기
		int score;

		System.out.print("학점을 입력해주세요  ");
		score = sc.nextInt();


		// if문 사용방법
		// if{ // if(조건) -> "만약 [조건]을 만족한다면,
		// 위 조건을 만족할 때, 실행할 명령문들.
		// }

		// 2.평점에 따라 학점 출력하기.
		// 평점의 값에 따라 학점을 다르게 출력해야함 -> 조건문 사용
		
//		방법 1) 비교연산자 이용한 조건문 
//		if (score >= 80 && score < 90) {	//score의 값이 90보다 크거나 같다면
//			System.out.println("B 학점 입니다.");
//		}

//		방법 2)if ~ else if 이용한 조건문 
		if (score >= 90) {
			System.out.println("A 학점 입니다.");
		} else if (score >= 80) { // 위 조건문을 만족하지 않고 스코어가 80점 이상이라면
			System.out.println("B 학점 입니다.");
		} else if (score >= 70) {
			System.out.println("C 학점 입니다.");
		} else {	// 위 조건들을 모두 만족하지 않는다면,
			System.out.println("F 학점 입니다.");
		}
		sc.close();
	}

}
