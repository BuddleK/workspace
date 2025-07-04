package task01;

public class Student extends Person {
	// 필드
	// 학번, 전공
	String hakbun;
	String major;

	// 생성자
	// 기본생성자
	// 매개변수 4개 있는 생성자
	public Student() {
		this("이름 없음", 0, "값 없음", "전공 없음");
		System.out.println("Student 클래스 기본 생성자 호출");
	}

	public Student(String name, int age, String hakbun, String major) {
		super(name, age);
		this.hakbun = hakbun;
		this.major = major;
		System.out.println("Student 클래스 매개변수 4개 있는 생성자 호출");
	}
	
	@Override
	void introduce() {
		// TODO Auto-generated method stub
		super.introduce();
		System.out.printf("학번 : %s, 전공 : %s\n", this.hakbun, this.major);
	}

}
