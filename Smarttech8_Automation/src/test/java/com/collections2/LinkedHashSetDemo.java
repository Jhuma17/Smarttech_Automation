package com.collections2;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
     // LinkedHashSet <Integer> lset = new LinkedHashSet<>();
      LinkedHashSet lset = new LinkedHashSet();
	       
           lset.add(100);
           lset.add("Jhuma");
           lset.add("Akter");
           lset.add(400);
           lset.add(500);
           lset.add(null);
           lset.add(500);
           System.out.println(lset);//[100, Jhuma, Akter, 400, 500, null]
	
	     
	
	
	}

}
