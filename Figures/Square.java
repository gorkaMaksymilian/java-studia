package Figures;

public class Square extends Rectangle {
	
	public Square(double side) throws NonPositiveValueException {
		super(side, side);
		setKind("Square");
	}

}
