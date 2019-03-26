package Figures;

public class NonPositiveValueException extends Exception {
	public NonPositiveValueException() {
		super("Wrong input [<=0]");
	}
}
