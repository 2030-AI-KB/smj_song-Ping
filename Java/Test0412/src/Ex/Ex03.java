package Ex;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		if (x > 0 && y > 0) { // x가 0보다 크고, y가 0보다 클때,
			System.out.println("1");
		} else if (x < 0 && y > 0) { // x가 0보다 작고, y가 0보다 클때,
			System.out.println("2");
		} else if (x < 0 && y < 0) { // x가 0보다 작고, y가 0보다 작을때,
			System.out.println("3");
		} else if (x > 0 && y < 0) {
			System.out.println("4");
		}
		sc.close();
	}

}
//14681번