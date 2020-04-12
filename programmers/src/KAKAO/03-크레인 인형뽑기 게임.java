package programmer;

import java.util.ArrayList;
import java.util.Arrays;

public class Kakao03 {

	public static void main(String[] args) {
		
		/*
		 *  크레인 인형뽑기 게임
		 *  board 배열은 2차원 배열로 크기는 5 x 5 이상 30 x 30 이하입니다.
			board의 각 칸에는 0 이상 100 이하인 정수가 담겨있습니다.
			0은 빈 칸을 나타냅니다.
			1 ~ 100의 각 숫자는 각기 다른 인형의 모양을 의미하며 같은 숫자는 같은 모양의 인형을 나타냅니다.
			moves 배열의 크기는 1 이상 1,000 이하입니다.
			moves 배열 각 원소들의 값은 1 이상이며 board 배열의 가로 크기 이하인 자연수입니다.
			입출력 예
			board																	moves	result
			[[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]]	[1,5,3,5,1,2,1,4]	4
		 */
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		int result = 0;
		int count = 0;
		list.add(0);
		
		for (int j = 0; j < moves.length; j++) {
			for (int i = 0; i < board.length; i++) {
				if (board[i][moves[j]-1] > 0) {
					int num = board[i][moves[j]-1];
					
					if (num == list.get(count)) {
						list.remove(count);
						result += 2;
						count--;
					} else {
						list.add(num);
						count++;
					}
					System.out.println(num);
					System.out.println(Arrays.toString(board[i]));
					board[i][moves[j]-1] = 0;
					System.out.println(Arrays.toString(board[i]));
					break;
				}
			}
		}
		System.out.println(result);
		System.out.println(list);
	}
}
