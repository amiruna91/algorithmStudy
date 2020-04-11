package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Kakao2 {

	/*
	 *  ["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"]	
	 *  ["Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."]
	 */
	
	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan","Leave uid1234"};
		String[] record2 = new String[3];
		
		HashMap<String, String> map = new HashMap<String,String>();
		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String,String>>();
		
		for (int i = 0; i < record.length; i++) {
			record2 = record[i].split(" ");
			HashMap<String, String> map2 = new HashMap<String,String>();
			String StrIndex0 = record2[0];
			String StrIndex1 = record2[1];
		
			if (StrIndex0.equals("Enter")) {
				map.put(StrIndex1, record2[2]);
				map2.put(StrIndex0, StrIndex1);
				list.add(map2);
				continue;
			}
			if (StrIndex0.equals("Change")) {
				map.put(StrIndex1, record2[2]);
				continue;
			}
			if (StrIndex0.equals("Leave")) {
				map2.put(StrIndex0, StrIndex1);
				list.add(map2);
				continue;
			}
		}
		System.out.println(list);
		System.out.println(map);
		String[] answer = new String[list.size()];
		System.out.println(list.get(1).keySet().contains("Enter"));
		
		for (int i = 0; i < answer.length; i++) {
			String total = "";
			if (list.get(i).keySet().contains("Enter")) {
				total = map.get(list.get(i).get("Enter")) + "님이 들어왔습니다.";
			}
			if (list.get(i).keySet().contains("Leave")) {
				total = map.get(list.get(i).get("Leave")) + "님이 나갔습니다.";
			}
			answer[i] = total;
		}
		System.out.println(Arrays.toString(answer));
	}
}
