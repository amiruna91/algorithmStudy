package programmers;

public class Test5 {

	public static void main(String[] args) {
		int n = 5;		// n은 총 학생수
		int[] lost = {1,2,4},	// lost 체육복을 잃어 버린 학생의 번호가 담긴 배열
			  reserve = {1, 5};	// reserve 여벌의 체육복이 있는 학생
		int notlost = 0;	// 수업을 듣는 학생의 최대값
		/*
		 *  2 <= n <= 30
		 *  1 <= lost <= n
		 *  1 <= reserve <= n
		 *  앞뒤 학생한테만 빌려줄수 있다.
		 *  여벌 체육복이 있는 학생도 잃어 버릴 수 있다.
		 */
		
		//lost[i] == reserve[i]???
		//lost[i] + 1 ? lost[i] - 1 ?? reserve에 있나?
		//reserve에 앞번호가 빌려줘
		
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					notlost++;
					lost[i] = -1;
					reserve[i] = -1;
					break;
				}
			}
		}
		
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j] + 1 || lost[i] == reserve[j] -1) {
					notlost++;
					reserve[j] = -1;
					break;
				}
			}
		}
		n = n - lost.length + notlost;
		System.out.println(n);
		
		// 다른 사람 풀이
		int answer = n-lost.length; //잃어버린애들 전체 수에서 빼주기
        
        //잃어버린애가 두벌가져온애인지 확인(참 : -10 대입, reserve자격박탈)
        for(int i =0; i<reserve.length; i++){
            for(int j =0; j<lost.length; j++){
                //자격박탈된애들 빼주기
                if(lost[j]==-10 && reserve[i]==-10){
                    continue;
                }
                //reserve 자격 박탈
                if(lost[j]==reserve[i]){
                    lost[j]=-10;
                    reserve[i]=-10;
                    answer++;
                }
            }
        }
        for(int i =0; i<lost.length; i++){
            for(int j =0; j<reserve.length; j++){
                if(lost[i]==-10 || reserve[j]==-10){
                    continue;
                }
                //바로 
                if(Math.abs(lost[i]-reserve[j])==1){
                    answer++;
                    reserve[j]=-10;
                    break;
                }
            }
        }
      System.out.println(answer);
	}
}
