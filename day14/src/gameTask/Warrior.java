package gameTask;

public class Warrior extends Character {

	public Warrior() {
		super("전사", 30, 10, 5, 15, 100);
	}
	
	
	public void onlyWarrior() {
		System.out.println("전사만 할 수 있는 고유 행동입니다.");
		this.showStatus();
	}


	@Override
	public void skillAttack() {
		// TODO Auto-generated method stub
		if (checkMp(3)) {
			System.out.println(name + "이(가) 스킬공격을 실행했습니다.");
			System.out.println("적에게 " + skillDmg + " 만큼 피해를 입혔습니다.");
			System.out.println("mp가 3 감소했습니다.");
			mp -= 3;
			showStatus();
		} else {
			System.out.println("mp가 부족합니다. 스킬공격이 불가합니다.");
			this.showStatus();
		}
	}


	@Override
	public void specialAttack() {
		// TODO Auto-generated method stub

		System.out.println(name + "이(가) 특수공격을 실행했습니다.");
		System.out.println("적에게 " + 100 + " 만큼 피해를 입혔습니다.");
		System.out.println("Hp가 10 감소했습니다.");
		hp -= 10;
		this.revive();
		showStatus();
	}
	
	

}
//package gameTask;
//
//public class Wizard extends Character{
//
////   public Wizard(String name, int maxHp, int maxMp, int nomalDmg, int skillDmg, int specialDmg) {
////      super(name, maxHp, maxMp, nomalDmg, skillDmg, specialDmg);
////   }
//   
////   기본 생성자를 통해 마법사, 15, 30, 1, 30, 0 전달
//   public Wizard() {
//      super("마법사", 15, 30, 1, 30, 0);
//   }
//
//   @Override
//   public void normalAttack() {
////      normalAttack() 오버라이딩 : 체력 2 감소 후 공격 실행
////      super.normalAttack();
//      hp -= 2;
//      super.normalAttack();
//      revive();
//   }
//
//   @Override
//   public void skillAttack() {
////      skillAttack() 오버라이딩 : mp가 부족하면 출력 후 실패
//      if(checkMp(10)) {
//         super.skillAttack();
//      }else {
//         System.out.println("마나 부족으로 스킬사용 불가");
//      }
//   }
//
////   specialAttack() 오버라이딩 : 마법사는 특수공격이 없습니다 출력
//   @Override
//   public void specialAttack() {
//      System.out.println("마법사는 특수공격이 없습니다");
//   }
//   
//}
