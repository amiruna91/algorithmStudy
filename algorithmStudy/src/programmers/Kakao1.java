package programmers;

import java.util.Arrays;

public class Kakao1 {
	/*
	 * 비밀지도
	 * 네오는 평소 프로도가 비상금을 숨겨놓는 장소를 알려줄 비밀지도를 손에 넣었다. 
	 * 그런데 이 비밀지도는 숫자로 암호화되어 있어 위치를 확인하기 위해서는 암호를 해독해야 한다. 
	 * 다행히 지도 암호를 해독할 방법을 적어놓은 메모도 함께 발견했다.
		지도는 한 변의 길이가 n인 정사각형 배열 형태로, 각 칸은 공백(" ) 또는벽(#") 두 종류로 이루어져 있다.
		전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있다. 각각 지도 1과 지도 2라고 하자. 지도 1 또는 지도 2 중 
		어느 하나라도 벽인 부분은 전체 지도에서도 벽이다. 지도 1과 지도 2에서 모두 공백인 부분은 전체 지도에서도 공백이다.
		지도 1과 지도 2는 각각 정수 배열로 암호화되어 있다.
		암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백 부분을 0으로 부호화했을 때 얻어지는 이진수에 해당하는 값의 배열이다.
	 */
	public static void main(String[] args) {
		int[] arr1 = { 0, 0, 0, 0, 0};
		int[] arr2 = { 30, 1, 21, 17, 28};
		int n = 5;
		
		// 어디서 오류가 났는지 모르겠다.......!!!!!!!!!!!
		String[] arr3 = new String[n];
		
		for (int j = 0; j < n; j++) {
			String num1Str = String.format("%0" + n + "d", Integer.parseInt(Integer.toBinaryString(arr1[j])));
			String num2Str = String.format("%0" + n + "d", Integer.parseInt(Integer.toBinaryString(arr2[j])));
			
			String[] num1Arr = num1Str.split("");
			System.out.println(Arrays.toString(num1Arr));
			String[] num2Arr = num2Str.split("");
			System.out.println(Arrays.toString(num2Arr));
			String[] num3Arr = new String[n];
			
			for (int i = 0; i < n; i++) {
				num3Arr[i] = num1Arr[i].equals("0") && num2Arr[i].equals("0") ? "0" : "1";
			}
			System.out.println(Arrays.toString(num3Arr));
			
			for (int i = 0; i < n; i++) {
				num3Arr[i] = num3Arr[i].equals("1") ? "#" : " ";
			}
			System.out.println(Arrays.toString(num3Arr));
			
			String total = "";
			for (int i = 0; i < n; i++) {
				total += num3Arr[i];
			}
			System.out.println(total);
			arr3[j] = total;
		}
		System.out.println(Arrays.toString(arr3));
		
//		
//		 String[] answers = new String[n];
//	        for(int i=0; i<n; i++) {
//	            answers[i] = numberToText(n, arr1[i] | arr2[i]);
//	        }
//	       System.out.println(Arrays.toString(answers));;
//	    }
//
//	    private static String numberToText(int n, int num) {
//	        String text = Integer.toBinaryString(num).replace("0", " ").replace("1", "#");
//	        if (text.length() > n) {
//	            text = text.substring(text.length() - n);
//	        } else if (text.length() < n) {
//	            String padding = "";
//	            for (int i=0; i<n - text.length(); i++) {
//	                padding += " ";
//	            }
//	            text = padding + text;
//	        }
//	        return text;
	}
}
