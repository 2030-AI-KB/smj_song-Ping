package Ex;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 5명의 학생 성적을 입력받고, 이들의 합계와 평균을 구하라.
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int sum = 0;

		// 2.합계 구하기
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i]; // 현재 sum에 1번째 score값을 더해서 저장하라.
		}

		// 3.평균 구하기
		// [정수] / [정수] = [정수]
		// [실수] / [정수] = [실수]
		// [정수] / [실수] = [실수]
		double avg = (double) sum / arr.length;

		System.out.println("5명 학생의 성적 합계 : " + sum);
		System.out.println("5명 학생의 성적 평균 : " + avg);

	}

}
