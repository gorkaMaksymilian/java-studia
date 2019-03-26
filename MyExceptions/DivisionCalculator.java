package MyExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DivisionCalculator {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(new File("numbers.txt"))) {
			while(true) {
				try {
					System.out.println(Calc(sc));
				} catch (DivisionByZeroException fatalError) {
					System.out.println(fatalError.getMessage());
					continue;
				} catch (EndOfFileException eof) {
					System.out.println(eof.getMessage());
					break;
				}

			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found :c");
		}
	}
	
	public static double Calc(Scanner sc) throws DivisionByZeroException, EndOfFileException {
		if (!sc.hasNextLine()) {
			throw new EndOfFileException();
		}
		
		String data = sc.nextLine();
		StringTokenizer tokenizer = new StringTokenizer(data);
		
		int firstNumber = Integer.parseInt(tokenizer.nextToken());
		int secondNumber = Integer.parseInt(tokenizer.nextToken());
		
		if (secondNumber == 0) {
			throw new DivisionByZeroException();
		}
		
		return (double)firstNumber/secondNumber;
		
	}
	
	
	
	
	
}
