package programmers;

public class Test18 {

	public static void main(String[] args) {
		/*
		 * 시저암호
		 * 
		 * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 
		 * 방식을 시저 암호라고 합니다. 예를 들어 AB는 1만큼 밀면 BC가 되고, 3만큼 밀면 DE가 됩니다. 
		 * z는 1만큼 밀면 a가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, 
		 * solution을 완성해 보세요.
		 * 
		 *  s		n	result
			AB		1	BC
			z		1	a
			a B z	4	e F d
		 */
		String s = "a B z";
		int n = 4;
		char a = ' ';
		String answer = "";
		
		for (int i = 0; i < s.length(); i++) {
			a = s.charAt(i);
			if (a >= 'a' && a <= 'z') {
				System.out.println(a + n - 'z' + a);
				a = (a + n > 'z') ? (char) (a + n - 1 - 'z' + 'a') : (char) (a + n);
				answer += a;
			} else if (a >= 'A' && a <= 'Z') {
				a = (a + n > 'Z') ? (char) (a + n - 1 - 'Z' + 'A') : (char) (a + n);
				answer += a;
			} else if (a == ' ') {
				answer += (char) a;
			} 
		}
		System.out.println(answer);
	}
}
