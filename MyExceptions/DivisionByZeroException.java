package MyExceptions;

public class DivisionByZeroException extends Exception {
	public DivisionByZeroException() {
		super("You can not divide by zero!!!");
	}
}
