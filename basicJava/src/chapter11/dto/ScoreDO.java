package chapter11.dto;

public class ScoreDO {
	private String name;
	private String korean;
	private String english;
	private String math;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKorean() {
		return korean;
	}
	public void setKorean(String korean) {
		this.korean = korean;
	}
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	public String getMath() {
		return math;
	}
	public void setMath(String math) {
		this.math = math;
	}
	
	@Override
	public String toString() {
		
		String str = this.getName() + "    " 
				+ this.getKorean() + "    "
				+ this.getEnglish() + "    "
				+ this.getMath();
		
		StringBuffer sb = new StringBuffer();
		
		sb = sb.append(this.getName());
		sb = sb.append("     ");
		sb = sb.append(this.getKorean());
		sb = sb.append("     ");
		sb = sb.append(this.getEnglish());
		sb = sb.append("     ");
		sb = sb.append(this.getMath());
		
		return sb.toString();
	}
}
















