package chapter08.fight;

public class Healer extends Unit implements Movable, Attackable, Healable{
	public Healer(int initHP) throws HPException {
		this.setCurrentHP(initHP);
	}

	@Override
	public void heal(Unit u) throws HPException {
		int currentHP = u.getCurrentHP();
		int attackedHP = currentHP + 50;
		u.setCurrentHP(attackedHP);
		
	}

	@Override
	public void attack(Unit u) throws HPException{
		int currentHP = u.getCurrentHP();
		int attackedHP = currentHP - 7;
		
		u.setCurrentHP(attackedHP);
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}
}
