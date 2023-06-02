
public class ASCII {

	public static void main(String[] args) {
		// 아스키코드 : 문자 정보의 표현에 대한, 컴퓨터와의 일련의 약속(일대일대응)
		// 강제 형변환 : 특정 정보에 대해서, 어떠한 형태의 타입으로 변환할지 명시 
		char c = 'A'+10;//숫자 0이아닌 문자0으로써 들어가는 것.
		
		System.out.println("문자로 표현 : " + c);
		System.out.println("숫자로 표현 : " + (int)c);//변수 c의 정보를 int 형으로 변환하라.
		
	}

}
