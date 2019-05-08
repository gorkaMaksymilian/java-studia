package source;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MainList {
	public static void main(String[] args) {
		//Create simple String list
		List<String> myList = new LinkedList<>();
		myList.add("Ada");
		myList.add("Adam");
		myList.add("Zofia");
		
		System.out.println("Our list contains:");
		for (String s: myList) {
			System.out.println(s);
		}
		
		//Create iterator
		Iterator<String> myIterator =  myList.listIterator();
		
		System.out.println("\n\nOur list printed with iterator:");
		while (myIterator.hasNext()) {
			System.out.println(myIterator.next());
		}
		
		//Another iterator (adding Mario in between Ada and Adam)
		ListIterator<String> secondIterator = myList.listIterator();
		while (secondIterator.hasNext()) {
			secondIterator.next();
			secondIterator.add("Mario");
		}
		
		
		System.out.println("\n\nList contains: (with Mario)");
		for (String s: myList) {
			System.out.println(s);
		}
		
		//Removing Mario
		ListIterator<String> thirdIterator = myList.listIterator();
		while (thirdIterator.hasNext()) {
			if (thirdIterator.next() == "Mario") {
				thirdIterator.remove();
			}
		}
		
//		We can also remove Mario by using
//		thirdIterator.next();
//		thirdIterator.next();
//		thirdIterator.remove();
//		If we know exactly index
		
		System.out.println("\n\nList contains: (Mario removed)");
		for (String s: myList) {
			System.out.println(s);
		}
		
		
	}
}
