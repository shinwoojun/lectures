package chapter07.fight;

public class FightMain {
	public static void main(String[] args) {
		// 우리편
		Fighter fighter = new Fighter(563);
		System.out.println("전사체력: " + fighter.getCurrentHP());
		
		Healer healer = new Healer(430);
		System.out.println("힐러체력: " + healer.getCurrentHP());
		
		Fighter fighter2 = new Fighter(1023);
		System.out.println("전사2체력: " + fighter2.getCurrentHP());
		
		
		// 적
		Fighter enemyFighter = new Fighter(678);
		System.out.println("적전사 체력: " + enemyFighter.getCurrentHP());
		
		// 전투
		// 공격
		fighter.attack(enemyFighter);
		System.out.println("적전사 전사공격후 체력: " + enemyFighter.getCurrentHP());
		healer.attack(enemyFighter);
		System.out.println("적전사 힐러공격후 체력: " + enemyFighter.getCurrentHP());
		
		// 방어
		enemyFighter.attack(healer);
		System.out.println("힐러방어 후 체력: " + healer.getCurrentHP());
		
		healer.heal(fighter);
		System.out.println("전사 힐 후 체력: " + fighter.getCurrentHP());
		
		// 적전사의 광역기
		enemyFighter.attack(fighter);
		enemyFighter.attack(healer);
		enemyFighter.attack(fighter2);
		
		Unit[] units = {fighter, healer, fighter2};
		int unitSize = units.length;
		for (int i = 0; i < unitSize; i++) {
			enemyFighter.attack(units[i]);
		}
		
		for (int i = 0; i < unitSize; i++) {
			System.out.println(units[i].getCurrentHP());
		}

		
	}
}



















