package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Text8 {

	public static void main(String[] args) {
		// 나누어 떨어지는 숫자 배열 
		// rray의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, 
		// solution을 작성해주세요. divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
		// 	arr 	     divisor	  return
		// [5, 9, 7, 10]	5	 [5, 10]

		int[] arr = {2, 36, 1, 3};
		int[] answer = {};
		int divisor = 5;
		boolean flag = false;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%divisor == 0) {
				list.add(arr[i]);
				flag = true;
			}
		}
		
		if (!flag) list.add(-1);
		
		answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i);
		}
		Arrays.sort(answer);
		System.out.println(Arrays.toString(answer));
	}
}
