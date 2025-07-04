package ifTest;

import java.util.Scanner;

//11번 : if~else문 실습1
public class IfTask01 {// 클래스 시작
	public static void main(String[] args) {// main 시작
		
		//1. 사용자로부터 숫자를 입력받아서 짝수인지 홀수인지 출력하기
		//로직구성
//		//1)스캐너 임포트
//		Scanner sc = new Scanner(System.in);
//		//2)입력메시지
//		System.out.print("숫자 하나만 입력해주세요~! : ");
//		//3)입력 받기
//		int num = sc.nextInt();
//		//4)짝수인지 홀수인지 알려주면서 출력하기
//		if(num % 2 == 0) {
//			System.out.println(num + "은 짝수예요~!");
//		}else {
//			System.out.println(num + "은 홀수예요~!");
//		}
//		//5)스캐너 해제
//		sc.close();
		
		//1) 입력 클래스 import
		//2) 정수형 변수 선언
		//3) 입력 메시지
		//4) 변수 입력 메소드 사용
		//5) 조건문(if ~ else)문
			//if 조건식 (산술연산자(%), 관계연산자(!=))
			//	출력메소드
			//else 출력메소드
			//	출력메소드
		//6) 스캐너 닫기
		
		Scanner sc = new Scanner(System.in);			// 스캐너 선언
		int choice = 0;									// 정수형 choice 변수를 0으로 초기화해주기
		//자료형들의 기본값
		//정수 0, 실수 0.0, 문자형 ' ', 문자열 "" or null, 논리형 false
		System.out.print("숫자 1개 입력 : ");				//입력메시지
		choice = sc.nextInt();							// choice에 정수값 입력받기
		if(choice % 2 == 0) {							// choice를 2로 나누어 나머지를 보고 짝수인지 확인하기
			System.out.println("짝수입니다");				// 짝수라고 알려주기
		}else {											// 짝수가 아니었을 떄
			System.out.println("홀수입니다");				// 홀수라고 알려주기
		}
		
		sc.close();										// 스캐너 닫기
		
		//삼항연산자
		System.out.println((choice % 2 != 1) ? "짝수입니다" : "홀수입니다");	// 입력받은 값을 2로 나누어 나머지가 1이 아니면 짝수라고 출력, 1이면 홀수라고 출력하기
		
	}// main 끝
}// 클래스 끝
