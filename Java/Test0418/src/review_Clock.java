import java.util.Scanner;

class Time{		// 부모 클래스
	// 멤버 변수 :: 시(hour), 분(min), 초(sec)
	public int hour;
	public int min;
	public int sec;
	
	// 생성자
	public Time(int h, int m, int s) {
		System.out.println("Clock 생성자 실행");
		this.hour=h;
		this.min=m;
		this.sec=s;
	}
	
	public void Print() {
		System.out.println("현재 시각은 "+this.hour+"시 "+this.min+"분 "+this.sec+"초입니다.");
	}
}

// "상속을 받을 시에, 부모 클래스가 있다면 부모 클래스의 생성자를 먼저 사용해라."
// super() :: 부모 클래스의 생성자를 실행하게끔 한다.
class SmartClock extends Time{		// 자식 클래스
	// 멤버 변수 :: { 시(hour), 분(min), 초(sec) }, 운영체제 버전(os), 걷기 횟수(walk)
	public String os;	// 운영체제 버전
	public int walk;	// 걷기 횟수
	
	public SmartClock(int h, int m, int s, String os, int w) {
		super(h, m, s);		// 부모 클래스의 생성자를 실행하여, 시분초의 정보를 초기화한다.	
			// 자식 클래스 생성자 실행 시, super()를 가장 먼저 실행해줘야한다.
		System.out.println("SmartClock 생성자 실행");
		this.os=os;
		this.walk=w;
	}
	
	public void Print() {
		System.out.println("현재 시각은 "+this.hour+"시 "+this.min+"분 "+this.sec+"초입니다.");
		System.out.println("운영체제: "+this.os);
		System.out.println("현재까지 걸은 횟수: "+this.walk);
	}
}

public class review_Clock {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		// 객체 생성
		Time c=new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
		
		int h=sc.nextInt();
		int m=sc.nextInt();
		int sec=sc.nextInt();
		String o=sc.next();
		int w=sc.nextInt();
		SmartClock s=new SmartClock(h,m,sec,o,w);
		
		c.Print();
		s.Print();		// 오버라이딩 :: 부모 클래스 메소드의 내용을 덮어썼다.
		
		sc.close();
	}
}
