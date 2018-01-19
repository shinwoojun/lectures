package chapter07.drawShape;

public class Rectangle extends Shape {
	private Point[] p = new Point[4];
	
	public Rectangle(Point[] p) {
		if (p.length == 4) {
			this.p = p;
		} else {
			this.p[0] = new Point(0, 0);
			this.p[1] = new Point(0, 1);
			this.p[2] = new Point(1, 0);
			this.p[3] = new Point(1, 1);
		}
	}
	
	@Override
	public void draw() {
		System.out.printf("[p0=(%d, %d), p1=(%d, %d), p2=(%d, %d), p3=(%d, %d), color=%s%n"
				, p[0].x, p[0].y  
				, p[1].x, p[1].y  
				, p[2].x, p[2].y  
				, p[3].x, p[3].y  
				, this.getColor());
	}
	
	public Point[] getP() {
		return p;
	}

	public void setP(Point[] p) {
		this.p = p;
	}
}
