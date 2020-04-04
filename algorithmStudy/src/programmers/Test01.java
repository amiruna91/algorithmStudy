package programmers;

public class Test01 {
	
	public static void main(String[] args) {
		// 완주하지 못한 사람 찾기
		
		String[] all = {"a", "b", "c", "d","e","e","d","d"};
		String[] cpt = {"a", "b", "c", "d","e","d"};
		String rt = "";
		boolean flag = false;
		
		for (int i = 0; i < all.length; i++) {
			flag = true;
			for (int j = 0; j < cpt.length; j++) {	
				if(all[i].equals(cpt[j])) {				
					cpt[j] = null;
					flag = false;
					break;
				} 
			}
			if(flag) {
				rt += all[i];
			}
		}
		System.out.println(rt);
	}
}
