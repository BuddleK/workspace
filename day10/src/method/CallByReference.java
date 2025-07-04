package method;
//9번 Call By Reference
public class CallByReference {
	public static void main(String[] args) {
		//java의 기본 참조 타입 복사는 얕은 복사이다
		
		//참조값과 call by value
		int[] ar = {1,2,3};
		System.out.println("메소드 호출 전 : " + ar[0]);	//1
		System.out.println(ar);						//[I@3af49f1c
//		modifyArray(ar);							//[I@3af49f1c
//		System.out.println("메소드 호출 후 : " + ar[0]);	//10
		modifyArray2(ar);							//[I@3af49f1c
		System.out.println("메소드 호출 후 : " + ar[0]);	//10
	}
	
	static void modifyArray(int[] ar) {
		System.out.println(ar);
		ar[0] = 10;//힙메모리를 건드림
	}
	// 배열의 참조값이 복사되어 전달되므로 메소드 내부에서 배열의 값을 변경하면 원본배열에도 영향을 미친다
	
	static void modifyArray2(int[] ar) {
		ar = new int[] {10, 20,30};
		System.out.println(ar);
	}
	// 참조값이 복사되어 전달되므로 메소드 내부에서 새로운 객체를 참조하도록 변경하면
	// 원본배열에는 영향을 끼치지 않는다
}
