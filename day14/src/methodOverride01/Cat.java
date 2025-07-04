package methodOverride01;
//6번 : 오버라이딩
public class Cat extends Animal{

	@Override
	void sound() {
		super.sound();
		System.out.println("야옹");
	}
	
	final int animal = 1;
	
}
