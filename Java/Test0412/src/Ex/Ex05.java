package Ex;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		1)for문
		// 0! = 1
		int a = sc.nextInt();
		int sum = 1;
//		for (int i = 1; i <= a; i++) {
//			// System.out.println(i);
//			sum *= i; // sum= sum*i;
//		}
		System.out.println(sum);
//		sc.close();

//		2)while문
		while (a > 0) { // n이 양수라면
			sum *= a;
			a--;
		}
		System.out.println(sum);
		//n이 0이 되는 순간에는, while문 종료
		
	}

}
