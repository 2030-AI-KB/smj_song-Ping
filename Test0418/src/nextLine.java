import java.util.Scanner;

public class nextLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//nextLine() : 공백을 포함한 문자열 입력에 사용(공백도 입력, Enter 입력)
		
		//char c= sc.next().charAt(0);//0번째
		
		String st1 = sc.next();	
		sc.nextLine();	//여기서 enter를 입력받게끔 하고 바로 소멸시킨다.
		String st2 = sc.nextLine();	//enter 도 하나의 문자처럼 입력된 상태
		
		System.out.println(st1);
		System.out.println(st2);
		
		//숫자형 정보와 문자형 정보를 섞어서 입력받을 때, 변수에 입력값이 제대로 들어가지 않았다면,
		//nextLine()을 통햬 입력되는 Enter값을 날리도록 한다.
		sc.close();
	}

}
