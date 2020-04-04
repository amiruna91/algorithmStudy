package programmers;

public class Test04 {
	public static void main(String[] args) {
		// 요일 구하기
		// 2016년 1월 1일은 금요일이다. 만약 a - 월 , b - 일 이라고 하면 
		// 2016년 a월 b일은 무슨 요일 일까??
		
		String[] week = {"thu","fri", "sat", "sun", "mon", "tue", "wed"};
		int a = 1,//(int) (Math.random() * 12 + 1),
			b = 7,//(int) (Math.random() * 31 + 1),
			date = 0,
			totaldate = 0;
		String answer = "";
		
		if (a != 1) {
			for (int i = 1; i <= (a-1); i++) {
				if (i <= 7) {
					if (i == 2) {
						date = 29;
					} else if (i%2 == 0 && i != 2) {
						date = 30;
					} else {
						date = 31;
					}
					System.out.println(i + "번째: " + date );
				} else {
					date = (i%2 == 0) ? 31 : 30;
					System.out.println(i + "번째: " + date );
				}
				totaldate += date;
			}
		}
		
		totaldate += b;
		answer = week[totaldate%7];
		
		System.out.println("총 몇일 이지?: " + totaldate);
		System.out.println("몇월 인지 표시: " + a);
		System.out.println("몇일 인지 표시: " + b);
		System.out.println("2016년" + a + "월" + b + "일: " + answer);
	}
}
