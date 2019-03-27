package zajecia;

public class Rectangle extends Figure implements Surface{
	private double width,height;

	public Rectangle(double width, double height) {
		this.height = height;
		this.width = width;
		kind = "Rectangle";
	}
	
	@Override
	public double getSurface() {
		
		return height*width;
	}

}
