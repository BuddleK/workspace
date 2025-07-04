package scanner;

import java.util.Scanner;

//10번 : 입력 클래스, 입력 메소드 실습2
public class ScannerTask02 {// 클래스 중괄호 영역 시작
	public static void main(String[] args) {// main 메소드 중괄호영역 시작
		
		//1. 줄 단위로 입력받아 출력하기 (입력은 반드시 3번 출력은 1번만 사용)
		//입력1 : 예 > 자바는
		//입력2 : 예 > 객체지향
		//입력3 : 예 > 언어입니다
		//[출력]
		// 자바는
		// 객체지향
		// 언어입니다
		
	    //1) 입력클래스 import
	    //2) 출력메시지1
	    //3) 문자열 변수1 선언, next()
	    //4) 출력메시지2
	    //5) 문자열 변수2 선언, next()
	    //6) 출력메시지3
	    //7) 문자열 변수3 선언, next()
	    //8) 출력 println
		Scanner sc = new Scanner(System.in);
		System.out.print("입력1 : ");
		String str1 = sc.next();
		System.out.print("입력2 : ");
		String str2 = sc.next();
		System.out.print("입력3 : ");
		String str3 = sc.next();
		
		System.out.println(str1 + " " +str2 + " " +str3);
		
		
//		//(내가 한 거) 로직 구성
//		// 1) 입력 클래스 선언, 임포트
//		Scanner sc = new Scanner(System.in);
//		// ctrl + shift + o
//		// 1-2) 입력받은 값 저장할 변수 선언
//		String str1, str2, str3;
//		// 2) 입력 받기
//		System.out.print("입력 1 : ");
//		str1 = sc.nextLine();
//		System.out.print("입력 2 : ");
//		str2 = sc.nextLine();
//		System.out.print("입력 3 : ");
//		str3 = sc.nextLine();
//		// 3) 출력하기
//		System.out.println(str1 + " " + str2 + " " + str3);
		
		//2. 이름과 나, 취미를 순서대로 입력받기(입력메소드 이름과 취미 nextLine()사용, 나이는 next() 사용)
		// 출력 시 prinf()사용, 형변환 반드시 적용해서 출력할 것
		//이름입력 : 홍길동
		//나이입력 : 20
		//취미입력 : 여행
		//[출력]
		//홍길동은 20살이고 취미는 여행입니다.
		//홍길동은 2026년에 21살입니다.
		
//		//(내가 한 거)로직 구성
//		//1) 입력 클래스 선언, 임포트
//		// 위에서 함!
//		//2) 입력받을 값을 저장할 변수들 선언
//		String name,hobby; 
//		int age;
//		//3) 입력받기
//		System.out.print("이름입력 : ");
//		name = sc.nextLine();
//		System.out.print("나이입력 : ");
//		age = Integer.parseInt(sc.next());
//		sc.nextLine();
//		System.out.print("취미입력 : ");
//		hobby = sc.nextLine();
//		//4) 출력
//		System.out.printf("%s은 %d살이고 취미는 %s입니다.\n", name, age, hobby);
//		System.out.printf("%s은 2026년에 %d살입니다.\n", name, age + 1);
//		//5) 입력 개체 해제하기
//		sc.close();
		
		sc.nextLine();
		
		//1) 입력 클래스, import
		//2) 입력 메시지 출력
		System.out.print("이릅 입력 : ");
		//3) String 변수 3개
		String name, age, hobby;
		//4) name 변수 = nextLine()
		name = sc.nextLine();
		//5) 입력 메시지 출력
		System.out.print("\n나이 입력 : ");
		//6) age 변수 = next()
		age = sc.next();
		//7) 버퍼 비우기
		sc.nextLine();
		//8) 입력메시지 출력
		System.out.print("\n취미 입력 : ");
 		//9) hobby 변수 = nextLine()
		hobby = sc.nextLine();
		//10) 결과 출력 printf(), 형변환 덧셈연산 후 출력
		System.out.printf("%s의 나이는 %d이고 취미는 %s입니다.\n", name, Integer.parseInt(age), hobby);
		System.out.printf("%s은 2026년에 %d살입니다.\n", name, Integer.parseInt(age) + 1, hobby);
		//11) Scanner 닫기
		sc.close();
	}

}
