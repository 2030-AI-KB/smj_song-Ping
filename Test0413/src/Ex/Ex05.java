package Ex;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1.배열의 크기 입력받기(+배열 선언)
		int n = sc.nextInt();
		int arr[] = new int[n];

		// 2. 기준점이 되는 숫자(x)입력받기
		int x = sc.nextInt();

		// 3.배열값 입력받기
		for (int i = 0; i < n; i++) {// i는 0~(n-1)까지 돌게 됨
			arr[i] = sc.nextInt();

		}
		// 4.x와 arr의 값들을 하나씩 비교해서, 출력하기
		for (int i = 0; i < n; i++) {
			if (arr[i] < x) {
				System.out.print(arr[i] + " ");
				if(i != (n-1)) {
					System.out.print(" ");
				}
			}
		}
	}
}
//10871번
//주어진 숫자들 중에서 특정 값(x)보다 작은 것만 출력한다.
//배열에 입력할 숫자들과 x의 값을 하나씩 비교하여, 작은 수만 출력한다.
