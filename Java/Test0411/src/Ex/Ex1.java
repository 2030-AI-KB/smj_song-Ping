package Ex;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력해주세요.");
		String name = sc.next();

		System.out.println("나이를 입력해주세요.");
		int age = sc.nextInt();	//정수 입력문에 실수(double, float)를 입력할 경우, 소수점 밑의 숫자를 모두 제외하고 저장함.

		System.out.println("키를 입력해주세요.");
		double height = sc.nextDouble();

		System.out.println("혈액형을 입력해주세요.");
		String blood = sc.next();

		System.out.println(name + " 님의 나이는 " + age + " 키는 " + height + " 혈액형은 " + blood + " 입니다.");
		
		sc.close();
	}

}
