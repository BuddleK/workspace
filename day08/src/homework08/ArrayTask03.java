package homework08;

import java.util.Scanner;

public class ArrayTask03 {
	public static void main(String[] args) {
		//3. 3명의 수학점수를 사용자에게 입력받아 배열에 저장하고 평균 점수를 출력
		
		//로직구성
		//1) 스캐너 임포트
		//2)	배열 선언
		//3) 총합을 담을 변수 선언 (평균 점수의 소수점을 표현해야 하기 때문에 실수형으로 선언)
		//4) 반복문 시작(배열의 크기 만큼 반복)
			//5) 입력 메시지 출력
			//6) 점수 입력 및 저장
		//7) 반복문 끝
		//8) 반복문 시작(배열의 크기 만큼 반복)
			//9) 출력하기
		//10) 반복문 끝
		//11) 스캐너 해제
		
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[3];
		double sum = 0.0;
		
		for(int i = 0; i < ar.length ; i++) {
			System.out.printf("%d번 학생의 수학 점수는? : ", i + 1);
			ar[i] = sc.nextInt();
		}
		
		for(int i = 0; i < ar.length ; i++) {
			sum += ar[i];
		}
		
		System.out.printf("평균 점수는 %.2f점 입니다.", sum / ar.length);
		
		sc.close();
	}
}
