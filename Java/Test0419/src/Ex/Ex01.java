package Ex;
//한빛 미디어에서 만드는 교재를 객체로 생성하여 정보를 출력하자

// Book 인터페이스
interface Book {
	// -필드 : publish("한빛 미디어")
	public static final String Publish = "한빛미디어";

	// -메소드 : print(), updown2000()
	abstract void print();

	abstract void upDown2000();

}

//JAVA 클래스 생성
//-멤버 : 개정년도(year), 이름(name, 상수로 선언한 뒤 "java"로 적용)
class Java implements Book {
	public final String name = "Java";
	int year;

	Java(int year) {
		this.year = year;
	}

	@Override
	public void print() {
		System.out.println("책 이름 : " + this.name);
		System.out.println("출판사 : " + Book.Publish);
		System.out.println("개정년도 : " + this.year);

	}

	@Override
	public void upDown2000() {
		if (year >= 2000) {
			System.out.println("개정된 버전입니다.");
		} else {
			System.out.println("개정되기 이전의 버전입니다.");
		}

	}

}

class Python implements Book {
	public static final String name = "Python";
	int year;

	Python(int year) {
		this.year = year;
	}

	@Override
	public void print() {
		System.out.println("책 이름 : " + name);
		System.out.println("출판사 : " + Book.Publish);
		System.out.println("개정년도 : " + year);

	}

	@Override
	public void upDown2000() {
		if (this.year >= 2000) {
			System.out.println("개정된 버전입니다.");
		} else {
			System.out.println("개정되기 이전의 버전입니다.");
		}

	}

}

public class Ex01 {

	public static void main(String[] args) {
		Java j = new Java(2003);
		j.print();
		j.upDown2000();
		System.out.println();

		Python p = new Python(1999);
		p.print();
		p.upDown2000();
	}

}
//한빛 미디어에서 만드는 교재를 객체로 생성하여 정보를 출력하자
// book 인터페이스
//-필드 : publish("한빛 미디어")
//-메소드 : print(), updown2000()

//print() -> 출판사, 개정년도, 책이름 출력
//updown() -> 2000년도 이후에 만들어졌다면 "개정된 버전입니다."
//				2000년도 이전에 만들어졌다면 "개정되기 이전의 버전입니다."

//JAVA 클래스 생성
//-멤버 : 개정년도(year), 이름(name, 상수로 선언한 뒤 "java"로 적용)

//Python 클래스 생성
//-멤버 : 개정년도(year), 이름(name, 상수로 선언한 뒤 "Python"로 적용)
