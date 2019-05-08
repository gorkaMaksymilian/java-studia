package source;

import java.util.HashSet;
import java.util.Set;

public class MainHash {
	public static void main(String[] args) {
		//Creatring Hash set
		Set<String> mySet = new HashSet<>();
		mySet.add("Mario");
		mySet.add("Artem");
		mySet.add("Genowefa");
		
		System.out.println("Our hashset");
		for (String s: mySet) {
			System.out.println(s);
		}
		
		//Try to add another Genowefa
		mySet.add("Genowefa");
		
		System.out.println("\n\nOur hashset (after update)");
		for (String s: mySet) {
			System.out.println(s);
		}
		
		//add for hash sets returns boolean
		if (mySet.add("Maria")) {
			System.out.println("List was updated (Maria added)");
		}
		
		//Genowefa is already in hash set so add returns false
		if (mySet.add("Genowefa")) {
			System.out.println("List was updated (Another Genowefa)");
		}
		
		
		
		
		
		
		
		
	}
}

