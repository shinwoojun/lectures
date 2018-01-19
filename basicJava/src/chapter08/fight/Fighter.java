package chapter08.fight;

public class Fighter extends Unit implements Movable, Attackable {
	public Fighter(int initHP, String name) throws HPException {
		if (initHP == 0) {
			throw new HPException("전사가 죽었습니다.");
		}
		this.setCurrentHP(initHP);
		this.setName(name) ;
	}

	@Override
	public void attack(Unit u) throws HPException {
		
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
