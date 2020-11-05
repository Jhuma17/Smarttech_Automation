package com.collections2;

import java.util.HashSet;
import java.util.Iterator;


public class HashSetDemo1 {

     public static void main(String[] args) {
		
      //HashSet hs = new HashSet();// default capacity 16, Load factor 0.75
      // HashSet hs = new HashSet(100); // initial capacity 100
      //HashSet hs = new HashSet(100,(float)0.90);// i can declare this way
     // HashSet<Integer> hs = new HashSet <Integer>(); 
    	 
    	 HashSet hs = new HashSet();
    	 
      // add objects/elements
    	 hs.add(100);
    	 hs.add("Welcome");
    	 hs.add(16.4);    
    	 hs.add('A');
    	 hs.add(true);
    	 hs.add(null);
     System.out.println(hs);//[null, A, 100, 16.4, Welcome, true]insertion order not preserved,randomly added
     
     //remove objects
      hs.remove(16.4);
      System.out.println(hs);
      
    //contains()
     System.out.println(hs.contains("Welcome"));//true
     System.out.println(hs.contains("xyz"));// false
     
     //isEmpty()
     System.out.println(hs.isEmpty());//false
     
     //reading objects/elements from Hashset using advance Loop
        /* for (Object i :hs) {
        System.out.println(i);
     } */   
    
     // reading objects/elements from Hashset using Iterator method
        Iterator it = hs.iterator();
        while(it.hasNext()) {
     System.out.println(it.next());
     
     }}
   }


