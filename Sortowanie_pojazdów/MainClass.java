package Source;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		Pojazd[] pojazdy = new Pojazd[5];
		pojazdy[0] = new Samochod("Tesla Model S",2100);
		pojazdy[1] = new Samochod("Fiat 126p",645);
		pojazdy[2] = new Samochod("Audi A2  ",1200);
		pojazdy[3] = new Motocykl("Yamaha   ",300);
		pojazdy[4] = new Motocykl("Test     ",2101);
		
		int i = 1;
		System.out.println("Przed sortowaniem:");
		for (Pojazd p: pojazdy) {
			System.out.printf("Nr: %d\tModel: %s\tWaga: %d\n",i++,p.getMarka(),p.getMasaCalkowita());

		}
		
		Arrays.sort(pojazdy);
		
		
		i = 1;
		System.out.println("\n\nPo sortowaniu masa:");
		for (Pojazd p: pojazdy) {
			System.out.printf("Nr: %d\tModel: %s\tWaga: %d\n",i++,p.getMarka(),p.getMasaCalkowita());

		}
		
	}
}
