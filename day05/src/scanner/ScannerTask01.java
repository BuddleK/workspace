package scanner;

import java.util.Scanner;

// 9번 : 입력메소드 실습
public class ScannerTask01 {
	public static void main(String[] args) {
		//1. 본인의 이름과 성별을 입력받고 출력하기
		//입력 예> 이름 입력 :
		//입력 예> 성별 입력 : 
		//출력 예> 이름은 000이고 00입니다.
		
//		//(내가 한 거)로직구성, next()만 사용하기
//		//1) 스캐너 변수 선언
//		Scanner sc = new Scanner(System.in);
//		//2) 스캐너 변수 임포트
//		//ctrl + shift + o
//		//3) 값을 저장할 String 변수 2개 선언
//		String name, gender;
//		//4) 입력 받기
//		System.out.print("이름 입력 : ");
//		name = sc.next();
//		System.out.print("성별 입력 : ");
//		gender = sc.next();
//		//5) 출력하기
//		System.out.println("이름은 " + name + "이고 " + gender + "입니다.");
//		//6) 입력 개체 해제하기
//		sc.close();
		
	     // 로직구성
	      // 1) 입력클래스 선언 + 입력클래스 import
	      Scanner sc = new Scanner(System.in);
	      // 2) 이름 입력 메시지 출력
	      System.out.println("이름 입력하세요 : ");
	      // 3) 문자열 변수(name, gender) 선언
	      String name, gender;
	      // 4) 변수에 입력 메소드 사용(next())
	      name = sc.next();
	      // 5) 성별입력 메시지 출력
	      System.out.println("성별을 입력하세요 : ");
	      gender = sc.next();
	      // 5) 결과 출력
	      System.out.printf("이름은 %s이고, 성별은 %s입니다.", name, gender);
		
	}
}
