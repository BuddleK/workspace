package homework08;

public class ArrayTask02 {
	public static void main(String[] args) {
		//2. 1~10까지의 값을 배열에 넣고 총 합을 출력
		
		//로직구성
		//1)	배열, 합 변수 선언
		//2) 반복문 시작(배열의 크기 만큼 반복)
			//3) 넣기!
		//4) 반복문 끝
		//5) 반복문 시작(배열의 크기 만큼 반복)
			//6) 출력하기
		//7) 반복문 끝
		int[] ar = new int[10];
		int sum = 0;
		
		for(int i = 0; i < ar.length ; i++) {
			ar[i] = i + 1;
		}
		
		for(int i = 0; i < ar.length ; i++) {
			sum += ar[i];
		}
		System.out.printf("1~10까지의 합은 %d입니다.", sum);
	}
}
