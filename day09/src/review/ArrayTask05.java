package review;

public class ArrayTask05 {
	public static void main(String[] args) {
//		5. A ~ F까지를 배열에 값을 넣고 출력
//		1) 문자형 배열 6칸짜리 배열 선언
//		2) 반복문 for		int i = 0;
//			배열명[i] = (char)('A' + i)
//		3) 출력할 반복문 for문
		
		 char[] arr = new char[6];
		 for(int i = 0; i < arr.length;i++) {
			 arr[i] = (char)('A' + i);
		 }
		 for(int i = 0 ; i < arr.length;i++) {
			 System.out.print(arr[i] + " ");
		 }
	}
}
