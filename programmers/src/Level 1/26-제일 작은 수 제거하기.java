package programmer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Test02 {
	
	private static final Object[] Integer = null;

	public static void main(String[] args) {
		/*
		 * 제일 작은 수 제거하기
		 * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, 
		 * solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 
		 * 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
		 * 
		 * 입출력 예
			arr			return
			[4,3,2,1]	[4,3,2]
			[10]		[-1]
		 */
		
		int[] arr = {4,3,2,1};
		int[] answer2 = {-1};
		if (arr.length == 1) {
			System.out.println(-1);
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int j = 0,
			index = 0;
		for (int i = 0; i< arr.length; i++) {
			if (i == 0) {
				j = arr[i];
			} else if(arr[i] < j) {
				j = arr[i];
				index = i;
			}
			list.add(arr[i]);
		}
		
		list.remove(index);
		int size = list.size();
		int[] answer = new int[size];
		for (int i = 0; i < size; i++) {
			answer[i] = list.get(i);
		}
		System.out.println(Arrays.toString(answer));
	}
}
