package programmers;

import java.util.Arrays;

public class Kakao2 {

	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		String[] answer = {};
		String[] record2 = new String[3];
		
		String enter = "님이 들어왔습니다.";
		String leave = "님이 나갔습니다.";
		String change = "";
		
		for (int i = 0; i < record.length; i++) {
			record2 = record[i].split(" ");
			System.out.println(Arrays.toString(record2));
		}
		
	}
}
