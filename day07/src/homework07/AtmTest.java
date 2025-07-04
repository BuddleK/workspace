package homework07;

import java.util.Scanner;

//실습 6번
public class AtmTest {
	public static void main(String[] args) {
		
		
//		6. ATM 메뉴에서 입금, 출금, 잔액조회 하기
//		[조건]
//		초기 잔액은 10000원으로 설정
//		메뉴 선택에 따라 작업 수행
//		종료시 프로그램 종료
//		숫자(번호)로 입력받기
		
		String msg = "\nATM 기기의 메뉴 중 번호를 선택하세요."
		+ "\n1. 잔액조회"
		+ "\n2. 입금"
		+ "\n3. 출금"
		+ "\n4. 종료"
		+ "\n선택 : ";
//		그 외의 번호 입력 시 다시 선택하세요 출력 후 메뉴 보이기
//		번호 입력시 해당 메시지만 출력
				
		//로직구성
		//)스캐너 임포트
		//)선택 값(정수형 변수 1개 선언, 초깃값 0)
		//)반복문 시작(조건 : 선택 값이 4가 아닐 떄)
			// 메뉴 선택 창 띄우기(입력메시지)
			// 입력 받기
				//switch문을 통해 선택한 메뉴의 출력값 보여주기
			// (조건문으로 돌아가기)
		//)스캐너 닫기
		
		Scanner sc = new Scanner(System.in);
		
		int choice = 0, deposit = 10000;
		
		while(choice != 4) {
			
			System.out.print(msg);
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("잔액은 " + deposit + "원 입니다.");
				break;
			case 2:
				System.out.println("입급해주세요...");
				break;
			case 3:
				System.out.println("출금하세요.");
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("다시 선택하세요.");
				break;
			}
			
		}
		sc.close();
	}
}
