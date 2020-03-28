package programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.StringJoiner;

public class Test12 {

	public static void main(String[] args) {
		/*
		 * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을
		 *  리턴하는 함수, solution을 완성해주세요. 
		 *  s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로
		 *  간주합니다.
		 */
		
		String s = "Zbcdefg";
		
		String[] items = s.split("");
		Arrays.sort(items, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return b.compareTo(a);
			}
		});
		
		StringJoiner joiner = new StringJoiner("");
		for (String item : items) {
			joiner.add(item);
		}
		String answer = joiner.toString();
		System.out.println(answer);
		
		// 다른 풀이 방법:
		String answer2 = "";
	    char[] temp = s.toCharArray();
	    int[] intTemp = new int[temp.length];
	    
	    for(int i =0; i<temp.length; i++){
	    	intTemp[i]=(int)temp[i];
	    }
	    
	    Arrays.sort(intTemp);
	    System.out.println(Arrays.toString(intTemp));
	    for(int i =0; i<intTemp.length; i++){
	    	temp[intTemp.length-1-i]= (char)intTemp[i];
	    }
	    answer2 = new String(temp);
	    System.out.println(answer2);
	}
}
