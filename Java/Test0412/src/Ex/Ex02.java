package Ex;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a > b) {	//
			System.out.println(">");
		} else if (a < b) {
			System.out.println("<");
		} else if (a == b) {	// a와 b의 값이 같다면
			System.out.println("==");
		}
		sc.close();
	}

}
//1330번