package homework08;

public class ArrayTask05 {
	public static void main(String[] args) {
		//5. A ~ F까지를 배열에 값을 넣고 출력
		
		//로직구성
		//1) 배열 선언 ( F - A  + 1)의 크기로 선언
		//2) 반복문 시작 (배열의 크기만큼 반복)
			//3) 배열에 값 대입
		//4) 반복문 끝
		//5) 반복문 시작(배열의 크기만큼)
			//6)  배열 출력
		//7) 반복문 끝
		
		char[] ar = new char['F' - 'A' + 1];
		
		for(int i = 0;i<ar.length;i++) {
			ar[i] = (char)(i + 'A');
		}
		for(int i = 0;i<ar.length;i++) {
			System.out.printf("%c ", ar[i]);
		}
	}
}
