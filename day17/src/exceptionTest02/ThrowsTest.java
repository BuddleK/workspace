package exceptionTest02;
//13번 : throws와 throw (throws예외 던지기, 메소드 선언부에 사용한다)
public class ThrowsTest {
	public static void main(String[] args) {
		method();
	}
	
	static void method() {
		for(int i = 0;i < 10;i++) {
			System.out.println(i);
			//try ~ catch블록 단축키 : 예외발생할수있는코드드래그상태에서 alt + shift + z
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			//500 => 0.5초, 1000 => 1초
		}
	}
	
}
