package homework08;

import java.util.Scanner;

public class ArrayTask08 {
	public static void main(String[] args) {
		//8. 5개의 정수를 입력받은 뒤 그 값을 배열에 담고 최대값과 최소값 출력
		
		//로직구성
		//1) 스캐너 임포트
		//2)	배열, 가장 작은 값을 건질 변수(min) = 2147483647, 가장 큰 값을 건질 변수(max) = -2147483648
		//3) 반복문 시작(배열의 크기 만큼 반복)
			//4) 넣기!
			//5) 중복 검사 반복문 시작 ( int j = 0 ; j < i ; i++ ) : 0부터 현재 i에 담긴 인덱스 바로 이전까지 반복하며 확인
				//6) if(방금 입력한 값과 이전까지 입력한 값 중 일치하는 게 있을 경우)
					//7) 중복되는 값이 있음을 알려주기
					//8) i--
			//9) 중복 검사 반복문 끝
		//10) 반복문 끝
		//11) 반복문 시작(배열의 크기 만큼 반복)
			//12) 출력하기
		//13) 반복문 끝
		//14) 스캐너 해제
		
		Scanner sc = new Scanner(System.in);
		
		int[] ar = new int[5];
		int min = 2147483647, max = -2147483648;
		
		for(int i = 0; i < ar.length ; i++) {
			System.out.printf("%d번째 정수를 입력해주세요~! : ", i + 1);
			ar[i] = sc.nextInt();
			
			for(int j = 0 ; j < i; j++) {
				if(ar[j] == ar[i]) {
					System.out.println("중복되는 값이 있습니다.");
					i--;
					break;
				}
			}
		}
		
		for(int i = 0; i < ar.length ; i++) {
			if(ar[i] < min) {
				min = ar[i];
			}
			if(ar[i] > max) {
				max = ar[i];
			}
		}
		System.out.printf("가장 큰 값은 %d이고, 가장 작은 값은 %d입니다.", max, min);
		
		sc.close();
	}
}
