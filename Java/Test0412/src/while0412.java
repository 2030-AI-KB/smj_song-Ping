
public class while0412 {

	public static void main(String[] args) {
		// 반복문 : 특정 조건을 만족할때마다 명령문을 반복하는 구문
		// 종류 : for / while / do while
		// *반복문을 설계할 때에는, 반드시 실행의 끝이 존재하게끔 해야함.
		
		// 예제 : 1부터 10까지 출력하는 프로그램
		// while문 사용
		// while(조건문) {
		//		조건문을 만족할때마다 반복할 명령문. 
		//}
		//	증감연산자 : ++, --.
		
		// 반복할 명령문 : x를 1씩 증가, 출력문
		int x = 1;
		while (x <= 10) {
			System.out.println(x);
			x++;	//x=x+1;
		}

	}

}
