package programmer;

public class SubTest01 {

	public static void main(String[] args) {
		
		/*
		 *  이상한 문자만들기
		 *  문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 
		 *  구분되어 있습니다. 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 
		 *  바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
		 *  	s					return
			try hello world		TrY HeLlO WoRlD
		 */
		
		String s = "try hello world";
		String answer = "";
		StringBuilder str = new StringBuilder();
		int count = 1;
		
		int len = s.length();
		for (int i = 0; i < len; i++) {
			if (s.charAt(i) == ' ') {
				str.append(s.charAt(i));
				count = 1;
			} else if (s.charAt(i) != ' ') {
				if (count%2 == 0) {
					str.append(s.toLowerCase().charAt(i));
					count++;
				} else {
					str.append(s.toUpperCase().charAt(i));
					count++;
				}
			}
		}
		System.out.println(str.toString());
	}
}
