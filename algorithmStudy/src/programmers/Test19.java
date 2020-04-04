package programmers;

public class Test19 {

	public static void main(String[] args) {
		/*
		 * 약수의 합
		 * 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
		 * 	입출력 예 #1
			12의 약수는 1, 2, 3, 4, 6, 12입니다. 이를 모두 더하면 28입니다.

			입출력 예 #2
			5의 약수는 1, 5입니다. 이를 모두 더하면 6입니다.
		 */
		
		int n = 12;
		int answer = 0;
		
		// 내가 풀어낸 가장 기본 방법
		for (int i = 1; i <= n; i++) {
			if (n%i == 0) answer += i;
		}
		System.out.println(answer);
		
		int answer2 = 0;
		// 다른 사람이 푼 더 간단한 방법
		for (int i = 1; i <= n/2; i++) {   // <----- 가장 작은 약수는 1 다음 2 이기 때문에 구하는 수의 절반 까지만 값을 증가
			if (n%i == 0) answer2 += i;	   //		시키면 된다.
		}
		System.out.println(answer2 + n);
	}
}
