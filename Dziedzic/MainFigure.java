package Dziedzic;

public class MainFigure {
	public static void main(String[] args) {
		Rectangle[] rectangles = new Rectangle[4];
		rectangles[0] = new Rectangle(3,4);
		rectangles[1] = new Rectangle(2.5,4.5);
		rectangles[2] = new Square(30);
		rectangles[3] = new Square(4);
		
		
		for (Rectangle r: rectangles) {
			System.out.printf("Area: %f\nPerimeter: %f\n\n",r.getArea(),r.getPerimeter());
		}
	}
	
	
}
