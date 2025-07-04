package homework08;

public class ArrayTask06 {
	public static void main(String[] args) {
		//6. A ~ F까지 중 C만 제외하고 배열에 담아 출력
		//로직구성
		//1) 배열 선언 크기 : [5]
		//2) 반복문 시작 (배열의 크기만큼 반복)
			//3)  배열에 값 대입 ( i + A 가 C보다 같거나 크면 1을 더하여 대입한다.)
		//4) 반복문 끝
		//5) 반복문 시작(배열의 크기만큼)
			//6) 배열 출력
		//7) 반복문 끝
		
		char[] ar = new char[5];
		
		for(int i = 0; i < ar.length;i++) {
			ar[i] = (i + 'A') >= 'C' ? (char)(i + 'A' + 1) : (char)(i + 'A');
		}
		for(int i = 0;i<ar.length;i++) {
			System.out.printf("%c ", ar[i]);
		}
	}
}
