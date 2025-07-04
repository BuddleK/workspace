package ex01_강버들;

public class Student extends Person {
	
	//필드
	private int sco;

	//학생
	public Student(String name, int age, int sco) {
		super(name, age);
		this.sco = sco;
	}

	//메소드 오버라이딩
	@Override
	public void score() {
		System.out.printf("%s의 점수는 %d점입니다.\n", getName(), sco);
	}
}
