package chapter07.drawShape;

public abstract class Shape {
	private String color = "black";
	
	abstract void draw();
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
}
