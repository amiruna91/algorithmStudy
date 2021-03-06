package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		// 모의고사 : 수포자3명의 찍기 신공중 누가 과연 정답을 더 많이 맞췃나.
		
		int[] question = {1,2,3,4,5,2,4,4,5,5,3};
		int[] answer1 = {1,2,3,4,5};			// 5번 주기로 돌고
		int[] answer2 = {2,1,2,3,2,4,2,5};		// 8번 주기로 돌고
		int[] answer3 = {3,3,1,1,2,2,4,4,5,5};	// 10번 주기로 돌고
		int[] answer = {};
		int total1 = 0,
			total2 = 0,	
			total3 = 0;
		//내가 직접 풀어낸 코딩
//		for (int i = 0; i < question.length; i++) {
//			total1 = (question[i] == answer1[i%5]) ? total1+1 : total1+0;
//			total2 = (question[i] == answer2[i%8]) ? total2+1 : total2+0;
//			total3 = (question[i] == answer3[i%10]) ? total3+1 : total3+0;
//		}
//		System.out.println(total1 + " " + total2 + " " + total3);
//		if (total1 == total2 && total1 == total3) {
//			answer[0] = 1;
//			answer[1] = 2;
//			answer[2] = 3;
//		} else if (total1 > total2 && total1 > total3) {
//			answer[0] = 1;
//		} else if (total2 > total1 && total2 > total3) {
//			answer[0] = 2;
//		} else if (total3 > total1 && total3 > total2) {
//			answer[0] = 3;
//		} else if (total1 == total2 && total1 > total3) {
//			answer[0] = 1;
//			answer[1] = 2;
//		} else if (total1 == total3 && total1 > total2) {
//			answer[0] = 1;
//			answer[1] = 3;
//		} else if (total2 == total3 && total2 > total1) {
//			answer[0] = 2;
//			answer[1] = 3;
//		}
//		System.out.println(Arrays.toString(answer));

		// 효울성 좋은 코딩
		for (int i = 0; i < question.length; i++) {
			if (question[i] == answer1[i%5]) total1++;
			if (question[i] == answer2[i%8]) total2++;
			if (question[i] == answer3[i%10]) total3++;
		}
		
		int max = Math.max(Math.max(total1, total2), total3);
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (max == total1) list.add(1);
		if (max == total2) list.add(2);
		if (max == total3) list.add(3);
		
		answer = new int[list.size()];
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		System.out.println(Arrays.toString(answer));
	}
}
