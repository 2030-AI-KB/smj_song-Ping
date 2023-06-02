package Ex;

public class Ex01 {

	public static void main(String[] args) {

		for (int i = 1; true; i++) {
			if (i == 100) {
				break;
			}
			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9 || i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
				System.out.println("'박수 짝'");
				continue;
			}
			System.out.println("  " + i + "  ");
		}

//		int i = 1;
//		while (true) {
//			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
//				System.out.print("'박수 짝'");
//				i++;
//				continue;
//			}
//			System.out.print("  " + i + "  ");
//
//			if (i <= 100) {
//				break;
//			}
//			i++;
//		}
//		int x = 1;
//		while (x <= 100) {
//			if (x % 10 == 3 || x % 10 == 6 || x % 10 == 9) {
//
//			}
//		}

//		int n = 1;
//		while (true) {
//			if (n % 10 != 3 || n % 10 != 6 || n % 10 != 9) { // 숫자에 3, 6, 9가 없는 경우
//				if (n % 10 == 3 || n % 10 == 6 || n % 10 == 9) { // 숫자에 3, 6, 9가 있는 경우
//					System.out.println("박수 짝"); // "숫자그대로" 출력
//					n++;
//					continue;
//				}
//				System.out.println(n); // "박수 짝" 출력
//				if (n == 100) {
//					break;
//				}
//			}
//			n++;
//		}
//		int i = 1;
//		while (true) {
//			if (i == 100) {
//				break;
//			}
//			// 십의 자리, 일의 자리 추출
//			int n1 = i / 10;// 십의 자리
//			int n2 = i % 10;// 일의 자리
//
//			// -숫자에 3,6,9가 없는 경우, 숫자를 그대로 출력
//			if (n1 == 3 || n1 == 6 || n1 == 9 || n2 == 3 || n2 == 6 || n2 == 9) {
//				System.out.println("박수 짝");
//				i++;
//				continue;
//			}
//			System.out.println(i);
//			i++;
//		}
		// 위의 break문을 만나면 이쪽으로 이동함.
	}

}
//369게임의 규칙을 이용한 프로그램 만들기
//무한 반복문으로 반복문 구현하기
//100이 될때까지 진행한다(100을 넘어서면 반복문 종료 -> break문 사용)
//-숫자에 3,6,9가 없는 경우, 숫자를 그대로 출력
//-숫자에 3,6,9가 있는 경우, "박수 짝"만 출력
//(조건문은 if만 사용하도록 한다.else if, else 모두 불허)