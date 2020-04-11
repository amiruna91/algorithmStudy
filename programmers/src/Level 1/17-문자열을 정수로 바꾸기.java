package programmers;

import java.util.Arrays;

public class Test17 {

	public static void main(String[] args) {
		/*
		 * 문자열을 정수로 바꾸기
		 * 문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.

			제한 조건
			s의 길이는 1 이상 5이하입니다.
			s의 맨앞에는 부호(+, -)가 올 수 있습니다.
			s는 부호와 숫자로만 이루어져있습니다.
			s는 0으로 시작하지 않습니다.
		 */
		
		// 바보같이... 그냥 Integer.paseInt 로 바로 바꾸면 되는것을...
		String s = "-1234";
		System.out.println(Integer.parseInt(s));
		int answer = 0;
		boolean flag = false;
		
		
		if (s.contains("-")) {
			s = s.substring(1);
			flag = true;
		}
		
		String[] strArr = s.split("");
		System.out.println(Arrays.toString(strArr));
		
		for (int i = 0; i < strArr.length; i++) {
			answer += (int) (Integer.parseInt(strArr[i])*(Math.pow(10, strArr.length - (i+1))));
		}
		
		if (flag) {
			System.out.println(-1*answer);
		} else {
			System.out.println(answer);
		}
		
	}
}
