package inheritanceTest02;
//2번 : 상속 기초(Animal 클래스를 상속받은 Bird 클래스)
public class Bird extends Animal{
	//필드
	//메소드
	//새 클래스의 고유 메소드
	void fly() {
		System.out.println(this.name + "이/가 하늘을 날고 있습니다.");
	}
	//생성자
	public Bird() {
	}
	
	static {
		System.out.println("bird 스태틱");
	}
	
}
