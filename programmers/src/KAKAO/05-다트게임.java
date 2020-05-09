package exam;


public class Kakao02 {

	public static void main(String[] args) {
		/*
		 * 카카오톡 다트게임 문제
		 * 
		 * 	1. 다트 게임은 총 3번의 기회로 구성된다.
			2. 각 기회마다 얻을 수 있는 점수는 0점에서 10점까지이다.
			3. 점수와 함께 Single(S), Double(D), Triple(T) 영역이 존재하고 각 영역 당첨 시 점수에서 1제곱, 
			   2제곱, 3제곱 (점수1 , 점수2 , 점수3 )으로 계산된다.
			4. 옵션으로 스타상(*) , 아차상(#)이 존재하며 스타상(*) 당첨 시 해당 점수와 바로 전에 얻은 점수
			   를 각 2배로 만든다. 아차상(#) 당첨 시 해당 점수는 마이너스된다.
			5. 스타상(*)은 첫 번째 기회에서도 나올 수 있다. 이 경우 첫 번째 스타상(*)의 점수만 2배가 된다. (예제 4번 참고)	
			6. 스타상(*)의 효과는 다른 스타상(*)의 효과와 중첩될 수 있다. 이 경우 중첩된 스타상(*) 점수는 4배가 된다. (예제 4번 참고)
			7. 스타상(*)의 효과는 아차상(#)의 효과와 중첩될 수 있다. 이 경우 중첩된 아차상(#)의 점수는 -2배가 된다. (예제 5번 참고)
			8. Single(S), Double(D), Triple(T)은 점수마다 하나씩 존재한다.
			9. 스타상(*), 아차상(#)은 점수마다 둘 중 하나만 존재할 수 있으며, 존재하지 않을 수도 있다.
			0~10의 정수와 문자 S, D, T, *, #로 구성된 문자열이 입력될 시 총점수를 반환하는 함수를 작성하라.
		 * 
		 * 	1	1S2D*3T		37		1^1 * 2 + 2^2 * 2 + 3^3
			2	1D 2S# 10S	9		1^2 + 2^1 * (-1) + 10^1
			3	1D2S0T		3		1^2 + 2^1 + 03
			4	1S*2T*3S	23		1^1 * 2 * 2 + 2^3 * 2 + 3^1
			5	1D#2S*3S	5		1^2 * (-1) * 2 + 2^1 * 2 + 3^1
			6	1T2D3D#		-4		1^3 + 2^2 + 3^2 * (-1)
			7	1D2S3T*		59		1^2 + 2^1 * 2 + 3^3 * 2
		 */
		String dartResult = "1D2S3T*";
		char[] arr1 = dartResult.toCharArray();
		int total = 0;
		int num = 0;
		int[] arr = new int[3];
		int j = 0;
		
		for (int i = 0; i < arr1.length; i++) {  
			
			if (arr1[i] == '1' && arr1[i+1] == '0') {
				num = 10;
				i++;
				continue;
				
			} else if (arr1[i] >= '0' && arr1[i] <= '9') {
				num = arr1[i] - 48;
				continue;
			} 
			
			if (arr1[i] == 'S') {	
				arr[j] = num;
				j++;
				continue;
			} else if (arr1[i] == 'D') {
				num = (int) (Math.pow(num, 2));
				arr[j] = num;
				j++;
				continue;
			} else if (arr1[i] == 'T') {
				num = (int) (Math.pow(num, 3));
				arr[j] = num;
				j++;
				continue;
			}
			
			if (i == 2 && arr1[i] == '*') {
				arr[j-1] = arr[j-1] * 2;
				
			} else if (arr1[i] == '*') { 
				arr[j-1] = arr[j-1] * 2;
				arr[j-2] = arr[j-2] * 2;
			} else if (arr1[i] == '#') {
				arr[j-1] = arr[j-1] * (-1);
			}			
		}
		
		System.out.println(arr[0] + arr[1] + arr[2]);
	}
}
