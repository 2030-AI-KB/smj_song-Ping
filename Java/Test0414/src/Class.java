//객체: 실생활 속에 존재하는 모든 물체/사물.
// 클래스를 통해 만들어 진것.

//클래스 : 객체를 만들기 위해 존재하는 '틀' -> 객체를 찍어내는 역할
//자료형 및 타입을 임의로 정의해서 사용하는 '틀'
class Person {
	// 상태 -> 멤버 변수
	// 멤버 변수 선언
	// [접근제어자][타입][변수이름];
	public String name; // 이름
	public String gender; // 성별

	// 행동 -> 멤버 변수
	
}

//파일 안에 대표 클래스가 반드시 하나는 잇어야함.
public class Class { // 대표 클래스 : main을 여기에 작성

	public static void main(String[] args) {
		// 객체 생성
		// [클래스명][객체명]= new [클래스명]();
		Person p = new Person();	//"Person 타입의 객체 lee를 선언하라."
		Person n = new Person();
		
		//객체 멤버 접근
		//[객체명].[멤버이름]
		p.name = "minjeong";
		p.gender = "Woman";
		
		n.name = "DH";
		n.gender = "Man";
		
		System.out.println("p의 name 값 :" + p.name );
		System.out.println("p의 gender 값 : " + p.gender );
		System.out.println("-------------------------------");
		System.out.println("n의 gender 값 : " + n.gender );
		System.out.println("n의 gender 값 : " + n.gender );
		
		//클래스를 통해서 모양을 찍어내고
		// 객체가 된 상태로 속을 채워낸다.
		
	}

}
