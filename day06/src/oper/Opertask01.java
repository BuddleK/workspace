package oper;

import java.util.Scanner;

//4번 : ~논리연산자까지 복습문제
public class Opertask01 {
	public static void main(String[] args) {
		
		//사용자가 입력한 값 2개를 서로 비교하기
		//nextInt() 사용, 변수를 먼저 만들고 진행할 것!
		//변수 만들 때 의미있는 문자로 사용
		//로직구성부터!
		
//		//로직구성
//		//1)스캐너 임포트
//		Scanner sc = new Scanner(System.in);
//		//2)정수형 변수 2개 선언
//		int num1, num2;
//		//3)입력 메시지 출력
//		System.out.print("첫 번째 숫자를 입력하세요 : ");
//		//4)첫 번째 숫자 입력 받기
//		num1 = sc.nextInt();
//		//5)입력 메시지 출력
//		System.out.print("첫 번째 숫자를 입력하세요 : ");
//		//6)두 번째 숫자 입력 받기
//		num2 = sc.nextInt();
//		//7)비교하여 출력하기
//		System.out.printf("%d가 %d와 같거나 큰가요?\n 대답 : ", num1, num2);
//		System.out.println(num1 >= num2);
//		System.out.printf("%d가 %d와 같은가요?\n 대답 : ", num1, num2);
//		System.out.println(num1 == num2);
//		System.out.printf("%d가 %d와 같거나 작은가요?\n 대답 : ", num1, num2);
//		System.out.println(num1 <= num2);
//		//8)Scanner 닫기
//		sc.close();
		
		//로직구성부터!
		//1) 입력클래스 import
		//2) 정수형 변수 2개 선언
		//3) 입력 메시지 출력 (숫자 2개를 입력 (띄어쓰기로) : )
		//4) 변수 입력메소드 사용(nextInt())
		//5) 출력(3개)
		//6) sc.close()
		
		Scanner sc = new Scanner(System.in);
//		int num1, num2;
//		System.out.print("숫자 2개를 띄어쓰기로 구분하여 입력하세요 : ");
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		System.out.println(num1 + " < " + num2 + " : " + (num1 < num2));
//		System.out.println(num1 + " > " + num2 + " : " + (num1 > num2));
//		System.out.println(num1 + " > " + num2 + " || " + num1 + " == " + num2 + " : " + (num1 > num2 || num1 == num2));
		
		//실수 관계연산자 사용
		double num3, num4;
		System.out.println("실수 2개를 띄어쓰기로 구분하여 입력하세요 : ");
		num3 = sc.nextDouble();
		num4 = sc.nextDouble();
		System.out.println(num3 + " < " + num4 + " : " + (num3 < num4));
//		0.0000001 0.00000000001
//		1.0E-7 < 1.0E-11 : false
//		1.0E-8 10의 -8제곱(소수점아래 8자리)
//		1.0E-11 10의 -11제곱(소수점아래 11자리)
		
	}
}
