package whileTest;
//9번 : while문 활용한 합계 구하기
public class WhileTest02 {
	public static void main(String[] args) {
		//1부터 100까지의 합 구하기(for문 이용)
		//1) 총합 구할 변수 선언
		//2) for문 (초기식 int i = 1
		//			조건식	i <= 100
		//			증감식	i++ 
		//3) 중괄호 영역
		//		총합구할변수 += i	총합구할변수 = 총합구할변수 값 + i
		//4) 출력
		int result1 = 0;
		for(int i = 1; i<=100;i++) {
			result1 += i;
		}
		System.out.println("1부터 100까지의 합(for문) : " + result1);
		
		//1부터 100까지의 합을 구하기(while문 이용)
		//1) 변수 선언 2개(총합구할변수, 비교대상 변수 0)
		//2) while문 (조건식	비교대상변수 <= 100)
		//3) while중괄호영역
		//		총합구할변수 += 비교대상변수
		//		비교대상변수 1증가
		//4) 출력
		
		int result2 = 0, cnt = 0;
		while(cnt <= 100) {
			result2 += cnt;
			cnt++;
		}
		System.out.println("1부터 100까지의 합(while문) : " + result2);
		
		//짝수의 합, 홀수의 합
		//1부터 100까지의 합을 구하기(while문 이용)
		//1) 변수 선언 2개(총합구할변수, 비교대상 변수 0)
		//		변수 선언 3(짝수총합, 홀수총합, 비교대상 변수 0)
		//2) while문 (조건식	비교대상변수 <= 100)
		//3) while중괄호영역
		//		if (비교대상변수가 짝수일 때)
		//			짝수총합 변수 += 비교대상변수가
		//		else (비교대상변수가 짝수가 아니었을 때)
		//			홀수총합 변수 += 비교대상변수가
		//		비교대상변수 1증가
		//4) 출력
		
		int result = 0, resultE = 0, resultO = 0, cntEO = 0;
		while(cntEO <= 100) {
			result += cntEO;
			if(cntEO % 2 ==0) {
				resultE += cntEO;
			}else {
				resultO += cntEO;
			}
			cntEO++;
		}
		System.out.println("1부터 100까지의 합 : " + result);
		System.out.printf("1부터 100까지 짝수의 합 : %d, 홀수의 합 : %d", resultE, resultO);
	}
}
