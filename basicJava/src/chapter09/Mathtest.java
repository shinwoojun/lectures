package chapter09;

import java.util.Scanner;

public class Mathtest {

	public static void main(String[] args) {
		System.out.print("몇 게임을 할 래: ");
		Scanner scanner = new Scanner(System.in);
		
		int throwNum = scanner.nextInt();
		int winCount = 0;
		int loseCount = 0;
		int drawCount = 0;
		for (int i = 0; i < throwNum; i++) {
			double player = (int)(Math.random() * 6) + 1;
			double com = (int)(Math.random() * 6) + 1;
			
			if (player > com) {
				winCount++;
				System.out.print("player win\t");
			} else if (player < com) {
				loseCount++;
				System.out.print("com    win\t");
			} else if (player == com) {
				drawCount++;
				System.out.print("draw      \t");
			}
			System.out.println((i+1)+"전 "+winCount+"승 "+loseCount+"패 "+drawCount+"무");
		}
		
		
		/*
		System.out.println(Math.ceil(1.345)); // 2.0
		System.out.println(Math.floor(1.345)); // 1.0
		System.out.println(Math.round(1.345)); // 1
		
		System.out.println(Math.abs(-1.345)); // 1.345 
		
		for (int i = 0; i < 14; i++) {
			double random = Math.random();
			System.out.println(random + "   " + (int)(random * 6));
		}
		 */
		
		
		
	}

}
