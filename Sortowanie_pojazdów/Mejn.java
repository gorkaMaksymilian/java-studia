package source;

import java.util.Arrays;
import java.util.Comparator;

public class Mejn {

	public static void main(String[] args) {
		Pojazd[] tab = new Pojazd[5];
		tab[0] = new Samochod("Tesla Model S",2100);
		tab[1] = new Samochod("Fiat 126p",645);
		tab[2] = new Samochod("Audi A2  ",1200);
		tab[3] = new Motocykl("Yamaha   ",300);
		tab[4] = new Motocykl("Test     ",2101);
		
		
		System.out.println("\n\nPrzed posortowaniem");
		for (Pojazd p: tab) {
			System.out.println("Model: "+p.getMarka()+"\tMasa: "+p.getMasa());
		}
		
		
		
		Arrays.sort(tab);
		System.out.println("\n\nPo posortowaniu(rosnaco)");
		for (Pojazd p: tab) {
			System.out.println("Model: "+p.getMarka()+"\tMasa: "+p.getMasa());
		}
		
		
		Arrays.sort(tab,new Comparator<Pojazd>() {

			@Override
			public int compare(Pojazd o1, Pojazd o2) {
				return Integer.valueOf(o2.getMasa()).compareTo(Integer.valueOf(o1.getMasa()));
			}
			
		});
		
		System.out.println("\n\nPo posortowaniu(malejaco)");
		for (Pojazd p: tab) {
			System.out.println("Model: "+p.getMarka()+"\tMasa: "+p.getMasa());
		}
		
		
		
		Arrays.sort(tab,new Comparator<Pojazd>() {

			@Override
			public int compare(Pojazd o1, Pojazd o2) {
				return o1.getMarka().compareTo(o2.getMarka());
			}
			
		});
		
		System.out.println("\n\nPo posortowaniu(alfabetycznie A-Z)");
		for (Pojazd p: tab) {
			System.out.println("Model: "+p.getMarka()+"\tMasa: "+p.getMasa());
		}
		
		
		Arrays.sort(tab,new Comparator<Pojazd>() {

			@Override
			public int compare(Pojazd o1, Pojazd o2) {
				return o2.getMarka().compareTo(o1.getMarka());
			}
			
		});
		
		System.out.println("\n\nPo posortowaniu(alfabetycznie Z-A)");
		for (Pojazd p: tab) {
			System.out.println("Model: "+p.getMarka()+"\tMasa: "+p.getMasa());
		}
		
		
	}

}
