package oper;
//13번 : 산술연산자(+, -, *, /, %)
public class OperTest01 {// 클래스 중괄호 영역 시작
	public static void main(String[] args) { // main 메소드 중괄호영역 시작
		
//		int num1 = 10, num2 = 20;
//		double num3 = 5.5, num4 = 2.5;
//		
//		System.out.println("======덧셈======");
//		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
//		System.out.println(num3 + " + " + num4 + " = " + (num3 + num4));
//		System.out.println(num1 + " + " + num4 + " = " + (num1 + num4));
//		
//		System.out.println("\n======뺄셈======");
//		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
//		System.out.println(num3 + " - " + num4 + " = " + (num3 - num4));
//		System.out.println(num1 + " - " + num4 + " = " + (num1 - num4));
//		
//		System.out.println("\n======곱셈======");
//		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
//		System.out.println(num3 + " * " + num4 + " = " + (num3 * num4));
//		System.out.println(num1 + " * " + num4 + " = " + (num1 * num4));
//		
//		System.out.println("\n======나눗셈======");
//		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
//		System.out.println(num3 + " / " + num4 + " = " + (num3 / num4));
//		System.out.println(num1 + " / " + num4 + " = " + (num1 / num4));
//		
//		System.out.println("\n======나머지======");
//		System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
//		System.out.println(num3 + " % " + num4 + " = " + (num3 % num4));
//		System.out.println(num1 + " % " + num4 + " = " + (num1 % num4));
		
		//복합대입연산자
		int num = 10; // 정수형 변수 선언 및 초기화
		System.out.println("num의 현재 값 : " + num); // 10 출력
		num = num + 5; // 5 더해서 15
		System.out.println("num의 현재 값 : " + num); // 15 출력
		num = num + 15; // 15 더해서 30
		System.out.println(num); // 30출력
		num += 5;	//num = num + 5;
		System.out.println(num); // 35출력
		num -= 2.5;	//num = num - 2.5;
		System.out.println(num); //32, 실계 계산값은 32.5인데, 32로 나온 이유 int 변수에 저장했기 때문
		System.out.println(35 - 2.5); // 정수 - 실수 = 실수
		num *= 2;	//num = num * 2;
		System.out.println(num); //64
		
		
		
		
	} // main 메소드 중괄호 영역 끝
} // 클래스 중괄호 영역 끝
