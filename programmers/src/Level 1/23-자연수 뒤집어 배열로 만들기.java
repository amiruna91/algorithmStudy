package programmer;

import java.util.ArrayList;
import java.util.Arrays;

public class SubText03 {

	public static void main(String[] args) {
		/*
		 * 자연수 뒤집어 배열로 만들기
		 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 
		 * 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
		 */
		
		long n = 12345678L;
//		
//		String number = String.valueOf(n);
//	    String[] items = number.split("");
//	    
//	    int[] answer = new int[items.length];
//	    for (int i=0; i<items.length; i++) {
//	    	int x = Integer.parseInt(items[i]);
//	    	answer[items.length - i -1] = x;
//	    }
//	    System.out.println(Arrays.toString(answer));
		
		// 내가 생각해본것
//		ArrayList<Integer> result = new ArrayList<Integer>();
//		while (n > 0) {
//			int x = (int) (n%10);
//			n = n/10;
//			result.add(x);
//			System.out.println(x);
//			System.out.println(n);
//		}
//		Integer[] answer = new Integer[result.size()];
//		result.toArray(answer);
//		System.out.println(Arrays.toString(answer));
	}
}
