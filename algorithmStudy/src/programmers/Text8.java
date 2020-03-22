package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Text8 {

	public static void main(String[] args) {
		// ������ �������� ���� �迭 
		// rray�� �� element �� divisor�� ������ �������� ���� ������������ ������ �迭�� ��ȯ�ϴ� �Լ�, 
		// solution�� �ۼ����ּ���. divisor�� ������ �������� element�� �ϳ��� ���ٸ� �迭�� -1�� ��� ��ȯ�ϼ���.
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
