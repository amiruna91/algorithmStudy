package programmer;

public class Test01 {

	public static void main(String[] args) {
		/*
		 * 핸드폰 번호 가리기
		 * 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
		 * 전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 
		 * 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
		 * 
		 * 	phone_number		return
			01033334444			*******4444
			027778888			*****8888
		 */
		
		String num = "027778888";
		int length = num.length();
		StringBuffer sb = new StringBuffer(num);
		StringBuffer sb2 = new StringBuffer();
		
		for (int i = 0; i < length-4; i++) {
			sb2.append("*");
		}
		
		sb.replace(0, length-4, sb2.toString());
		System.out.println(sb.toString());
	}
}
