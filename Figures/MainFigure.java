package Figures;

import java.util.ArrayList;
import java.util.List;

public class MainFigure {
	public static void main(String[] args) {
		List<Figure> figures = new ArrayList<>();
		try {
			figures.add(new Circle(4));
			figures.add(new Rectangle(3,4));
			figures.add(new Square(3.5));
			figures.add(new Square(-3.3));
			
		} catch (NonPositiveValueException e) {
			System.out.println("Input error negative value");
		
		}
		
		for (Figure f: figures) {
			System.out.printf("Kind: %s\nArea: %f\nPerimeter: %f\n\n", f.getKind(),f.getArea(),f.getPerimeter());
			
		}
		
		double scale = 0.5;
		
		for (Figure f: figures) {
			f.rescale(scale);
			System.out.printf("Kind: %s\nArea: %f\nPerimeter: %f\n\n", f.getKind(),f.getArea(),f.getPerimeter());

		}
		
		
	}
}
