package scanner;

import java.util.Scanner;

//8번 : 사용자로부터 숫자를 입력받고 10을 더한 값 출력하기
public class ScannerTest04 {
	public static void main(String[] args) {
		
		//1) 입력 클래스 선언
		Scanner sc = new Scanner(System.in);
		//2) 입력 클래스 import
		// ctrl + shift + o
		//3) 입력 메시지 출력
		System.out.print("숫자를 입력해주세요 : ");
		//4) 문자열 변수 선언, 입력메소드 사용
		String number = sc.next();
		//5) 변수 출력
		System.out.println("입력한 값은 "+ number + "입니다.");
		//6) 문자열 값을 정수형으로 형 변환하여 변수 선언
		int result = Integer.parseInt(number);
		//7) 결과 출력
		System.out.println(result + 10);
	}
}
