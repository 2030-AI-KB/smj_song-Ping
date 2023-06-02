import java.util.Scanner;

public class double_repeat {

	public static void main(String[] args) {
		// 2중 반복문(feat.2차원 배열)

		// 예제:: 4명 학생의 국영수 점수를 입력받고 이들의 각 학생의 성적 평균을 내어라.
		// 학생을 행으로 취급, 과목을 열로 취급
		Scanner sc = new Scanner(System.in);
		// 1. 각 학생의 국영수 정수 입력
		int score[][] = new int[4][3];
		for (int i = 0; i < 4; i++) { // i가 0번부터 3번까지
			for (int k = 0; k < 3; k++) { // k가 0번부터 2번까지
				score[i][k] = sc.nextInt();

			}
		}

		// 2.각 학생의 성적 평균 연산
		for (int i = 0; i < 4; i++) { // i가 0번부터 3번까지
			// (1) 합계 구하기
			int sum = 0;
			for (int k = 1; k < 3; k++) { // k가 0번부터 2번까지
				sum += score[i][k]; // 특정 학생의 국영수 점수 덧셈 연산
			}
			// 여기까지 오면, i 번째 학생의 국영수 합계가 sum에 저장되어 있음

			// (2) 평균을 내어서 바로 출력
			double avg = (double) sum / 3;
			System.out.println((char) (i + 'A') + " 번째 학생의 평균은 " + avg);
		}
	}

}
