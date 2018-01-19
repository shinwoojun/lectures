package chapter07.drawShape;

public class Circle extends Shape {
	private Point center;
	private int r;
	
	Circle () {
		this( new Point(0, 0), 100 );
		
	}
	
	Circle (Point center, int r) {
		this.center = center;
		this.r = r;
	}
	
	
	@Override
	public void draw() {
		System.out.printf("[center=(%d, %d), r=%d, color=%s%n"
				, center.x
				, center.y
				, this.r
				, this.getColor());
		
	}
	
	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}


	
}
