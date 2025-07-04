package review;

public class Teacher extends Person{

	public Teacher(String name) {
		super(name);
	}

	@Override
	void introduce() {
		System.out.println("저는 선생님입니다.");
	}
	
	void teach() {
		System.out.println(this.getName() + "가 가르칩니다.");
	}
	

}
