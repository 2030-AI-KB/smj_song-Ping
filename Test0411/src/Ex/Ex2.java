package Ex;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 x를 입력해주세요.");
		int x = sc.nextInt();
		
		System.out.println("숫자 y를 입력해주세요.");
		int y = sc.nextInt();

		System.out.println(x + " + " + y + " = " + (x + y));
		System.out.println(x + " - " + y + " = " + (x - y));
		System.out.println(x + " * " + y + " = " + (x * y));
		System.out.println(x + " / " + y + " = " + (x / y));
		System.out.println(x + " % " + y + " = " + (x % y));
		
		sc.close();

	}

}
