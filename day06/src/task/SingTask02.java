package task;

import java.util.Scanner;

//3)번 실습
public class SingTask02 {
	public static void main(String[] args) {
		
//		클래스명 : SingTask02
//		3) 남은 금액으로 음료 구매 가능 여부 추가(한 곡당 금액 200원, 음료 금액은 100원)
//		금액입력 : 1000
//		[출력]
//		5곡을 부를 수 있으며 잔돈은 0원입니다
//		음료를 마시고 싶으면 4곡을 부를 수 있으며 잔돈을 100원입니다.
		
		//1)스캐너 임포트
		//2)변수 선언
		//3)금액 입력 메시지
		//4)금액 입력
		//5)if 조건식 (곡 당 금액이 입력 금액보다 큰 경우)
		//	입력한 금액과 부족한 금액 출력
		//	else문 진입
		//	부를 수 있는 곡 수와 잔돈 출력
			//if 조건식(잔돈이 음료수 가격보다 적으면)
			//	부를 수 있는 곡 수에서 한 곡을 줄이고(음료수 가격이 한 곡 가격보다 작다는 전제로) 곡 가격에서 음료 값을 빼 잔돈에 추가
			//	else
			//	잔돈에서 음료수 값 뺏기
			//) 출력하기
		//8)스캐너 닫기
		
		Scanner sc = new Scanner(System.in);
		final int SONG = 200, DRINK = 100;
		
		int paid, track, change;
		System.out.print("금액 입력 : ");
		paid = sc.nextInt();
		if(paid < SONG) {
			System.out.printf("입력한 금액은 %d원입니다. ", paid);
			System.out.printf("곡 당 가격은 %d원으로 %d원이 부족하여 노래를 부를 수 없습니다.\n", SONG, SONG - paid);
		}else {
			track = paid / SONG;
			change = paid % SONG;
			System.out.printf("%d곡을 부를 수 있으며 잔돈은 %d원입니다.\n", track, change);
			if(change < DRINK) {
				track -= 1;
				change = change + SONG - DRINK;
			}else {
				change -= DRINK;
			}
			System.out.printf("음료를 마시고 싶으면 %d곡을 부를 수 있으며 잔돈은 %d원 입니다.", track, change);
		}
		sc.close();
	}
}
