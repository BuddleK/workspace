
package task;
import java.util.Scanner;
public class decode {
	
	
//package whileTest;
	
//import java.util.Scanner;

// 10번 : while문 예제

//public class WhileTest03 { // 클래스 시작
   public static void main(String[] args) { //main 시작


      int result = 0, choice = 0; // 결과 저장 변수, 사용자 입력 변수
      Scanner sc = new Scanner(System.in); //스캐너 임포트
      while (true) { // 상시 실행(무한반복)
         System.out.println("2개의 정수 입력(입력시 1, 0 제외) : "); //입력메시지
         int num1 = sc.nextInt(); // 숫자 입력 시작
         int num2 = sc.nextInt(); // 띄어쓰기든 엔터든 상관 없이 구분된 두 정수를 가져옴
         result = num1 + num2; // 두 수를 더하여 저장
         System.out.println(num1 + " + " + num2 + " = " + result); // 연산 결과 출력
         System.out.println("계속 : 1, 종료 : 0을 누르세요 : "); // 선택 입력 메시지
         choice = sc.nextInt(); // 선택 입력
         if (choice == 0) { // 값을 통해 종료를 선택했는지 확인
            System.out.println("종료"); // 종료메시지 출력
            break;	// 반복문 탈출
         }
         if (choice == 1) { // 값을 통해 계속 실행하길 선택했는지 확인
            System.out.println("계속 진행합니다"); // 진행메시지 출력
            continue; //조건문으로 점프
         }
         System.out.println("프로그램"); // 0이든 1이든 실행되지 않으나 다른 값이면 출력됨.
      }
      System.out.println("반복문을 종료합니다"); // 종료 메시지
      sc.close(); //스캐너 닫기
      

   } // 클래스 시작
} //main 시작
