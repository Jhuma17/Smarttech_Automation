package arrays.java.automation;

  import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

    public class VectorListPractice {

	   public static void vectorListTest() {
	
	    List <Integer> num = new Vector <>();
	        num.add(170);
	        num.add(120);
	        num.add(150);
	        num.add(180);
	        num.add(130);
	        num.add(110);
	        num.add(110);
	        num.add(140);
	        num.add(160);
	       
	     System.out.println("Total value of num :" + num);
	    System.out.println("Specific value of num :" + num.get(6));
	    System.out.println("Total size of num :" + num.size()); 
	   
	       if(num.contains(130))
	    System.out.println("130 will exits");
	       else
	    System.out.println("130 will not exits");
	    
	    
	    
	    for(int i = 0; i < num.size(); i++)
	     System.out.println("Whole value of num :" + num.get(i));
	   	 
	     Collections.reverse(num);
	    for(int j = 0; j < num.size(); j++)
		  System.out.println("After reversing num :" + num.get(j));	   
	   
	    Collections.sort(num);
	    for(int k = 0; k < num.size(); k++)
		 System.out.println("After sorting num :" + num.get(k)); 
	 
	      num.add(0, 180);
	       System.out.println("After adding num:" + num);
	   
	      num.remove(7);
	       System.out.println("After removing num:" + num);
	  
	    num=num.stream().distinct().collect(Collectors.toList());
	       System.out.println("After removing duplicate num:" + num);
	  
	    int max = Collections.max(num); 
		   System.out.println("This is the maximum value:" + max);
	   
	    int min = Collections.min(num);
	        System.out.println("This is the minimum value:" + min);
	  
	    Collections.sort(num,Collections.reverseOrder());
	        System.out.println("Descending order of num:" + num);
	   
	 } 
	 
	       public static void loopIncreaseingTest() {
	   
	    	for(int i = 0; i < 40; i++)
	      System.out.println("Loop increase value:" + i);
	   
	   }   
	   
	       public static void loopDecreaseingTest() {
	       for(int i = 30; i > 0; i--)
	  	  System.out.println("Loop Decrease value:" + i);
	  
	       }    	   
	    	   public static void main(String[] args) {
		      vectorListTest();

		      loopIncreaseingTest();
	
		      loopDecreaseingTest();
	
	}
}
