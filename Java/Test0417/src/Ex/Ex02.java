package Ex;

class Women {
	public String name; // 인스턴스 변수
	public String gender = "여성"; // 클래스(static) 변수로 선언하고, "여성"으로 초기화
	public boolean student; // 학생이면 True, 아니라면 False

	public Women(String name, boolean student) {
		this.name = name;
		this.student = student;

	}

	// 1.이름과 성별 출력하는 메소드
	public void Print() {
		System.out.println("( 이름 : " + this.name + ", 성별 : " + this.gender + " )");
	}

	// 2. 학생인지 교사인지를 출력하는 메소드
	public void Student() {
		if (this.student == true) {
			System.out.println("학생입니다.");
		} else {
			System.out.println("교사입니다.");
		}

	}
}

public class Ex02 {
	public static void main(String[] args) {
		// 학생객체
		Women me = new Women("송민정", true);
		Women you = new Women("배숙희", true);
		// 교사객체
		Women teacher = new Women("이유나", false);

		me.Student();
		me.Print();
		System.out.println();

		you.Student();
		you.Print();
		System.out.println();

		teacher.Student();
		teacher.Print();
	}
}
//women_it 클래스 매개변수
