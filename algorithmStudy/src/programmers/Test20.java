package pjtTest;

public class Test20 {

	public static void main(String[] args) {
		
		/*
		 * 짝수와 홀수
		 * 정수 num이 짝수일 경우 Even을 반환하고 홀수인 경우 Odd를 반환하는 함수, 
		 */
		
		int num1 = 3;
		int num2 = 4;
		String answer1 = num1%2 == 0 ? "Even" : "Odd";
		String answer2 = num2%2 == 0 ? "Even" : "Odd";
		
		System.out.println(answer1);
		System.out.println(answer2);
	}
}
