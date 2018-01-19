package chapter08.fight;

public class Unit {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private int currentHP;
	private int x;
	private int y;
	
	public int getCurrentHP() {
		return currentHP;
	}
	public void setCurrentHP(int currentHP) throws HPException{
		if (currentHP < 1) {
			throw new HPException("\n대상이 죽었습니다.");
		}
		this.currentHP = currentHP;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
