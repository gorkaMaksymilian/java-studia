package Figures;

public class Rectangle extends Figure {
	private double width,height;
	
	public Rectangle (double width,double height) throws NonPositiveValueException{
		if (width <= 0 || height <= 0) {
			throw new NonPositiveValueException();
		}
		
		this.height = height;
		this.width = width;
		setKind("Rectangle");
	}
	
	
	@Override
	public double getArea() {
		return width*height;
	}

	@Override
	public double getPerimeter() {
		return 2*(width*height);
	}

	@Override
	public void rescale(double scale) {
		width *= scale;
		height *= scale;
		
	}

}
