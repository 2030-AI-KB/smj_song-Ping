
// 추상클래스 ( + 추상 메소드)

// 추상 클래스 구현
// abstract class 클래스이름 {
//		클래스에 들어갈 멤버
// }
//추상 클래스에는 추상 메소드를 하나 이상을 표함해야 함
abstract class Animal {
	// 본래 메소드는 함수 선언 + 함수 구체화 형태가 같이 있어야 하지만
	// 추상 메소드의 경우는 함수 선언만 함
	// abstract [메소드 선언부(접근제어자, 반환형, 함수이름 등)];
	abstract public void cry();
}

class Cat extends Animal {// 일반적인 클래스 : 자식 클래스
	// 부모 클래스에서 선언만 되어있는 cry() 힘수를 전달받은 상태
	// cry() 함수에 대한 명령문 작성은 자식 클래스에게 떠넘기고 있는 상황 -> 오버라이딩(덮어쓰기)

	@Override
	public void cry() {
		System.out.println("야옹");

	}

}

class Dog extends Animal {

	@Override
	public void cry() {
		System.out.println("멍멍");

	}

}

public class Abstract {

	public static void main(String[] args) {
		// Animal cat = new Animal();
		// 추상 클래스를 통해서 객체를 바로 생성할 수 없음
		// 추상 클래스를 상속받은 클래스에서 구체화하여 객체를 생성해야함(오버라이딩 개념)
		
		Cat c = new Cat();
		Dog d = new Dog();

		c.cry();
		d.cry();
	}

}
