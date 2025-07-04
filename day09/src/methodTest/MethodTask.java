package methodTest;

public class MethodTask {
   // 1. 음수를 양수로, 양수를 음수로 바꿔주는 메소드 매개변수o, 리턴값o
   // 메소드명 : changeSign

   // 1) 기능 생각 => 음수면 양수로, 양수면 음수로
   // 2) 리턴타입 생각 => void
   // 3) 메소드명 생각 => changeSign
   // 4) 매개변수 생각 => 정수형 1개
   // 5) 구현부 실행할 문장 생각 => 음수 -> 양수, 양수 -> 음수 (매개변수명 * -1)
   // 6) return 매개변수 * -1;
   // 7) 리턴값에 맞는 타입으로 변경한다 => int

   int changeSign(int num) {
      return num * -1;
   }

   // 2. 이름과 정수를 받아와서 정수만큼 이름을 출력하는 메소드
   // 매개변수o, 리턴값o
   // 메소드명 : printName

   // 1) 기능 => 전달된 정수만큼 전달된 이름 출력
   // 2) 리턴타입 => void
   // 3) 메소드명 => printName
   // 4) 매개변수 => 2개(int, String)
   // 5) 구현부{ 실행할 문장 =>
   // 5-1) for문( 초기식 int i = 1; 조건식 i <= 정수형 매개변수; 증감식++)
   // 5-2) { syso(문자열매개변수); }
   // 6) 리턴값 => "정수 : " + 정수형매개변수 + "이름 : " + 문자열매개변수;
   // 7) 리턴타입을 수정 => String

   String printName(int num, String name) {
      for (int i = 1; i <= num; i++) {
         System.out.println(name);
      }
      return "정수 : " + num + ", 이름 : " + name;
   }
   // 3. 10이하의 숫자는 1로 10을 초과하는 숫자는 100으로 반환하는 메소드
   // 매개변수o, 리턴값o
   // 메소드명 : changeNumber

   // 1) 리턴타입 => int
   // 2) 메소드명 => changeNumber
   // 3) 매개변수 => 정수형 1개
   // 4) 실행할문장 //5) 리턴값 => 리턴값 삼항 연산자

   int changeNumber(int num) {
      return num <= 10 ? 1 : 100;
   }

   // 4. 5개의 정수 중 평균을 반환하는 메소드
   // 매개변수o(배열), 리턴값o
   // 메소드명 : getAvg

   // 1) 리턴타입 => void
   // 2) 메소드명 => getAvg
   // 3) 매개변수 => int[] ar
   // 4) 실행할문장 =>
   // 총합구할 변수
   // 반복문(for-each문){
   // 총합구할변수 += 반복문변수;
   // }
   // 5) 리턴 생각 => (실수형) 총합구할변수 / 배열.length;
   // 6) 리턴타입을 double 변경

   double getAvg(int[] ar) {
      int total = 0;
      for (int num : ar) {
         total += num;
      }
      return total / (double) ar.length;
   }

   // 5. 정수 배열 중 최대값과 최소값을 출력하는 메소드
   // 매개변수o(배열), 리턴값x
   // 메소드명 : printMinMax

   // 1) 리턴타입 => void
   // 2) 메소드명 => printMinMax
   // 3) 매개변수 => int[] ar
   // 4) 실행할문장 => 최소값, 최대값을 0번째 인덱스로 저장하고 반복문 통해 비교
   // 0번째 인덱스의 값보다 작은값이 최소값, 큰값이 최대값이 된다 출력

   void printMinMax(int[] ar) {
      int min = ar[0];
      int max = ar[0];

      for (int i = 1; i < ar.length; i++) {
//         if(ar[i] < min) {
//            min = ar[i];
//         }
         min = min > ar[i] ? ar[i] : min;
         max = max < ar[i] ? ar[i] : max;
      }
      System.out.println("최소값 : " + min + ", 최대값 : " + max);
   }

   // 6. 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
   // 예시 ) BanAnA => bANaNa
   // 메소드명 : changeCase
   // 매개변수와 반환값은 자유 => 단, 형변환 이용할것!

   // 1) 리턴타입 => void
   // 2) 메소드명 => changeCase
   // 3) 매개변수 => 문자열 1개
   // 4) 실행할문장 =>
   // 문자형 변수1 선언
   // 문자열 변수2 선언
   // for문( int i=0; i < 매개변수.length(); i++){
   // 변수1 = 매개변수.charAt(i);
//         조건문(if~else if~else)
   // if(변수1 >= 97 && 변수1 <= 122{
   // 변수2 += (char)(변수1 - 32);
   // }else if(변수1 >= 65 && 변수 <= 90){
   // 변수2 += (char)(변수1 + 32);
   // }else{
   // 잘못된 값입니다 출력
   // }}
   // return 변수2;
   // 5) 리턴타입 수정 => String
   
   String changeCase(String str) {
      char c = ' ';
      String result = "";
      
      for(int i = 0; i < str.length(); i++) {
         c = str.charAt(i);
         if(c >= 97 && c <= 122) {
            result += (char) (c - 32);
         }else if(c >= 65 && c <= 90) {
            result += (char) (c + 32);
         }else {
            result = "잘못된 값입니다";
         }
      }
      return result;
   }
   

   // 7. 아이디와 비밀번호를 입력받아 로그인하기
   // 매개변수o 리턴값o(리턴타입 boolean)
   // 메소드명 : login
   // main 메소드에서 id가 admin이고 비밀번호가 1234이면 관리자님 환영합니다 출력
   // 둘중하나라도 틀리면 다시 확인하세요 출력

   public static void main(String[] args) {

      MethodTask mt = new MethodTask();

      // 매개변수o, 리턴값o => syso(객체명.메소드명(인수));
      System.out.println("===========1번===========");
      System.out.println(mt.changeSign(100));
      System.out.println(mt.changeSign(-100));

      System.out.println("\n===========2번===========");
      System.out.println(mt.printName(2, "짱구"));
      String value = mt.printName(3, "철수");
      System.out.println(value);

      System.out.println("\n===========6번===========");
      System.out.println(mt.changeCase("HELLO")); //hello
      System.out.println(mt.changeCase("java")); //JAVA
      System.out.println(mt.changeCase("HeLlO")); //hElLo
      
      
//      double getAvg(int[] ar) {
//         int total = 0;
//         for(int num : ar) {
//            total += num;
//         }
//         return (double)(total / ar.length);
//      }

//      int[] ar = { 10, 20, 30 };
//      System.out.println(mt.getAvg(ar));
//      System.out.println(mt.getAvg(new int[] { 15, 22, 37 }));
//      System.out.println((15 + 22 + 37) / 3.0);
   }
}



//package methodTest;
//
//import javax.swing.plaf.synth.SynthOptionPaneUI;
//
//public class MethodTask {
//	public static void main(String[] args) {
//		MethodTask mt = new MethodTask();
//		
//		
//		//1. 음수를 양수로, 양수를 음스로 바꿔주는 메소드
//		//매개변수o, 리턴값o
//		//메소드명 : changeSign
//		System.out.println(mt.changeSign(1));
//		System.out.println(mt.changeSign(-1));
//		System.out.println(mt.changeSign(9));
//		System.out.println(mt.changeSign(-9));
//
//		
//		//2. 이름과 정수를 받아와서 정수만큼 이름을 출력하는 메소드
//		//매개변수o, 리턴값o
//		//메소드명 : printName
//		mt.printName("강버들", 3);
//		
//		//3. 10이하의 숫자는 1로 10을 초과하는 숫자는 200으로 반환하는 메소드
//		//매개변수o, 리턴값o
//		//메소드명 : changeNumber
//		System.out.println(mt.changeNumber(10));
//		System.out.println(mt.changeNumber(11));
//		
//		//4. 5개의 정수 중 평균을 반환하는 메소드
//		//매개변수o(배열), 리턴값o
//		//메소드명 : getAvg
//		
//		int[] arr = {2, 3, 5};
//		System.out.println("평균은 : " + mt.getAvg(arr));
//		
//		//5. 정수 배열 중 최대값과 최소값을 출력하는 메소드
//		//매개변수o(배열), 리턴값x
//		//메소드명 : printMinMax
//		mt.printMinMax(arr);
//		
//		//6. 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
//		//예시) BanAnA => bANaNa
//		//메소드명 : changeCase
//		//매개변수와 반환값은 자유 => 단, 형변환 이용할 것!
//		System.out.println(mt.changeCase("BanAnA"));
//		
//		
//		//7. 아이디와 비밀번호를 입력받아 로그인하기
//		//매개변수o 리턴값o(리턴타입 boolean)
//	    //메소드명 : login
//	    //main 메소드에서 id가 admin이고 비밀번호가 1234이면 관리자님 환영합니다 출력
//	    //둘중하나라도 틀리면 다시 확인하세요 출력
//		
//		System.out.println("로그인 시도 결과 : " + mt.login("강버들", "1234"));
//		System.out.println("로그인 시도 결과 : " + mt.login("admin", "1234"));
//	}
//	
//	
//	//1) 음수를 양수로, 양수를 음수로 바꿔주는 메소드
//	// 결과를 담을 정수형 변수 선언
//	// if(매개변수가 0보다 클 때)
//		// 음수로 변환한다	~(n - 1)
//	// else(그 밖의 경우 : 매개변수가 0보다 작거나 같을 때)
//		// 양수로 변환한다 ~n + 1
//	// 결과 return
//	int changeSign(int num) {
//		int result = 0;
////		if(num > 0) {
////			result = ~(num - 1);
////		}else {
////			result = ~num + 1;
////		}
//		result = ~(num - 1);
//		result = num * -1;
//		return result;
//	}
//	
//	//2) 이름과 정수를 받아와서 정수만큼 이름을 출력하는 메소드
//	// 결과를 담을 문자열 선언
//	// 반복문(입력받은 정수만큼) 
//		// 결과문자열에 이름을 합한다
//	// 반복문 끝
//	// 결과문자열 출력
//	// 결과문자열 반환
//	String printName(String name, int num) {
//		String msg = "";
//		for(int i = 0 ; i< num; i++) {
//			msg += name + " ";
//		}
//		System.out.println(msg);
//		return msg;
//	}
//	
//	//3) 10이하의 숫자는 1로 10을 초과하는 숫자는 200으로 반환하는 메소드
//	// 결과를 담을 정수형 변수 선언
//	// if(매개변수가 10 이하일 때)
//		//결과변수 = 1;
//	// else(그 밖의 경우 : 매개변수가 10 초과일 때)
//		//결과변수 = 200;
//	//결과변수 반환
//	int changeNumber(int num) {
//		int result = 0;
//		if(num <= 10) {
//			result = 1;
//		}else {
//			result = 200;
//		}
//		return result;
//	}
//	
//	//4) 5개의 정수 중 평균을 반환하는 메소드
//	// 총합을 담을 실수형 변수 선언
//	// 반복문(배열의 크기만큼)
//		// 총합에 더하기
//	// 반복문 끝
//	// 총합을 배열의 크기로 나누어 반환하기(총합이 double형이라 형변환 가능)
//	double getAvg(int[] arr) {
//		double sum = 0;
//		
//		for(int i = 0;i < arr.length;i++) {
//			sum += arr[i];
//		}
//		
//		return sum / arr.length;
//	}
//	
//	//5) 정수 배열 중 최대값과 최소값을 출력하는 메소드
//	// 최소값과 최대값을 저장할 변수를 선언하고 초기값 넣어주기
//	// 반복문(배열의 크기만큼)
//		// min과 arr[i]을 비교하여 더 작은 수를 min에 저장하기
//		// max와 arr[i]을 비교하여 더 큰 수를 max에 저장하기
//	// 반복문 끝
//	// 결과 출력하기
//	void printMinMax(int[] arr) {
//		int min = arr[0];
//		int max = arr[0];
//		
//		for(int i = 0;i < arr.length;i++) {
//			if(arr[i] < min) {
//				min = arr[i];
//			}
//			if(arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		System.out.println("최대값은 : " + max + ", 최소값은 " + min + "입니다.");
//	}
//	
//	//6) 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
//	// 결과문자열 선언하기
//	// 반복문(문자열의 크기만큼)
//		// char 변수 선언하기
//		// 문자열의 i번째 글짜를 형변환하여 char 변수에 넣어주기
//		// if(문자가 'Z' 보다 클 때)
//			// 문자에서 32를 빼기
//		// else
//			// 문자에 32를 더하기
//		//문자를 결과문자열에 연결하기
//	// 반복문 끝
//	// 결과문자열 반환하기
//	String changeCase(String string) {
//		String resultString = "";
//		for(int i = 0;i<string.length();i++) {
//			char c = string.charAt(i);
//			if(c > 'Z') {
//				c -= 32;
//			}else {
//				c += 32;
//			}
//			resultString += c;
//		}
//		return resultString;
//	}
//	
//	//7) 아이디와 비밀번호를 입력받아 로그인하기
//	// 논리형 결과변수 선언하고 false로 초기화하기
//	// if(매개변수 id가 "admin"과 같고 pw가 "1234"와 같을 때)
//		// "관리자님 환영합니다." 출력하기"
//		// 결과변수 true로 바꾸기
//	// 결과변수 반환하기
//	boolean login(String id, String pw) {
//		boolean resultB = false;
//		if(id.equals("admin") && pw.equals("1234")) {
//			System.out.println("관리자님 환영합니다.");
//			resultB = true;
//		}
//		return resultB;
//	}
//	
//}
