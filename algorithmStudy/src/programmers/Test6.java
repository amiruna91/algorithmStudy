package programmers;

public class Test6 {

	public static void main(String[] args) {
		/*
		 * 가운데 글자 가져오기
		 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 
		 * 가운데 두글자를 반환하면 됩니다.
		 * 예) "abcde"  ---> c
		 * 	   "wedc"   ---> ed
		 */
		
		String s 	  = "abcde",
			   answer = "";
		int i = s.length();
		System.out.println(i);
		
		answer = (i%2 == 0) ? s.substring(i/2 - 1, i/2 + 1) : s.substring(i/2, i/2+1);
		System.out.println(answer);
	}
}
