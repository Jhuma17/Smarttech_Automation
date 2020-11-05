package arrays.java.automation;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {

	public static void main(String[] args) {
		
		String [] nam = {"Ab","Bc","Cb","De"};
		
		for(Object i : nam) {
		System.out.println(i);
	}	
		
       ArrayList al = new ArrayList(Arrays.asList(nam));
	     
       System.out.println(al);
	        
	
	}

}
