package chapter07;

import chapter07.drawShape.Point;
import chapter07.drawShape.Rectangle;
import chapter07.drawShape.Triangle;

public class DrawShape {
	public static void main(String[] args) {
		/*
		Point[] p = new Point[3];
		p[0] = new Point(0, 0);
		p[1] = new Point(0, 2);
		p[2] = new Point(2, 0);
		*/
		Point[] p = { new Point(0, 0)
				, new Point(0, 2)
				, new Point(2, 0)   
				};
		Triangle t = new Triangle(p);
		t.draw();
		t.setColor("red");
		t.draw();
		
		/*
		Point[] pr = new Point[4];
		pr[0] = new Point(0, 0);
		pr[1] = new Point(0, 2);
		pr[2] = new Point(2, 0);
		pr[3] = new Point(2, 2);
		
		Rectangle tr = new Rectangle(pr);
		tr.draw();
		*/
		
		/*
		Circle circle = new Circle();
		circle.draw();
		
		Point p = new Point(1, 3);
		Circle circle2 = new Circle(p, 50);
		circle2.draw();
		*/
		/*
		Shape shape = new Shape();
		
		shape.draw();
		
		shape.color = "blue";
		shape.draw();
		 */
	}
}
