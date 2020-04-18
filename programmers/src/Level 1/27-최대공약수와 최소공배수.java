package programmer;

public class Test03 {

	public static void main(String[] args) {
		
		/*
		 * 최대공약수와 최소공배수
		 * 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 
		 * 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 
		 * 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
		 * 
		 * 	n	m	return
			3	12	[3, 12]
			2	5	[1, 10]
		 */
		
		// 유클리드 호제법 사용하기!!! 꼭 기억하자
		int n = 3;
		int m = 12;
		int small = 0,
			big	  = 0;
		
		if (n > m) {
			small = m;
			big = n;
		} else {
			small = n;
			big = m;
		}
		
		int[] answer = new int[2];
		answer[0] = min(big, small);
		answer[1] = small*big/answer[0];
		
	}
	// 유클리드 호제법 사용하기!!! 꼭 기억하자
	public static int min(int a, int b) {
		if (a%b == 0) return b;
		return min(b,a%b);
	}
}
