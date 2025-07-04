package accessModifier02;

import accessModifier01.AccessTarget;

public class AccessTest extends AccessTarget{

	public AccessTest() {
		super.protectedMethod();//상속 통애 접근 가능
		this.protectedMethod();//현재클래스의 객체 통해 접근 가능
	}
	
	public void testAccess() {
//		AccessTarget at = new AccessTarget("hi"); //protected 생성자 접근 불가
		this.protectedMethod();//상속통애 접근가능
	}
	
}
