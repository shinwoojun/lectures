package chapter07.fight;

public class Fighter extends Unit implements Movable, Attackable {
	public Fighter(int initHP) {
		this.setCurrentHP(initHP);
	}

	@Override
	public void attack(Unit u) {
		
		int currentHP = u.getCurrentHP();
		int attackedHP = 0;
		if (u instanceof Fighter) {
			attackedHP = currentHP - 10;
			
		} else if (u instanceof Healer) {
			attackedHP = currentHP - 73;
		}
		u.setCurrentHP(attackedHP);
	}

	@Override
	public void move(int x, int y) {
		
		
	}
	
}
