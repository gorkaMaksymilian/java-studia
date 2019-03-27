package zajecia;

public class Cube extends Block {
	protected double side;
	
	public Cube(double side) {
		super();
		this.side = side;
	}
	
	@Override
	public double getVolume() {

		return Math.pow(side, 3);
	}

	@Override
	public String getKind() {

		return "Cube";
	}

	@Override
	public double getSurface() {
		return 6*side*side;
	}

}
