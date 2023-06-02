package Ex;

//시계 클래스 만들기
class Clock {
	// 멤버 변수 : 시(hour), 분(min), 초(sec)
	public int hour;
	public int min;
	public int sec;

	// -생성자 :"새로운 시각에 대한 객체 생성합니다." 출력한 뒤, 각 변수 초기화
	public Clock(int hour, int min, int sec) {
		System.out.println("새로운 시각에 대한 새로운 객체를 생성합니다.");
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}

	// 멤버 함수
	public void ClockPrint() { // 1. 현재 시각 양식대로 출력해주는 메소드
		if (this.hour < 10) {
			System.out.print("0");
		}
		System.out.print(hour + " : ");
		if (this.min < 10) {
			System.out.print("0");
		}
		System.out.print(min + " : ");
		if (this.sec < 10) {
			System.out.print("0");
		}
		System.out.print(sec + " ");

		// System.out.println("현재 시각은 " + hour + "시 " + min + "분 " + sec + "초 입니다.");

	}

	public void ApPrint() {
		if (hour < 12) {
			System.out.print("현재는 오전입니다. AM ");
			ClockPrint();
		} else {
			System.out.print("현재는 오후입니다. PM ");
			hour -= 12;
			ClockPrint();
			// System.out.print("현재 시각은 " + hour%12 + ": " + min + ": " + sec );
		}
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// 객체 생성
		Clock c1 = new Clock(9, 10, 30);
		// c1.ClockPrint();
		c1.ApPrint();
		System.out.println();

		Clock c2 = new Clock(23, 40, 00);
		// c2.ClockPrint();
		c2.ApPrint();

	}

}
//시계 만들기 클래스
//-멤버 변수 : 시(hour), 분(min), 초(sec)
//-멤버 함수 : 
// 현재 시각 양식대로 출력해주는 메소드
//-오전인지 오후인지를 출력해주고 표준 시각대로 출력해주는 메소드 
// ex) 23:59:59 -> "현재는 오후 입니다. PM 11:59:59"
//-생성자 :"새로운 시각에 대한 객체 생성합니다." 출력한 뒤, 각 변수 초기화

//객체 생성
//-9:10:30의 정보를 갖는 객체 생성
//-4:40:00의 정보를 갖는 객체 생성

//각 객체에 대하여 2개의 메소드 실행하기
