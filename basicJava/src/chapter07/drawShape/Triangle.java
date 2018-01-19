package chapter07.drawShape;

public class Triangle extends Shape {
	private Point[] p = new Point[3];
	
	public Triangle (Point[] p) {
		this.p = p;
	}
	/*
	Triangle() {
		p[0] = new Point(0, 0);
		p[1] = new Point(0, 0);
		p[2] = new Point(0, 0);
	}
	*/

	@Override
	public void draw() {
		System.out.printf("[p0=(%d, %d), p1=(%d, %d), p2=(%d, %d), color=%s%n"
				, p[0].x, p[0].y  
				, p[1].x, p[1].y  
				, p[2].x, p[2].y  
				, this.getColor());		
	}
	
	public void setP(Point[] p) {
		this.p = p;
	}
	
	public Point[] getP() {
		return this.p;
	}
	
}









