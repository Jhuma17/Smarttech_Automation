 package arrays.java.automation;

 import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

     public class LinkedListDemo1 {

	public static void linkedListprac() {
		// Declare LinkedList and import from java.util.LinkedList
		
		//LinkedList li = new LinkedList();  // store heterogeneous data
	//	LinkedList<Integer> li = new LinkedList<Integer>();  // store homogeneous data
		// Call parent Interface and declare the LinkedList
		
		List <String>li = new LinkedList<>();
		
		// Add elements
		li.add("British Bangla Institute Of Management & Technology") ;
		li.add("23 rambabu Road");
		li.add("Mymensingh");
		li.add("BBA");
		li.add("Computer Science");
		li.add("Library Science");
		li.add("BBIT Proposed");
		li.add("BB-MATS");
		System.out.println(li);
		// size of the LinkedList
		System.out.println("Size of the linkedList: "+li.size());
		
		// add new value
		li.add("British Bangla Cadet Academy");
		System.out.println("After Adding new value : "+ li);
		
		// Removing value by giving index number or value
		li.remove(8);
		System.out.println("After Removing new value : "+ li);
		
		// Replace the Value
		
		li.set(4, "CSE");
		System.out.println("Changing exeisting value: "+ li);
		
		// searching elements with contains out put will be true / false
	
		System.out.println("After Searching : "+ li.contains("BB-MATS"));
		
		// Reading all elements from LinkedList by using ForLoop
		
		for (int i=0; i< li.size();i++) 
			System.out.println(li.get(i));
		
		
	}
	
	public static void linkedListprac1() {
		
		LinkedList <String>li = new LinkedList<>();
		
		// Add elements
		li.add("British Bangla Institute Of Management & Technology") ;
		li.add("23 rambabu Road");
		li.add("Mymensingh");
		li.add("BBA");
		li.add("Computer Science");
		li.add("Library Science");
		li.add("BBIT Proposed");
		li.add("BB-MATS");
		System.out.println(li);
		
		// remove data
		li.remove(7);
		System.out.println("After Removing data: "+ li);
		
		// Sorting and shuffling 
		
		Collections.sort(li);
		System.out.println("After Sorting"+ li);
		// Reverse Order 
		Collections.sort(li, Collections.reverseOrder());
		System.out.println("After Reverse Order: "+ li);
		
		//shuffling 
		Collections.shuffle(li);
		System.out.println("After Shuffling :" + li);
		
	}
	
	public static void linkedListprac2() {
		LinkedList<String> li = new LinkedList<>();
		
		// Add elements
				li.add("British Bangla Institute Of Management & Technology") ;
				li.add("23 rambabu Road");
				li.add("Mymensingh");
				li.add("BBA");
				li.add("Computer Science");
				li.add("Library Science");
				li.add("BBIT Proposed");
				li.add("BB-MATS");
				System.out.println(li);
				// size of the LinkedList
				System.out.println("Size of the linkedList: "+li.size());
				
				// Special Method in LinkedList
				// Adding First
				li.addFirst("My Institute");
				System.out.println("Adding First : "+ li);
				// adding Last
				li.addLast("ESC Foundation");
				System.out.println("Adding to the Last : "+ li);
				 // to get First and last Elements
				System.out.println("First Element : "+ li.getFirst());
				System.out.println("Last Element : "+ li.getLast());
				
				// Remove First and Last Elements
				li.removeFirst();
				li.removeLast();
				System.out.println("After removing First and Last elements : "+ li);
			
	}
	
	public static void main(String[] args) {
		
		// linkedListprac();
		//linkedListprac1();
		linkedListprac2();
		
	}
}








