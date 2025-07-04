package homework08;

public class ArrayTask01 {
	public static void main(String[] args) {
		//1. 100~1까지의 값을 배열에 넣고 출력
		
		//로직구성
		//1)	배열 선언
		//2) 반복문 시작(배열의 크기 만큼 반복)
			//3) 넣기!
		//4) 반복문 끝
		//5) 반복문 시작(배열의 크기 만큼 반복)
			//6) 출력하기
		//7) 반복문 끝
		int[] ar = new int[100];
		
		for(int i = 0; i < ar.length ; i++) {
			ar[i] = 100-i;
		}
		
		for(int i = 0; i < ar.length ; i++) {
			System.out.printf("%d ", ar[i]);
		}
	}
}
