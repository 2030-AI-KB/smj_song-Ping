
public class array {

	public static void main(String[] args) {
		// 배열 : 같은 타입의 여러 값을 저장할 수 있는 변수 공간

		// 배열 선언
//		(타입)(배열이름) = new(타입)[배열크기];
		int arr[] = new int[5];	//이름이 arr인 정수형 배열을 선어하고, 이 배열의 크기를 5로 해라.
		//arr 배열의 배열번호는 0~4번까지 있다.(5번은 없음)
		
		//배열값 저장 : (배열이름)[배열인덱스] = (저장할 값);
		arr[0] = 100;	//arr 배열의 0번째 공간에 100을 저장하라.
		
		System.out.println("어떤 배열 공간의 값 : " + arr[0]);
	}

}
