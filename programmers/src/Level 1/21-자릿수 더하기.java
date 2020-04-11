package programmer;

public class SubTest02 {

	public static void main(String[] args) {
		/*
		 *  자릿수 더하기
		 *  자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
			예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
			N		answer
			123		6
			987		24
		 */
		
		int n = 123;
		int result = 0;
		String s = String.valueOf(n);
		String[] str = s.split(""); 
		
		for (int i = 0; i < str.length; i++) {
			int a = Integer.parseInt(str[i]);
			result +=a;
		}
		System.out.println(result);
		
		/*
		 *  다른 사람 풀이
		 *  int answer = 0;

        	while(true){
            	answer+=n%10;
            	if(n<10)
                break;

            	n=n/10;
        	}	
		 */
	}
}
