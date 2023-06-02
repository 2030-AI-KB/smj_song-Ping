package Ex;

//shape 클래스 생성(추상 클래스로 생성하기)
abstract class Shape {
	// getSize() : 넓이 반환하는 함수
	abstract public double getSize();

	abstract public void Print();
}

//Circle 클래스 생성
class Circle extends Shape {

// -멤버변수 : radius(반지름)
	double radius;

	public Circle(int radius) {
		this.radius = radius;
	}

//shape 상속받아 getSize() 구성하기
	@Override
	public double getSize() {
		return radius * radius * 3.14;
	}

	@Override
	public void Print() {
		// TODO Auto-generated method stub

	}

}

class Triangle extends Shape {

	int h; // 높이
	int w; // 밑변
	boolean tf; // 직각삼각형인지 아닌지

	public Triangle(int h, int w) {
		this.h = h;
		this.w = w;
	}

	@Override
	public double getSize() {

		return h * w * (0.5);
	}

	public boolean right() {

		return false;
	}

	@Override
	public void Print() {

	}

}

class Rectangle extends Shape {

	int h; // 높이
	int w; // 밑변

	public Rectangle(int h, int w) {
		this.h = h;
		this.w = w;
	}

	@Override
	public double getSize() {

		return h * w;
	}

	@Override
	public void Print() {
		// TODO Auto-generated method stub

	}

}

public class Ex02 {

	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		Triangle t1 = new Triangle(1, 5);
		Rectangle r1 = new Rectangle(2, 5);

		System.out.println("원의 넓이는 " + c1.getSize());
		System.out.println("삼각형의 넓이는 " + t1.getSize());
		System.out.println("사각형의 넓이는 " + r1.getSize());
		// t1.getSize();

	}

}
// shape 클래스 생성(추상 클래스로 생성하기)
// getSize() : 넓이 반환하는 함수

// Circle 클래스 생성
// - 멤버변수 : radius(반지름)
// shape 상속받아 getSize() 구성하기

// Triangle 클래스 생성
//-멤버 변수 : w(밑변), h(높이), boolean tf(직각삼각형인지 아닌지)
//shape 상속받아 getSize() 구성하기
// -right() : 직각삼각형인지 아닌지 출력해주는 함수

// Rectangle 클래스 생성
//- 멤버변수 :w(밑변), h(높이)
//- shape 상속받아 getSize() 구성하기

//main에서 수행할 명령문
//-Circle에서 수행할 명령문
//-Triangle에 대한 객체 생성
//-Rectangle에 대한 객체 생성
//(객체 생성 시, 각 멤버 변수 초기화하기)

//-각 객체에 대하여 print, getsize 함수 실행
//ex) "원 객체 입니다." "반지름 : 5" "이 원의 넓이는 78.5입니다."