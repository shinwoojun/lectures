package chapter08.fight;

public class FightMain {
	public static void main(String[] args) {
		try {
			Fighter fighter = new Fighter(560, null);
			System.out.println("전사체력: " + fighter.getCurrentHP());
			
			Fighter enemy = new Fighter(200, null);
			/*
			System.out.println("적 전사에게 1000연타 공격시작");
			for(int i = 0; i < 1000; i++) {
				System.out.print((i + 1) + " ");
				fighter.attack(enemy);
			}
			*/
			System.out.println("적 힐러가 1000연타 공격시작");
			Healer enemyHealer = new Healer(1403);
			for(int i = 0; i < 1000; i++) {
				System.out.print((i + 1) + " ");
				enemyHealer.attack(fighter);
			}
			
			
		} catch (HPException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("전투종료");
		}
	}
}



















