package zajecia;

public class Ball extends Block {
	private double radius;
	
	public Ball(double radius) {
		super();
		this.radius = radius;
	}
	
	@Override
	public double getVolume() {

		return 4/3*Math.PI*Math.pow(radius, 3);
	}

	@Override
	public String getKind() {

		return "Ball";
	}

	@Override
	public double getSurface() {

		return 4*Math.PI*Math.pow(radius, 2);
	}

}
