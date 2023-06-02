import java.util.Arrays;

public class array {

	public static void main(String[] args) {

		// 2차원 배열 : 행과 열이 함께 존재하는 배열
		// 2차원 배열 선언
		// (타입)(배열이름)[][] = new(타입)[배열크기][배열크기];
		int arr1[][] = new int[2][3];
		int arr2[][] = { { 10, 20, 30 }, { 100, 200, 300 } };
		// { 10, 20, 30 } -> 0번째 행의 정보, 각각 열의 번호는 0번, 1번, 2번이 된다.
		// { 100, 200, 300 } -> 1번째 행의 정보, 각각 열의 번호는 0번, 1번, 2번이 된다.

		System.out.println(Arrays.toString(arr2));
		// 1차원 배열 선언의 부가 설명
		// int a[] = new int[3]; -> 배열의 공간만 빌려받을 때
		// int a[] = {10, 20, 30}; -> 배열에 바로 값을 저장하면서 사용할 때
		// ->자동으로 배열의 크기가 3으로 지정됨
	}

}
