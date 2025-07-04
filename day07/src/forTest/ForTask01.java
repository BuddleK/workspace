package forTest;

import javax.swing.plaf.synth.SynthOptionPaneUI;

//6번 : for문 연습
public class ForTask01 {
	public static void main(String[] args) {
		//for문만 사용
		//1. 100부터 1까지 출력(tab키로 띄어쓰기)
		
		//2. 구구단 3단만 출력
		
		//3. A ~ F 출력(초기식 char i = 'A')
		
		//4. A ~ F 출력(초기식 int i = 0)
		
		//5. aBcDeFgHiJkLmNoPqRsTuVwXyZ
		


		System.out.println("1번~~~~!");
		
		//1) 100부터 1까지 출력(tab키로 띄어쓰기)
		for(int i = 0;i < 100; i++) {
		
			System.out.print(100 - i + "\t");
		}

		System.out.println("\n\n2번~~~~!");
		
		//2)  구구단 3단만 출력
//		for(int i = 1; i <= 9;i++) {
//			System.out.printf("3 * %d = %d\n", i, 3 * i);
//		}
		
		int dan = 3;
		for(int i = 1;i < 10;i++) {
			System.out.println(dan + " x " + " = " + dan * i);
		}

		System.out.println("\n3번~~~~!");
		
		//3) A ~ F 출력(초기식 char i = 'A')
		for(char i = 'A'; i <= 'F';i++) {
			System.out.print(i + " ");
		}

		System.out.println("\n\n4번~~~~!");
		
		//4) A ~ F 출력(초기식 int i = 0)
		for(int i = 0 ; i <= 5 ; i++) {
			System.out.printf("%c ", i + 65);
		}


		System.out.println("\n\n5번~~~~!");
		
//		//5) aBcDeFgHiJkLmNoPqRsTuVwXyZ
//		for(char i = 'A'; i <= 'Z'; i++) {
//			if(i % 2 == 0) {
//				System.out.printf("%c", i);
//			}else {
//				System.out.printf("%c", i + 32);
//			}
//		}
		
		for(int i = 0;i < 26;i++) {
			System.out.print((char)(i % 2 == 0 ? i + 97 : i + 65));
		}
		
		//현재 i의 값 25
		//	조건식 25 < 26	true, 중괄호 영역 (char)(25 % 2 == 0 false, 25 + 65) => (char)91, 증감식 i++ => 25 + 1
		//현재 i의 값 26
		//	조건식 26 < 26	false, for문 탈출
		
		//첫번째 반복문
		//초기식 i가 0, 조건식 0 < 26 true, 총괄호영역 (char)(97) => a, 증감식 i++ => i = 0 + 1
		//현재 i의 값 1
		//		조건식 1 < 26 true, 중괄호영역 (char)(1 + 65) => (char)66 => B, 증감식 i++ => i = 1 + 1
		
		
		
	}
}
