package programmers;

import java.util.ArrayList;
import java.util.Scanner;

public class Test15 {

	public static void main(String[] args) {
		/*
		 * 	소수 찾기
		 * 	1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
		   	소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.	(1은 소수가 아닙니다.)
		   	1<= n <= 1000000
		 */
		
		// 효율성이 떨어짐
//		 int count=0;
//
//         for(int i=2; i<=100; i++) { // 1은 소수가 아니므로 2부터 시작{
//             for(int j=2; j<=i; j++) {
//                  if(i%j ==0) {
//                       count ++;
//                  }    
//             }
//             
//             // 소수는 1과 자기자신으로만 나눠지므로 자기자신으로 한번만 나눠질때 소수
//             if(count==1) {
//                  System.out.print(i+" ");
//             }
//             count=0;
//         }
         
		//에라토스테네스의 체 ..... 
//      // ArrayList로 구현
// 		ArrayList<Boolean> primeList;
//
// 		// 사용자로부터의 콘솔 입력
// 		Scanner scan = new Scanner(System.in);
// 		int n = scan.nextInt();
//
// 		// n <= 1 일 때 종료
// 		if(n <= 1) return;
//
// 		// n+1만큼 할당
// 		primeList = new ArrayList<Boolean>(n+1);
// 		// 0번째와 1번째를 소수 아님으로 처리
// 		primeList.add(false);
// 		primeList.add(false);
// 		// 2~ n 까지 소수로 설정
// 		for(int i=2; i<=n; i++ )
// 			primeList.add(i, true);
//
// 		// 2 부터  ~ i*i <= n
// 		// 각각의 배수들을 지워간다.
// 		for(int i=2; (i*i)<=n; i++){
// 			if(primeList.get(i)){
// 				for(int j = i*i; j<=n; j+=i) primeList.set(j, false);
// 				//i*i 미만은 이미 처리되었으므로 j의 시작값은 i*i로 최적화할 수 있다.
// 			}
// 		}
// 		StringBuffer sb = new StringBuffer();
// 		sb.append("{");
// 		for(int i=0; i<=n; i++){
// 			if(primeList.get(i) == true){
// 				sb.append(i);
// 				sb.append(",");
// 			}
// 		}
// 		sb.setCharAt(sb.length()-1, '}');
//
// 		System.out.println(sb.toString());
		
		// 다른 풀이 방법
		int n = 10;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int cnt = 0;
        list.add(2);
        for(int i=2; i <= n; i++){
            for(int j=0; j<list.size(); j++){
                if(i%list.get(j)==0){
                    break;
                }
                if(j+1 == list.size()){
                    list.add(i);
                }
            }
        }
        for(int i = 0; i<list.size(); i++){
            cnt++;
            System.out.println(list.get(i));
        }
        System.out.println("소수 개수 : " + cnt);
	}
}
