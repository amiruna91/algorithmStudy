package programmers;

import java.util.Arrays;

public class Test14 {

	public static void main(String[] args) {
		/*
		 * String형 배열 seoul의 element중 Kim의 위치 x를 찾아, 김서방은 x에 있다는 String을 반환하는 함수, 
		 * solution을 완성하세요. seoul에 Kim은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
		 */
		String answer = "";
		String[] seoul = {"sim", "Kim","Jane","im"};
			
	    int x = Arrays.binarySearch(seoul, "Kim");
	    answer = "김서방은" + x + "에 있다";
	    System.out.println(answer);;
	    
	    // 위에꺼는 왜 안될까.....
	    int b = 0;
	    for (int i = 0; i < seoul.length; i++) {
	    	if (seoul[i].equals("Kim")) b = i;
	    }
	    answer = "김서방은" + b + "에 있다";
	    System.out.println(answer);;
	}
}
