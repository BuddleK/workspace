package tasks;

import java.util.Scanner;

// 1. 물건값과 지불 금액을 입력받아 거스름돈을 출력하기

public class Day05_1 {
	public static void main(String[] args) {
		//로직 구성
		//)스캐너 선언 임포트
		//)입력받을 변수 stuff, apy, change 선언
		//)물건값 입력 메시지
		//)물건값 입력
		//)지불금액 입력 메시지
		//)지불금액 입력
		//)거스릅돈 구하기
		//)거스름돈 출력
		//)1000원 수 출력
		//)500원 수 출력
		//)100원 수 출력
		//)스캐너 닫기
		
		Scanner sc = new Scanner(System.in);
		int stuff, pay, change;
		System.out.print("물건값 : ");
		stuff = sc.nextInt();
		System.out.print("지불금액 : ");
		pay = sc.nextInt();
		
		change = pay - stuff;
		System.out.println("거스름돈은 " + change + "원입니다.");
		
		System.out.printf("1000원 : %d개\n", change / 1000);
		System.out.printf("500원 : %d개\n", change % 1000 / 500);
		System.out.printf("100원 : %d개\n", change % 500 / 100);
		
		sc.close();
	}
}
