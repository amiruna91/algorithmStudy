package programmers;

import java.util.Arrays;

public class Test3 {
	
	public static void main(String[] args) {
		//1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
		int[] array = {1,5,2,6,3,7,4};
		int[][]cmd = {{2,5,3},{4,4,1},{1,7,3}};
		int[] arr3 = new int[cmd.length];
		
		for (int i = 0; i < cmd.length; i++) {
			int[] arr2 = Arrays.copyOfRange(array, cmd[i][0]-1, cmd[i][1]);
			
			//System.out.println(Arrays.toString(arr2));
			
			Arrays.sort(arr2);
			
			//System.out.println(Arrays.toString(arr2));
			//System.out.println(arr2[cmd[i][2]-1]);
			
			arr3[i] = arr2[cmd[i][2]-1];
			
			//System.out.println(Arrays.toString(arr3));
		}
		System.out.println("\n최종 출력: " + Arrays.toString(arr3));
	}
}
