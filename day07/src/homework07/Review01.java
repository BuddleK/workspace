package homework07;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

// 실습 1 ~ 5번
public class Review01 {
	public static void main(String[] args) {
		
		

		//0) 스캐너임포트
		
		// 1. 한 개의 정수를 입력받아 짝수인지 홀수인지 출력하기(삼항 연산자 이용)
		//) 정수형 변수 선언
		//)	정수 입력 메시지
		//) 정수 입력
		//) 삼항연산자로 여부 출력
		

		// 2. 한 개의 정수를 입력받아 양수, 음수, 0인지 출력하기(조건문)
		//) 정수형 변수 선언
		//)	정수 입력 메시지
		//) 정수 입력
		//) if(값이 0보다 클 때)
			//"양수입니다." 출력
		//) else if(값이 0보다 작을 때)
			//"음수입니다." 출력
		//) else
			//"0입니다." 출력
		
		
		//3. 나이를 입력받아서 다음 기준으로 출력하기
		//) 정수형 변수 선언
		//)	정수 입력 메시지
		//) 정수 입력
		//) 현재 나이 먼저 알려주기(출력)
		//) if(나이가 0 ~ 12일때)
			// 어린이입니다. 출력
		//) else if(나이가 13 ~ 19일 떄)
			// 청소년입니다. 출력
		//) else
			// 성인입니다. 출력
		

		//4. 세 개의 정수를 입력받아 가장 작은 숫자부터 큰 숫자 순으로 정렬하여 출력하기
		//단, 세 개의 정수는 모두 다른 숫자여야한다(중복 값 x)
		//) 정수형 변수 3개 선언, 가장 작은 값을 건질 변수(min) = 2147483647, 가장 큰 값을 건질 변수(max) = -2147483648
		//) 입력메시지 출력
		//) 입력 받기
		//) if(중복되는 숫자가 없다)
			// (참) : 
			// 세 변수 모두 min과 max와 비교하여 각 변수에 든 값보다 작거나 큰 값을 가졌을 때 대입되도록 한다.
			// max를 가장 먼저 출력하고, 그 다음으로 max나 min과 값이 일치하지 않는 변수를 출력한다. 마지막으로 min을 출력한다.
			//else (거짓) : 프로그램 종료
		//) 출력
		
		//5. 사용자가 문자열을 입력받고 "X"만 입력했을 경우에만 종료 메시지 출력하고 그 외에는 입력한 문자열을 출력하기
		//) 문자열 변수 선언
		//) 입력 메시지 출력
		//) 문자열 입력
		//) if(문자열이 "X"인가?)
			// (참): 프로그램 종료
			//else (거짓) : 입력한 문자열 보여주기
		
		
		//) 스캐너 닫기
		
		
		

		Scanner sc = new Scanner(System.in);
		
		//5)
		do {
			
			//1)
			int num = 0;
			System.out.print("정수 하나를 입력하세요 : ");
			num = sc.nextInt();
			System.out.print(num + "은(는) ");
			System.out.println(num % 2 == 0 ? "짝수입니다." : "홀수입니다.");
			
			//2)
			int number = 0;
			System.out.print("정수 하나를 입력하세요 : ");
			number = sc.nextInt();
			System.out.print(number + "은(는) ");
			if(number > 0) {
				System.out.println("양수입니다.");
			}else if(number < 0) {
				System.out.println("음수입니다.");
			}else {
				System.out.println("0입니다.");
			}
			
			
			//3)
			int age = 0;
			System.out.print("나이를 입력하세요 :");
			age = sc.nextInt();
			System.out.print("현재 나이는 " + age + "살이고, ");
			if(age > 0 && age <= 12) {
				System.out.println("어린이입니다.");
			}else if(age <= 19) {
				System.out.println("청소년입니다.");
			}else {
				System.out.println("성인입니다.");
			}
			
			
			//4)
			int n1, n2, n3;
			int min = 2147483647, max = -2147483648;
			int minF = 0, maxF = 0;
			System.out.print("숫자 3개 입력 : ");
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			n3 = sc.nextInt();
			
			
			if(n1 != n2 && n1 != n3 && n2 != n3) {
				
				if (min > n1) {
					min = n1;
					minF = 1;
				}
				if (min > n2) {
					min = n2;
					minF = 2;
				}
				if (min > n3) {
					min = n3;
					minF = 3;
				}
				
				if (max < n1) {
					max = n1;
					maxF = 1;
				}
				if (max < n2) {
					max = n2;
					maxF = 2;
				}
				if (max < n3) {
					max = n3;
					maxF = 3;
				}
				
				System.out.print("정렬된 숫자 : " + max + " ");
				
				switch(6-maxF-minF) {
				case 1:
					System.out.print(n1);
					break;
				case 2:
					System.out.print(n2);
					break;
				case 3:
					System.out.print(n3);
					break;
				}
				
				System.out.println(" " +min);
				
			}else {
				System.out.println("중복되는 값이 있습니다.");
			}
			
			sc.nextLine();
			
			//5)
			String X = "";
			System.out.println("\n\n\"X\"를 입력하면 프로그램이 종료됩니다.");
			System.out.print("종료하시겠습니까? : ");
			X = sc.nextLine();
			if (X.equals("X")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("입력한 값을 확인하세요 : " + X);
			}
			
			System.out.println("\n\n처음으로 돌아갑니다...\n\n");
			
			
		}while(true);
		
		sc.close();
		
	}
}
