package task;

import java.util.Scanner;

// 1)번, 2)번 실습
public class SingTask01 {
	public static void main(String[] args) {
		
//		클래스명 : SingTask01
//		1) 한 곡당 금액도 입력받기
//		금액입력 : 1000
//		곡 당 가격 입력 : 300
//		[출력]
//		3곡을 부를 수 있으며 잔돈은 100원입니다
//
//		2) 잔돈이 부족할 경우 안내하기
//		금액입력 : 100
//		곡 당 가격 입력 : 
//		[출력]
//		입력한 금액은 100원입니다. 곡 당 가격은 000원으로 000원이 부족하여 노래를 부를 수 없습니다
		
		//1)스캐너 임포트
		//2)변수 선언
		//3)금액 입력 메시지
		//4)금액 입력
		//5)한 곡당 금액 입력 메시지
		//6)한 곡당 금액 입력
		//7)if 조건식 (곡 당 금액이 입력 금액보다 큰 경우)
		//	입력한 금액과 부족한 금액 출력
		//	else문 진입
		//	부를 수 있는 곡 수와 잔돈 출력
		//8)스캐너 닫기
		
		Scanner sc = new Scanner(System.in);
		int paid, song, track, change;
		System.out.print("금액 입력 : ");
		paid = sc.nextInt();
		System.out.print("곡 당 가격 입력 : ");
		song = sc.nextInt();
		if(paid < song) {
			System.out.printf("입력한 금액은 %d원입니다. ", paid);
			System.out.printf("곡 당 가격은 %d원으로 %d원이 부족하여 노래를 부를 수 없습니다.\n", song, song - paid);
		}else {
			track = paid / song;
			change = paid % song;
			System.out.printf("%d곡을 부를 수 있으며 잔돈은 %d원입니다.\n", track, change);
		}
		sc.close();
	}
}
