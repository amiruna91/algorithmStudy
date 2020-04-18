package programmer;

public class Test01 {

	public static void main(String[] args) {
		/*
		 * 정수 제곱근 판별
		 * 문제 설명
			임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
			n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
			
			입출력 예
			n	return
			121	144
			3	-1
		 */
		
		long n = 121L;
		long answer = 0L;
		
		double d = Math.sqrt(n);
		double c = Math.ceil(d);
		
		answer = (c != d) ? -1 : ((long)d + 1) * ((long)d + 1); 
		
		System.out.println(answer);
		
		// 다른사람 풀이
		// math.pow() 함수 사용. 
		// 예) 11의2승을 구할때   math.pow(11,2) 사용하면 된다.
		/*
		 *  if (Math.pow((int)Math.sqrt(n), 2) == n) {
            	return (long) Math.pow(Math.sqrt(n) + 1, 2);
        	}

        	return -1;
		 */
	}
}
