package source;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListNav {
	public static void main(String[] args) {
		//Create simple String list
		List<String> myList = new LinkedList<>();
		myList.add("Ada");
		myList.add("Adam");
		myList.add("Zofia");
		
		//Second List
		List<String> secondList = new LinkedList<>();
		secondList.add("Kamil");
		secondList.add("Konrad");
		secondList.add("Krystyna");
		secondList.add("Kamil");
		
		System.out.println("First list contains:");
		for (String s: myList) {
			System.out.println(s);
		}
		
		System.out.println("\n\nSecond list contains:");
		for (String s: secondList) {
			System.out.println(s);
		}
		
		
		//Create iterator for first list (add)
		ListIterator<String> myListIterator = myList.listIterator();
		
		//Iterator for second list (just print)
		Iterator<String> secondListIterator = secondList.listIterator();
		
		//Adding secondList data before last item in myList
		myListIterator.next();
		myListIterator.next();
		while (secondListIterator.hasNext()) {
			myListIterator.add(secondListIterator.next());
		}
		
		System.out.println("\n\nAfter iteration:");
		System.out.println("First list contains:");
		for (String s: myList) {
			System.out.println(s);
		}
		
		System.out.println("\n\nSecond list contains:");
		for (String s: secondList) {
			System.out.println(s);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
