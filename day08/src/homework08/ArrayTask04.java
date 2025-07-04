package homework08;

public class ArrayTask04 {
	public static void main(String[] args) {
		//4. 0 1 2 3 0 1 2 3 배열에 담고 출력
		
		//로직구성
		//1) 배열 선언 크기 : [8]
		//2) 반복문 시작(배열의 크기만큼 반복)
			//3)  계속 늘어나는 i를 4로 나누며 그 나머지를 순서대로 대입
		//4) 반복문 끝
		//5) 출력반복문 시작
			//6) 출력
		//7) 출력 반복문 끝
		
		int[] ar = new int[8];
		int cnt = 0;
		
		for(int i = 0;i < ar.length ; i++) {
			ar[i] = i % 4;
		}
		for(int i = 0;i<ar.length;i++) {
			System.out.printf("%d ", ar[i]);
		}
		
	}
}
