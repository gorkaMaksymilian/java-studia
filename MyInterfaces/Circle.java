package zajecia;

public class Circle extends Figure implements Surface{
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
		kind = "Circle";
	}
	
	@Override
	public double getSurface() {

		return Math.PI*radius*radius;
	}
	
}
