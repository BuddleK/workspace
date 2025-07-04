package gameTask;

public class Wizard extends Character {

	public Wizard() {
		super("마법사", 15, 30, 1, 30, 0);
	}

	@Override
	public void normalAttack() {
		// TODO Auto-generated method stub
		System.out.println(name + "의 Hp가 2 감소합니다.");
		this.hp -= 2;
		this.revive(); // 체력이 줄면 부활이 가능한지 확인할 것.
		super.normalAttack();
	}

	@Override
	public void skillAttack() {
		// TODO Auto-generated method stub
		if (checkMp(10)) {
			super.skillAttack();
		} else {
			System.out.println("mp가 부족합니다. 스킬공격이 불가합니다.");
			this.showStatus();
		}
	}

	@Override
	public void specialAttack() {
		// TODO Auto-generated method stub
		System.out.println(name + "는 특수공격이 정의되어 있지 않습니다.");
		this.showStatus();
	}

}
