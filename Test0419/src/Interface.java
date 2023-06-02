//인터페이스 : "추상 클래스와 매우 유사"
//		"구체적으로 명시된 멤버 함수가 거의 없다고 보아도 됨"
//		"인터페이스의 모든 필드는 변수가 아닌 상수로 취급"

interface Animal {
	// 멤버 함수는 모두 추상 클래스(abstract)로, 필드는 모두 상수(final)로 선언한다.
	// static : 해당 클래스를 통해 만들어진 객체가 '공유'하는 값.
	// final : 상수를 선언할 때 사용되는 키워드 / 처음 들어가는 값에서 변경x
	public static final String Location = "00동물원";

	abstract public void cry();

}

class Cat implements Animal { // 인터페이스 상속 : implements
	@Override
	public void cry() {
		System.out.println("하아악");
	}

}

public class Interface {

	public static void main(String[] args) {
		// 추상 클래스와 마찬가지로, 인터페이스 자체만으론 객체 생성x
		// Animal a = new Animal();

		// 인터페이스를 상속받아 추상 메소드 정의를 해야 객체 생성이 가능하다.
		Cat c = new Cat();
		System.out.println("위치하는 곳 : " + c.Location);
		c.cry();

	}

}
