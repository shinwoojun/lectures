package chapter11;

import java.util.ArrayList;
import java.util.List;

import chapter11.dto.ScoreDO;

public class DOTest {
	public static void main(String[] args) {
		List<ScoreDO> lists = new ArrayList<ScoreDO>();
		
		ScoreDO rowScore1 = new ScoreDO();
		rowScore1.setName("가인우");
		rowScore1.setKorean("98");
		rowScore1.setEnglish("78");
		rowScore1.setMath("65");
		
		lists.add(rowScore1);
		
		ScoreDO rowScore2 = new ScoreDO();
		rowScore2.setName("나상숙");
		rowScore2.setKorean("68");
		rowScore2.setEnglish("78");
		rowScore2.setMath("16");
		
		lists.add(rowScore2);
		
		ScoreDO rowScore3 = new ScoreDO();
		rowScore3.setName("다리미");
		rowScore3.setKorean("98");
		rowScore3.setEnglish("87");
		rowScore3.setMath("65");
		
		lists.add(rowScore3);
		
		for ( ScoreDO row : lists) {
			System.out.println(row.toString());
		}
		
		
		
		
		
		
		
	}
}
