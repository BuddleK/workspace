package methodTest;

import java.util.Scanner;

public class MethodTask02 {
	
	public static void main(String[] args) {
		
		MethodTask02 mt = new MethodTask02();
		
		//정수형 배열
		//int[] arrInt = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		
		System.out.println("========================================");
		//1. 정수 1개를 받아서 짝수입니다, 홀수입니다를 반환하는 메소드
		//메소드명 : checkNum
		
		System.out.println(mt.checkNum(1));
		System.out.println(mt.checkNum(2));
		
		System.out.println("========================================");
		//2. 10칸짜리 정수 배열 받아 총합을 계산하여 반환하는 메소드
		// 메소드명 : getSum
		
		System.out.println(mt.getSum(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));

		System.out.println("========================================");
		//3. 문자열을 매개변수로 받아 겨꾸로 뒤집어 반환하는 메소드
		// 메소드명 : reverseStr
		// hello => olleh
		
		String exString = "hello";
		System.out.println(mt.reverseStr(exString));

		System.out.println("========================================");
		//4. 정수형 배열과 찾을 값을 매개변수로 받아서 배열에 존재하면 true 반환하는 메소드
		// 메소드명 : contains
		// 배열 요소 중에 10이라는 값을 반드시 넣고 10을 매개변수로 전달
		// syso(메소드명(배열명, 10)) => true
		
		System.out.println(mt.contains(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10)); // true
		System.out.println(mt.contains(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 20)); // false

		System.out.println("========================================");
		//5. 단수를 매개변수로 받아 해당 단의 구구단을(1 ~ 19)을 출력하는 메소드
		// 메소드명 : printGugudan
		// 3 x 1 = 3
		// ...
		// 3 x 19 = _
		
		mt.printGugudan(2);

		System.out.println("========================================");
		//6. 두 개의 문자열을 입력받아서 두 문자열의 길이가 같으면 같음, 다르면 다름 반환하는 메소드
		//메소드명 : compareLength
		
		System.out.println(mt.compareLength("강버들", "강버들"));
		System.out.println(mt.compareLength("강버들", "강산들"));
		System.out.println(mt.compareLength("강버들", "하리"));

		System.out.println("========================================");
		//7. 아이디와 비밀번호를 매개변수로 받아 검증, 시도횟수 3회 넘기면 잠금 반환
		//메소드명 : logtinTry
		
		System.out.println("amdin, 1234 : " + mt.loginTry("admin", "1234"));
		System.out.println("doremi, 1234 : " + mt.loginTry("doremi", "1234"));
		System.out.println("amdin, 9999 : " + mt.loginTry("amdin", "9999"));
		System.out.println("Daniel, Craig : " + mt.loginTry("Daniel", "Craig"));
		System.out.println("Daniel, Craig : " + mt.loginTry("Daniel", "Craig"));
		

		System.out.println("========================================7번 추가");
		
		int tryCount = 0;
		String id, passwd, result;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디 입력 : ");
			id = sc.nextLine();
			System.out.println("비밀번호 입력 : ");
			passwd = sc.nextLine();
			
			result = mt.loginTry(id, passwd);
			
			if(result.equals("로그인 성공")) {
				System.out.println("로그인 성공");
				break;
			}else {
				tryCount++;
				if(tryCount >= 3) {
					System.out.println("3회 이상 실패로 계쩡 잠금");
					break;
				}
				System.out.println("로그인 실패");
			}
		}
		
	}
	
	   // 1) 정수 1개를 받아서 짝수입니다, 홀수입니다를 반환하는 메소드
	   // 매개변수o, 리턴값o
	   // 메소드명 : checkNum

	   // 1) 기능 => 전달된 정수의 홀짝 검사
	   // 2) 리턴타입 => String
	   // 3) 메소드명 => checkNum
	   // 4) 매개변수 => 1개(int num)
	   // 5) 실행할문장 //6) 리턴값 => 리턴값 삼항 연산자
	
	String checkNum(int num) {
		return num % 2 == 0 ? "짝수입니다." : "홀수입니다.";
	}
	
	
	
	
	   // 2) 10칸짜리 정수 배열 받아 총합을 계산하여 반환하는 메소드
	   // 매개변수o, 리턴값o
	   // 메소드명 : getSum

	   // 1) 기능 => 전달된 정수형 배열의 총합 반환
	   // 2) 리턴타입 => int
	   // 3) 메소드명 => getSum
	   // 4) 매개변수 => 1개(int[] arr)
	   // 5) 실행할문장
			// 결과변수 선언
			// 반복문(배열의 크기만큼)
				// 결과변수 += 배열[i]
			// 반복문 끝
		//6) 리턴값 => 결과변수(총합)
	
	int getSum(int[] arr) {
		int resultSum = 0;
		
		if(arr.length != 10) {
			System.out.println("10자리 배열이 아닙니다!");
		}else {
			for(int num : arr) {
				resultSum += num;
			}
		}
		return resultSum;
	}
	
	
	
	
	   // 3) 문자열을 매개변수로 받아 겨꾸로 뒤집어 반환하는 메소드
	   // 매개변수o, 리턴값o
	   // 메소드명 : reverseStr

	   // 1) 기능 => 전달된 문자열의 순서 반전하여 반환
	   // 2) 리턴타입 => String
	   // 3) 메소드명 => reverseStr
	   // 4) 매개변수 => 1개(String str)
	   // 5) 실행할문장 
			// 결과문자열 선언
			// 반복문(배열의 크기만큼)
				//거꾸로 반복하며 결과문자열에 대입
			// 반복문 끝
		//6) 리턴값 => 결과문자열
		
	String reverseStr(String str) {
		String resultString = "";
		for(int i = 1 ; i <= str.length() ; i++) {
			resultString += str.charAt(str.length() - i);
		}
		return resultString;
	}
	   //3. 문자열을 매개변수로 받아 거꾸로 뒤집어 반환하는 메소드
	   //메소드명 : reverseStr
	   // hello => olleh
	   
	   //1) char[]을 이용한 방식
	   //리턴타입 => void
	   //메소드명 => reverseStr1
	   //매개변수 => String 1개
	   //실행할문장 =>
	   //   조건식(if문)   매개변수 == null
	   //         { return; }
	   //   int 변수1 = 매개변수명.length();
	   //   문자형배열 변수2 = new char[변수1];
	   //   반복문(for문) int i = 0; i < 변수1; i++
	   //   {   변수1[i] = 매개변수.charAt(변수1 - 1 - i); }
	   //return => 문자열변수 
	   
	   //매개변수 o, 리턴값 x 메소드 정의
	   String resverseStr1(String str) {
//	      if(str == null) {
//	         return null;
//	      }
	      int len = str.length();
	      char[] reverse = new char[len];
	      String result = "";
	      for(int i = 0; i < len; i++) {
	         reverse[i] = str.charAt(len - 1 - i);
	      }
	      return new String(reverse);
	   }
	   
	   //2) 뒤에서부터 문자를 하나씩 더해서 새로운 문자열 만드는 방식
	   // 리턴타입 => void
	   // 메소드명 => reverseStr2
	   // 매개변수 => String str
	   // 실행할 문장 => 
	   //   조건문 if(str == null){ return null; }
	   //   문자열 변수 선언
	   //  반복문(for문) int i = str.length() -1; i >= 0; i-- 
	   //      { 변수 += str.charAt(i); }
	   // return => 변수
	   // 리턴타입 변경 => String
	   
	   String reverseStr2(String str) {
	      if(str == null) {
	         return null;
	      }
	      String result ="";
	      for(int i = str.length() - 1; i >= 0; i--) {
	         result += str.charAt(i);
	      }
	      return result;
	   }

	   //3) char[] 새로 만들어서 앞뒤 바꿔서 복사하는 방식
	   // 리턴타입 => void
	   // 메소드명 => reverseStr3
	   // 매개변수 => String str
	   // 실행할 문장(기능구현)
	   //      조건문if   str ==null {return null;}
	   //      정수형 변수1 = str.length();
	   //      문자형배열 변수2 = new char[변수1];
	   //      반복문for문 int i = 0; i < 변수1; i++
	   //      {   변수2 = str.charAt(변수1 - 1 - i); }
	   //      String 변수3 = ""
	   //      for-each
	   //      for(char 변수 : 변수2){
	   //         변수3 += 변수;
	   //      }
	   //   리턴타입 변수3; String타입으로 변경
	   String reverseStr3(String str) {
	      if(str == null) {
	         return null;
	      }
	      
	      int len = str.length();
	      char[] reverse = new char[len];
	      
	      for(int i = 0; i < len; i++) {
	         reverse[i] = str.charAt(len - 1 - i);
	      }
	      String result= "";
	      for(char c : reverse) {
	         result += c;
	      }
	      return result;
	   }
	
	
	
	
	
	   // 4) 정수형 배열과 찾을 값을 매개변수로 받아서 배열에 존재하면 true 반환하는 메소드
	   // 매개변수o, 리턴값o
	   // 메소드명 : contains

	   // 1) 기능 => 전달된 정수 배열에서 값을 찾고 true 혹은 false 반환
	   // 2) 리턴타입 => Boolean
	   // 3) 메소드명 => contains
	   // 4) 매개변수 => 2개(int[] arr, int key)
	   // 5) 실행할문장
			// 결과변수 선언(논리형)
			// 반복문(배열의 크기만큼)
				// 대조, 일치 시 결과변수에 true 대입
			// 반복문 끝
		//6) 리턴값 => 결과변수(논리형)
	Boolean contains(int[] arr, int key) {
		Boolean f = false;
		for(int num : arr) {
			if(num == key) {
				f = true;
			}
		}
		return f;
	}
	
	
	
	   // 5) 단수를 매개변수로 받아 해당 단의 구구단을(1 ~ 19)을 출력하는 메소드
	   // 매개변수o, 리턴값x
	   // 메소드명 : printGugudan

	   // 1) 기능 => 전달된 정수에 해당하는 구구단 출력
	   // 2) 리턴타입 => void
	   // 3) 메소드명 => printGugudan
	   // 4) 매개변수 => 1개(int num)
	   // 5) 실행할문장 
			// 반복문(19번)
				//syso(num * i);
			// 반복문 끝
		
	void printGugudan(int num) {
		for(int i = 1 ;i <= 19;i++) {
			System.out.printf("%d * %d = %d\n", num, i, num * i);
		}
	}
	
	
	
	
	   // 6) 두 개의 문자열을 입력받아서 두 문자열의 길이가 같으면 같음, 다르면 다름 반환하는 메소드
	   // 매개변수o, 리턴값o
	   // 메소드명 : compareLength

	   // 1) 기능 => 전달된 두 문자열의 길이 대조
	   // 2) 리턴타입 => String
	   // 3) 메소드명 => compareLength
	   // 4) 매개변수 => 2개(String str1, String str2)
	   // 5) 실행할문장 //6) 리턴값 => 리턴값 삼항 연산자
	String compareLength(String str1, String str2) {
		
		return str1.length() == str2.length() ? "같음" : "다름";
	}
	
	
	
	
	   // 7) 아이디와 비밀번호를 매개변수로 받아 검증, 시도횟수 3회 넘기면 잠금 반환
	   // 매개변수o, 리턴값o
	   // 메소드명 : logtinTry
	
		// 0) 전역변수 선언, 0으로 초기화(실패횟수)

	   // 1) 기능 => 전달된 아이디와 비밀번호를 대조하고 3번 시도 시 잠금?
	   // 2) 리턴타입 => String
	   // 3) 메소드명 => logtinTry
	   // 4) 매개변수 => 2개(String id, String pw)
	   // 5) 실행할문장
			// 결과 문자열 선언
			//if(틀린 횟수가 3이상일 때)
				// 결과 문자열 = "잠겨 있음"
			//else if(아이디와 비밀번호가 맞을 때)
				// 전역변수 초기화
				// 결과 문자열 = "검증"
			//else(그 밖의 경우 : 안 맞을 때)
				// 전역변수 auth++;
				//if(전역변수 증감이 3번 이상 일어났을 떄)
					// 결과 문자열 = "잠금"	
				//else(아직 세번을 틀리진 않았을 때)
					// 결과 문자열 = "틀림"
		//6) 리턴값 => 결과문자열
	
	int failed = 0;
	
	String loginTry(String id, String pw) {
		String result = "";
		
		if(failed >= 3) {
			result = "잠겨 있음";
		}else if(id.equals("admin") && pw.equals("1234")) {
			failed = 0;
			result = "검증";
		}else {
			failed++;
			if(failed >= 3) {
				result = "잠금";
			}else {
				result = "틀림";
			}
		}
		
		return result;
	}
	
	//loginTry(검증만)
	String loginTrye1(String inputId, String inputPw) {
		final String ID = "admin";
		final String PW = "admin";
		
		if(ID.equals(inputId) && PW.equals(inputPw)) {
			
		}
		
		return "";
	}
}
