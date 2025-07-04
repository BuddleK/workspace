package oper;

import java.util.Scanner;

//6번 : 삼항연산자 실습1
public class OperTask02 {// 클래스 시작
	public static void main(String[] args) {// main 시작
		
		// 두 수를 입력받아 비교
		// 크다, 작다, 같다 가 각각 상황에 맞게 출력되도록 로직 구성
		
		Scanner sc = new Scanner(System.in);		// 스캐너 선언
		
		//1) 입력클래스 import
		//2) 입력 메시지 출력
		//3) 변수 선언, 입력메소드 사용
		//4) 입력메시지 출력
		//5) 변수 선언, 입력메소드 사용
		//6) 삼항연산자 사용하여 출력 => 크다/작다/같다가 출력되어야 함
		//7) 스캐너 해제
		
		System.out.print("첫째 숫자 : ");			// 첫 번째 숫자 입력 메시지
		int num1 = sc.nextInt();				// 두 번째 숫자 입력
		System.out.print("둘째 숫자 : ");			// 첫 번째 숫자 입력 메시지
		int num2 = sc.nextInt();				// 두 번째 숫자 입력
		
		System.out.println(num1 > num2 ? num1 + "이 " + num2 + "보다 크다.": num1 < num2 ? num1 + "이 " + num2 + "보다 작다." : num1 + "과 " + num2 + "가 같다.");
		// num1이 num2보다 크다.
		// num1이 num2보다 작다.
		// num1과 num2가 같다.
		// 삼항 연산자를 중첩하여 조건문을 2번 확인했다.
								
		
		
		
		//2. 한 개의 정수를 입력받아서 짝수인지 아닌지 출력하기
		//짝수입니다 or 짝수가 아닙니다로 출력할 것
		
//		//1) 입력 클래스 import
//		// 위에서 함!
//		//2) 입력 메시지 출력
//		System.out.print("숫자를 입력하세요 : ");
//		//3) 변수 선언, 입력메소드 사용
//		int num = sc.nextInt();
//		//4) 2로 나눈 나머지 보관
//		int nmz = num % 2;
//		//5) 나머지로 홀짝 판단하기, 출력
//		System.out.println(num + "은 " + (nmz == 0 ? "짝수입니다." : "홀수입니다."));
//		System.out.println(num + "은 " + (num % 2 == 0 ? "짝수입니다." : "홀수입니다."));
//		//6)스캐너 해제
//		// 밑에서 함!
		
		//1) 입력메시지 출력
		//2) 정수형 변수 1개(입력메소드), 문자열변수 1개(삼항연산자, 나머지연산자)
		//3) 출력
		//4) 스캐너 해제
		System.out.print("숫자 하나 입력! : ");								// 숫자 입력 메시지
		int number =sc.nextInt();										// 숫자 입력 받기
		String result1 = (number % 2 == 0) ? "짝수입니다" : "짝수가 아닙니다";	// 숫자를 2로 나누어 나머지가 0인지 보고 짝수인지 홀수인지 메시지 넘기기
		System.out.println("입력한 숫자는 " + result1);						// 메시지 출력하기
		


		sc.close(); // 스캐너 닫아주기
	}// main 끝
}// 클래스 끝
