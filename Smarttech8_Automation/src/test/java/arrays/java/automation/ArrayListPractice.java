package arrays.java.automation;

import java.util.ArrayList;
    	import java.util.Collections;
    	import java.util.LinkedList;
    	import java.util.List;
    	import java.util.stream.Collectors;

    	//ArrayList li = new ArrayList();  // store heterogeneous data
    	//	ArrayList<Integer> li = new LinkedList<Integer>();// store homogeneous data
    	// Call parent Interface and declare the ArrayList
    	
    	
    	public class ArrayListPractice {
    		  
    		     public static void arrayList1() {
    		   
    	         List<String> al = new ArrayList<>();
    		      al.add("Jhuma");
    		      al.add("Akter");
    		      al.add("QA");
    		      al.add("QA");
    		      al.add("QA");
    		      al.add("QA");
    		      al.add("Richmond Hill");
    		      al.add("Smarttech_student");
    		      al.add("Batch_8");
    		      al.add("null");
    		      al.add("null"); 
    		      System.out.println(al);
    		   System.out.println("Size of values:" + al.size());
    		   System.out.println("Specific value:" + al.get(4));
    		   
    		     al.add(3,"Tester");
    		     System.out.println("After adding :" + al);
    		   
    		    
    		   System.out.println("Index of Smarttech_student :" + al.indexOf("Smarttech_student"));  
    		     
    		     al.remove(5);
    		     al.remove("null");
    		     System.out.println("After removing:" + al); 
    		
    		     al.set(4, "105000");
    		     System.out.println("After setting new value:" + al);
    		     
    		     al.contains("Batch_8");
    		     System.out.println("After searching:" + al.contains("Batch_8"));
    		    
    		     Collections.reverse(al);
    		     System.out.println("After reversing:" + al); 
    		     
    		     Collections.sort(al);
    		     System.out.println("Ascending order of values:" + al);  
    		     
    		     al=al.stream().distinct().collect(Collectors.toList());
    		     System.out.println("After removing duplicate values:" + al);
    		     
    		     Collections.sort(al,Collections.reverseOrder());
    		     System.out.println("Descending order of values:" + al);
    		     
    		     for(int i = 0; i < al.size(); i++)
    	         System.out.println("Specific values :"+ al.get(i));
    		    
    		     if (al.contains("Akter"))
    		    System.out.println("Akter will be exits"); 
    		    else
    		    System.out.println("Akter will be not exits");
    		     
    		     	   
    		     } 
    		  		     
    		     public static void linkedListPractice() { 
    		     
    		        List<String> lt = new LinkedList<>();
    		         lt.add(0, "Python");
    		         lt.add(1, "Rubi");
    		         lt.add(2, "C#");
    		         lt.add(3, "C++");
    		         lt.add(4, "Java");
    		         
    		         System.out.println(lt);
    		     
    		}     
    		    
    		     public static void main(String[] args) {
    			  //arrayList1();
    			   linkedListPractice();
    		   }
    	}





