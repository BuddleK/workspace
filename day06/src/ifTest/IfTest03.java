package ifTest;
//12번 : if ~ else if ~ else문
public class IfTest03 {// 클래스 시작
	public static void main(String[] args) { //main 시작
		//양수, 음수, 0
		System.out.println("출력 시작"); // 출력 시작
		
		int num = 10; // 정수형 변수 10
		
		if (num > 0) { 						// 10이 0보다 클 때
			System.out.println("양수입니다."); // 양수임을 알려주기
		}else if (num < 0) { 				// num이 0보다 작을 때
			System.out.println("음수입니다."); // 음수임을 알려주기
		}else {								// 음수도 양수도 아닐 때
			System.out.println("0입니다."); 	// 0임을 알려주기
		}
		
		if (num > 5 && num <15) {			// num이 5보다 크고 15보다 작을 때
			System.out.println("5보다 큽니다");	// 5보다 크다고 알려주기
		}else if (num > 3) {				// num이 3보다 클 때
			System.out.println("3보다 큽니다");	// 3보다 크다고 알려주기
		}else {								// 3 ~ 15 사이가 아닐 때
			System.out.println(num);		// num의 값을 알려주기
		}
		
		System.out.println("출력 끝");		// 출력 끝
	} //main 끝
} // 클래스 끝
