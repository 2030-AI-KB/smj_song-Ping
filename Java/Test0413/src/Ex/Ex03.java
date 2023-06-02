package Ex;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();// t케이스 횟수

		for (int i = 1; i <= t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.println(a + b);
		}

	}

}
//10950번
