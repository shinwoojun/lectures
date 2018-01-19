package di;

public class Main {

	public static void main(String[] args) {
		
		Fly fly = new Fly();
		
		Unit unit = new Unit(fly);

		unit.setFly(fly);
	}

}
