package homework08;

public class ArrayTask07 {
	public static void main(String[] args) {
//		7. aBcDeFgHiJkLmNoPqRsTuVwXyZ 배열에 담고 출력 (char만 사용, 선언없이)
		//로직구성
		//1) 배열 선언 ( Z - A  + 1)의 크기로 선언
		//2) 반복문 시작 (배열의 크기만큼 반복)
			//3)  배열에 값 대입 (A부터 Z 까지 대입하되 홀수인 경우 + 32을 하여 소문자로 만들어준다.)
		//4) 반복문 끝
		//5) 반복문 시작(배열의 크기만큼)
			//6)  배열 출력
		//7) 반복문 끝
		
		char[] ar = new char['Z' - 'A' + 1];
		
		for(int i = 0;i<ar.length;i++) {
			ar[i] = (char)(i + 'A');
			if(ar[i] % 2 != 0) {
				ar[i] += 32;
			}
		}
		for(int i = 0;i<ar.length;i++) {
			System.out.printf("%c", ar[i]);
		}
	}
}
