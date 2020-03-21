package programmers;

public class Test5 {

	public static void main(String[] args) {
		int n = 5;		// n은 총 학생수
		int[] lost = {2, 4},	// lost 체육복을 잃어 버린 학생의 번호가 담긴 배열
			  reserve = {1, 3, 5};	// reserve 여벌의 체육복이 있는 학생
		int max = 0;	// 수업을 듣는 학생의 최대값
		/*
		 *  2 <= n <= 30
		 *  1 <= lost <= n
		 *  1 <= reserve <= n
		 *  앞뒤 학생한테만 빌려줄수 있다.
		 *  여벌 체육복이 있는 학생도 잃어 버릴 수 있다.
		 */
		
		//lost[i] == reserve[i]???
		//lost[i] + 1 ? lost[i] - 1 ?? reserve에 있나?
		//reserve에 앞번호가 빌려줘
		for (int i = 0; i < lost.length; i++) {
			
			
		}
	}
}
