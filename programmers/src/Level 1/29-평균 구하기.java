package programmer;

public class Test05 {

	public static void main(String[] args) {
		/*
		 * 평균 구하기
		 * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
		 * 
		 * 	arr				return
			[1,2,3,4]		2.5
			[5,5]			5
		 */
		
		int[] arr = {1,2,3,4};
		double total = 0;
		double answer = 0;
		
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		answer = total/arr.length;
		System.out.println(answer);
	}
}
