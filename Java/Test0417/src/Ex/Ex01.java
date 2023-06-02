package Ex;

import java.util.Scanner;

public class Ex01 {
	//clock(int, int, int) : 현재 시각(시, 분, 초)를 입력받아 양식대로 출력하는 함수
	static String getTime(int h, int m, int s) {

		return "현재 시각은 " + h + "시 " + m + "분 " + s + "초 입니다.";
	}

	static String getAp(int h) {
		h = h / 12;
		String t;

		if (h > 0) {
			t = "현재는 오후 입니다.";
		} else {
			t = "현재는 오전 입니다.";
		}
		return t;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();

		// 2. 현재 시각 출력하는 함수 호출(참조)
		String time = getTime(h, m, s);
		String ap = getAp(h);

		System.out.println(time);
		System.out.println(ap);

		sc.close();
	}

}
//현재 시각을 입력받고 아래의 함수를 실행하게끔 하여라
//(현재 시각 입력은 main 함수에서 받도록 한다.)
//clock(int, int, int) : 현재 시각(시, 분, 초)를 입력받아 양식대로 출력하는 함수
//"현재 시각은 h시 m분 s초 입니다."

//-ap(int) : 현재가 낮인지 밤인지 출력하는 함수
//"현재는 낮입니다." or "현재는 밤입니다."