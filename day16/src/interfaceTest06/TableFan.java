package interfaceTest06;
//23번 : 어댑터클래스

public class TableFan extends FanAdapter {

	@Override
	public void on() {
		System.out.println("탁자선풍기 on");
	}

	@Override
	public void off() {
		System.out.println("탁자선풍기 off");
		// TODO Auto-generated method stub

	}

}