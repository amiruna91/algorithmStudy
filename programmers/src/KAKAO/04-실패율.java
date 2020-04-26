package programmer;

import java.util.Arrays;

public class Kakao01 {

	public static void main(String[] args) {
		/*
		 * 실패율
		 * 슈퍼 게임 개발자 오렐리는 큰 고민에 빠졌다. 그녀가 만든 프랜즈 오천성이 대성공을 거뒀지만, 
		 * 요즘 신규 사용자의 수가 급감한 것이다. 원인은 신규 사용자와 기존 사용자 사이에 스테이지 차이가 너무 큰 것이 문제였다
		 * 이 문제를 어떻게 할까 고민 한 그녀는 동적으로 게임 시간을 늘려서 난이도를 조절하기로 했다. 역시 슈퍼 개발자라 대부분의 
		 * 로직은 쉽게 구현했지만, 실패율을 구하는 부분에서 위기에 빠지고 말았다. 오렐리를 위해 실패율을 구하는 코드를 완성하라.
		 * 
		 * 실패율은 다음과 같이 정의한다.
		 * 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
		 * 전체 스테이지의 개수 N, 게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열 stages가 매개변수로 주어질 때,
		 *  실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열을 return 하도록 solution 함수를 완성하라.
		 *  
		 *  N		stages						result
			5	[2, 1, 2, 6, 2, 4, 3, 3]	[3,4,2,1,5]
			4	[4,4,4,4,4]					[4,1,2,3]
		 */
		
		int n = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		StagesStatus[] all = new StagesStatus[n];
		int[] answer = new int[n];
		double total = 0.0;
		int len = stages.length;
		
		for (int i = 0; i < n; i++) {
			all[i] = new StagesStatus(i+1);
		}
		
		for (int i = 0; i < len; i++) {
			int num = stages[i];
			if (num > n) continue;
			int value = (all[num-1].getStagesCount()) + 1;
			all[num-1].setStagesCount(value);
		}
		
		for (int i = 0; i < n; i++) {
			int count = all[i].getStagesCount();
			double a = count/(len - total);
			if (len-total == 0) a = 0;
			all[i].setFalseAvg(a);
			total += count;
		}
		
		for (StagesStatus a : all) {
			int num = a.getStages();
			double num2 = a.getFalseAvg();
			System.out.println(num + "   " + num2);
		}
		
		Arrays.sort(all);
		System.out.println();
		for (StagesStatus a : all) {
			int num = a.getStages();
			double num2 = a.getFalseAvg();
			System.out.println(num + "   " + num2);
		}
		
		for (int i = 0; i < all.length; i++) {
			answer[i] = all[i].getStages();
			System.out.println(answer[i]);
		}
	}
	
	static class StagesStatus implements Comparable<StagesStatus>{
		private int stages;
		private int stagesCount;
		private double falseAvg;
		
		public StagesStatus() {
			
		}
		
		public StagesStatus(int stages) {
			this.stages = stages;
		}
		
		public int getStages() {
			return stages;
		}
		
		public int getStagesCount() {
			return stagesCount;
		}
		
		public void setStagesCount(int stagesCount) {
			this.stagesCount = stagesCount;
		}
		
		public void setFalseAvg(double falseAvg) {
			this.falseAvg = falseAvg;
		}
		public double getFalseAvg() {
			return falseAvg;
		}

		@Override
		public int compareTo(StagesStatus o) {
			int a = new Double(o.falseAvg).compareTo(this.falseAvg);
			if (a == 0) a = this.stages - o.stages;
			return a;
			
//			int a = (int) (this.falseAvg * 10000000);
//			int b = (int) (o.falseAvg *10000000);
//			return b-a;
		}
		
	}

}
