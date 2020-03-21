package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Test7 {

	public static void main(String[] args) {
		/*
		 * 같은 숫자는 싫어
		 * 배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 이때, 배열 arr에서
		 *  연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 단, 제거된 후 남은 수들을 반환할 
		 *  때는 배열 arr의 원소들의 순서를 유지해야 합니다. 
		 *  예를 들면:
		 *  arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
		 *  arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
		 *  배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 
		 *  완성해 주세요.
		 */
		
		int[] arr = {1,1,3,3,2,2,1,1};
		int[] answer = {};
		int taget = -1;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			if (taget != arr[i]) {
				list.add(arr[i]);
				taget = arr[i];
			}			
		}
		answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		System.out.println(Arrays.toString(answer));
	}
}
