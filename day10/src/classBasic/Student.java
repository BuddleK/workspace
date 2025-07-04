package classBasic;
// 10-1번 : 클래스 - 사용자 정의 타입이다(자료형)
public class Student {
	//필드(속성, 특징)
	//이름, 수학점수, 영어점수, 국어점수, 평균점수
	String name;
	int math;
	int eng;
	int kor;
	double avg;
	
	//메소드(행동, 행위, 기능)
	//10-3번 : 연관성 있는 저장공간과 기능을 한 곳에 모아 관리할 수 있다
	   // 점수의 총합을 반환하는 메소드
	   int getTotal() {
	      return math + eng + kor;
	   }
	   
	   void printAverage() {
		   
		   System.out.printf("%s님의 평균 점수는 %.2f입니다.\n", name, avg = getTotal() / 3.0);
	   }
	   
	
}
