package programmer;

import java.util.Arrays;
import java.util.Comparator;

public class SubText04 {

	public static void main(String[] args) {
		/*
		 *  정수 내림차순으로 배치하기
		 *  함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 
		 *  순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
		 */
		
		Long n = 118372L;
			
		String[] str = String.valueOf(n).split("");
		Arrays.sort(str, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < str.length; i++) {
			sb.append(str[i]);
		}
		
		long answer = Long.parseLong(sb.toString());	
		System.out.println(answer);
	}
}
