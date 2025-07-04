package typeCasting;
//2번 : 다른자료형 -> 문자열로
// + ""
public class TypeCasting01 {
	public static void main(String[] args) {
		int num1 = 10;
		float num2 = 20.17f; //float 타입은 f를 꼭 붙여주자.
		long num3 = 30L; //long 타입도 int로 오해받을 수 있으니 L을 붙여주자.
		double num4 = 40.17;
		boolean isTrue = true;
		char alpha = 'a';
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(isTrue);
		System.out.println(alpha);
		
		System.out.println("==========출력부============");
		System.out.println(num1 + num3); // 정수 + 정수 = 정수
		System.out.println(num2 + num4); // 실수 + 실수 = 실수
		System.out.println(num1 + num4); // 정수 + 실수 = 실수
		
		String result1 = num1 + num3 + "";//40
						//10 + 30 > "40"
		String result2 = "" + num1 + num3;//1030
						//"10" + 30 > "1030"
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(isTrue + "");
		System.out.println(alpha + "");
	}
}
