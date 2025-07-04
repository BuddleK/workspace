package homework07;

import java.util.Scanner;

public class SingTest {
	public static void main(String[] args) {
//		7. 코인 노래방 시스템을 구현하는 개발자입니다.
//		사용자로부터 금액을 입력받아 부를 수 있는 곡 수와 잔돈을 계산하고, 음료를 마실 수 있는지 여부도 안내하는 프로그램
//
//		[요구사항]
//		사용자에게 곡 당 가격을 입력받는다.
//		반복문을 사용하여 사용자에게 금액을 계속 입력받는다.
//		단, 0을 입력하면 프로그램은 종료된다.
//		입력받은 금액으로 부를 수 있는 곡 수와 잔돈을 출력한다.
//		곡 수 : 금액 ÷ 곡당 가격
//		보너스 : 5곡당 1곡 보너스 (예: 5곡 → 6곡, 10곡 → 12곡)
//		잔돈 : 금액 % 곡당 가격
//		음료(100원)를 마시고 싶다면, 음료 가격을 차감하고 노래를 줄이는 방식으로 대체 제안을 출력한다.
//		사용자에게 "음료를 구매하시겠습니까?" 라고 묻고
//		YES를 입력하면 대체 결과를 출력 NO를 입력하면 원래 계산된 노래 수를 유지한다
//		금액이 부족할 경우, 노래를 부를 수 없다는 안내 메시지를 출력한다.
//
//		입력은 정수로 받되, nextLine()을 사용하여 입력 오류를 방지
//		대소문자 구분해서 YES/NO 처리한다.
//		Scanner는 한 번만 생성하고 마지막에 .close()로 닫을 것
		
		//) 스캐너 임포트
		//) 상수 : 음료 가격
		//) 변수들 : 곡 가격, 금액, 이전에 남은 잔돈, 곡수, 잔돈, 음료마실때곡수, 음료마실때잔돈, 보너스 곡 수
		//) 곡 가격 입력 메시지
		//) 곡 가격 입력
		//) 반복문 시작 (키오스크 켜기)
			//) 금액 입력 받기
			//) if(금액이 0이 아닌 경우)
				//) 이전에 남은 잔돈(최초 실행 시 0원)과 새로 넣은 금액을 합친다
				//) if(현재 금액이 한 곡 가격보다 적을 때)
					//) "금액이 부족합니다" 출력
				//) else (적어도 한 곡은 부를 수 있을 때)
					//) 부를 수 있는 곡과 잔돈 알려주기
					//) 음료를 마실 경우의 곡 수와 잔돈도 알려주기
					//) 음료수 마실건지 물어보기
					//) switch(음료수 음용 여부)
						//) YES : 
							//) track변수와 change변수에 trackD의 값과 changeD의 값을 넣어주기
							//) "음료를 구매하셨습니다." 출력
						//) NO : 
							//) "음료를 구매하지 않으셨습니다." 출력
						//) default : (잘못 입력한 경우)
							//) "잘못 입력하셨습니다. 출력
							//) 노래를 부르지 않았으니 잔돈 = 잔돈 + 곡 수 * 한 곡당 가격 ( 잔돈으로 넣어두면 반복문 맨 아래에서 지갑으로 다시 들어감 )
					//) 확정된 곡 수와 잔돈 출력
			//) else (금액에 0을 입력한 경우)
				//) 종료메시지 출력, 반복문 종료
			//) 잔돈을 지갑에 넣기 ( wallet = change; )
		//) 반복문의 끝
		//) 스캐너 닫기

		
		Scanner sc = new Scanner(System.in);
		final int DRINK = 100;
		int songPrice = 0, paid = 0, wallet = 0, track = 0, change = 0, trackD = 0, changeD = 0, bonus = 0;
		String answer = "";
		System.out.print("곡 당 가격 입력 : ");
		songPrice = sc.nextInt();
		
		while(true) {
			System.out.print("금액 입력 (0 입력 시 종료): ");
			paid = sc.nextInt();
			if(paid != 0) {
				wallet += paid; //입력한 금액을 잔돈에 합쳐주기
				if(wallet < songPrice) {
					// 입력금액 + 잔돈이 한 곡당 가격보다 적을 떄
					System.out.println("금액이 부족합니다.");
				}else {
					track = wallet / songPrice;
					change = wallet % songPrice;
					System.out.printf("%d곡을 부를 수 있으며 잔돈은 %d원이니다.\n", track, change);
					if(change < DRINK) {
						if(track == 1) {
							System.out.println("음료수만 마셔도 괜찮으시겠어요..?");
						}
						trackD = track - 1;
						changeD = change + songPrice - DRINK;
					}else {
						trackD = track;
						changeD = change - DRINK;
					}
					System.out.printf("음료를 마시고 싶으면 %d곡을 부를 수 있으며 잔돈은 %d원입니다.\n", trackD, changeD);
					
					sc.nextLine(); // 버퍼 비우기
					
					System.out.print("음료룰 구매하시겠습니까? (YES/NO) : ");
					answer = sc.nextLine();
					
					switch(answer) {
					case "YES":
					case "yes":
						System.out.println("음료를 구매하셨습니다.");
						track = trackD;
						change = changeD;
						break;
					case "NO":
					case "no":
						System.out.println("음료를 구매하지 않았습니다.");
						break;
					default:
						System.out.println("잘못 입력하셨습니다.");
						change = change + track * songPrice; // 사용하지 않은 금액을 잔돈으로 전환
						track = 0; // 노래를 부르지 않음 (그냥 놔두어도 되지만 아래 출력문에 나오는 게 신경쓰임)
						break;
					}
					System.out.printf("%d곡을 부를 수 있으며 잔돈은 %d원입니다.\n", track, change);
					
					bonus = track / 5;
					
					if(bonus >= 1) {
						System.out.printf("보너스 %d곡 추가!\n", bonus);
					}
					
				}
			}else {
				System.out.println("안녕히 가세요. (프로그램 종료)");
				break;
			}
			
			wallet = change;
			
		}

		sc.close();
	}
}
