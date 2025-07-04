package task;

import java.util.Scanner;

public class Karaoke {
	public static void main(String[] args) {
		
		// 어제(day06
		//1)스캐너 임포트
		//2)변수 선언 (한 곡당 금액과 음료 값 (상수), 음료수를 마시지 않을 때의 곡 수와 잔돈 (int track, change;) 음료수를 마실 때의 곡 수와 잔돈(int trackD, changeD);)
		//3)금액 입력 메시지
		//4)금액 입력
		//5)if 조건식 (입력 금액이 한 곡 가격보다 작은 경우)
				//입력한 금액과 부족한 금액 출력
		//else문 진입
			//부를 수 있는 곡 수와 잔돈 출력
			//if 조건식(잔돈이 음료수 가격보다 적으면)
				//부를 수 있는 곡 수에서 한 곡을 줄이고(음료수 가격이 한 곡 가격보다 작다는 전제로) 곡 가격에서 음료 값을 빼 잔돈에 추가
			//else
				//곡 수를 줄이지 않고 잔돈에서 음료수 가격 제외
			//음료수를 마시는 경우의 곡 수와 가격 알력주기(출력
			//음료수를 마실 건지 물어보기
			//switch (음료수를 마시는 경우 음료수 값을 제외한 가격을 track변수와 change 변수에 넣기)
			//확정된 곡 수를 5로 나눠서 보너스 곡 수 안내하기
		//8)스캐너 닫기
		
		Scanner sc = new Scanner(System.in);
		final int SONG = 200, DRINK = 100;
		
		char answer;
		
		int paid, track, change, trackD, changeD;
		System.out.print("금액 입력 : ");
		paid = sc.nextInt();
		if(paid < SONG) {
			System.out.printf("입력한 금액은 %d원입니다. ", paid);
			System.out.printf("곡 당 가격은 %d원으로 %d원이 부족하여 노래를 부를 수 없습니다.\n", SONG, SONG - paid);
		}else {
			trackD = track = paid / SONG;
			changeD = change = paid % SONG;
			System.out.printf("%d곡을 부를 수 있으며 잔돈은 %d원입니다.\n", track, change);
			if(change < DRINK) {
				trackD -= 1;
				changeD = changeD + SONG - DRINK;
			}else {
				changeD -= DRINK;
			}
			System.out.printf("음료를 마시고 싶으면 %d곡을 부를 수 있으며 잔돈은 %d원 입니다.", trackD, changeD);
			
			System.out.print("\n\n음료수를 마시겠습니까? 'y' or 'n' 입력 : ");
			
			// 버퍼 비우기
			sc.nextLine();
			
			answer = sc.nextLine().charAt(0);
			
			switch(answer) {
			case 'y':
			case 'Y':
			case 'ㅛ':
				System.out.println("음료수 제공!!");
				track = trackD;
				change = changeD;
				break;
			case 'n':
			case 'N':
			case 'ㅜ':
				break;
			default:
				System.out.println("제대로 입력하세요.");
				break;
			}
			if(track >= 5) {
				System.out.printf("%d곡을 부르셨습니다. 보너스 %d곡 추가 제공!", track, track / 5);
			}
		}
		sc.close();
	}
}
