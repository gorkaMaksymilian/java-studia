package source;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class OtherListNav {
	public static void main(String[] args) {
		//Create simple String list
			List<String> myList = new LinkedList<>();
			myList.add("Ada");
			myList.add("Adam");
			myList.add("Zofia");
			myList.add("Zenon");
			myList.add("Arnold");
			
			//Second List
			List<String> secondList = new LinkedList<>();
			secondList.add("Kamil");
			secondList.add("Konrad");
			secondList.add("Krystyna");
			
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
			
			//Adding items from secondList in between myList items
			while(secondListIterator.hasNext()) {
				myListIterator.next();
				myListIterator.add(secondListIterator.next());
				
			}
			
			//Removing items from myList list without items from secondList in between
			while (myListIterator.hasNext()) {
				myListIterator.next();
				myListIterator.remove();
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
