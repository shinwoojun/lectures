package chapter11;

import java.util.ArrayList;
import java.util.List;

import chapter07.fight.Fighter;
import chapter07.fight.Healer;
import chapter07.fight.Unit;

public class ListTest {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(1);
		numbers.add(5);
		numbers.add(3);
		numbers.add(9);
		numbers.add(7);
		numbers.add(6);
		/*
		for (int i = 0; i < 50; i++) {
			System.out.println(numbers.get(i));
		}
		*/
		
		for (int number: numbers) {
			System.out.println(number);
		}
		
		/*
		List<Unit> myUnits = new ArrayList<Unit>();
		myUnits.add(new Fighter(100));
		myUnits.add(new Fighter(200));
		myUnits.add(new Healer(400));
				
		List<Unit> enemyUnits = new ArrayList<Unit>();
		enemyUnits.add(new Fighter(100));
		enemyUnits.add(new Fighter(200));
		enemyUnits.add(new Fighter(200));
		enemyUnits.add(new Fighter(300));
		
		for(int i = 0; i < myUnits.size(); i++) {
			Unit unit = myUnits.get(i);
			int targetIndex = (int)(Math.random() * 4);
			System.out.println("attack index: " + targetIndex);
			if (unit instanceof Fighter) {
				Fighter fighter = (Fighter) unit;
				fighter.attack(enemyUnits.get(targetIndex));
			} else if (unit instanceof Healer) {
				Healer healer = (Healer) unit;
				healer.attack(enemyUnits.get(targetIndex));
			}
			System.out.println(enemyUnits.get(targetIndex).getCurrentHP());
		}
		*/
		
		
		/*
		////////////////////////////
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		////////////////////////////
		List<String> list = new ArrayList<String>();
		
		list.add("10"); // 0
		list.add("20"); // 1
		list.add("30"); // 2
		list.add("40"); // 3
		list.add("50"); // 4
		
		int listSize = list.size();
		
		for (int i = 0; i < listSize; i++) {
			System.out.println(list.get(i));	
		}
*/
		
		
	}

}











