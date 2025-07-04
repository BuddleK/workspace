package oper;

import java.util.Scanner;

//13번 : 산술연산자 응용
public class OperTask01 {// 클래스 중괄호 영역 시작
	public static void main(String[] args) { // main 메소드 중괄호영역 시작
		
		//코인노래방 프로그램
		//사용자에게 금액을 입력받고 부를 수 있는 곡 수, 잔 돈을 출력
		//금액입력 : 
		//[출력]
		//3곡을 부를 수 있으며 잔돈은 100원입니다.
		
		//로직구성
		//)Scanner 선언, 임포트
		//)한 곡 금액 300원 고정
		//)금액 입력메시지
		//)금액 입력받기
		//)금액 / 한곡금액 = 부를 수 있는 곡 수
		//)금액 % 한곡금액 = 잔돈
		//)(출력) 알려주기
		//)Scanner 닫아주기
		
//		Scanner sc = new Scanner(System.in);
//		final int SONG = 300;
//		System.out.print("금액입력 : ");
//		int money = sc.nextInt();
//		int track = money / SONG;
//		int change = money % SONG;
//		System.out.printf("%d곡을 부를 수 있으며 잔돈은 %d원입니다", track, change);
//		sc.close();
		
		//로직구성
		//입력클래스, 입력클래스 import, 정수형 변수 금액입력, 곡수 잔돈, 산술연산자(/, %), 출력메소드
		
		//1) 입력클래스 import
		//2) 금액을 입력하세요 메시지 출력
		//3) 정수형 변수 = 입력메소드(nextInt())
		//4) 상수 = 300
		//5) 정수형 변수2 = 변수1 / 상수명
		//6) 정수형 변수3 = 변수1 % 상수명
		//7) 출력
		//8) Scanner 해제
		
		Scanner sc = new Scanner(System.in); //스캐너 선언 및 생성
		System.out.print("금액을 입력하세요 : "); //금액 입력 메시지 출력
		int money = sc.nextInt(); //money 값 정수형으로 입력받기
//		System.out.println(money);
		final int PRICE = 300; // final 정수형 변수로 한 곡 가격 설정
		int song  = money / PRICE; // 몇 곡 부를 수 있는지 나누어 구하기
		int change = money % PRICE; // 잔 돈이 얼마나 남는지 나머지 구하기
		System.out.println(song + "곡을 부를 수 있으며 잔돈은 " + change + "원 입니다.");
		
		sc.close();// 스캐너 해제하기
		
	} // main 메소드 중괄호 영역 끝
} // 클래스 중괄호 영역 끝
