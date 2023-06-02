package Ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("평점을 입력해주세요  ");
		int score = sc.nextInt();

		score = score / 10;

		if (score >= 9 || score == 10) {
			System.out.println("A");
		} else if (score >= 8) {
			System.out.println("B");
		} else if (score >= 7) {
			System.out.println("C");
		} else if (score >= 6){
			System.out.println("D");
		} else {
			System.out.println("F");
		}

		sc.close();

	}

}