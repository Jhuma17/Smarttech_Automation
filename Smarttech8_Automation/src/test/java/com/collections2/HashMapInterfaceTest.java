package com.collections2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapInterfaceTest {

	public static void main(String[] args) {
	
	  //HashMap <Integer,String> m = new HashMap<>();//this is handle homogeneous data
       HashMap  m = new HashMap  (); // this is handle heterogeneous data
	
	   m.put(null,"Nafisa");
	   m.put(102,"Sadia");
	   m.put(103,"Jhuma");
	   m.put(104,"Rayyan");
	   m.put(105,"Shupti");// doesn't allow duplicate key
	   m.put(105,"Mim"); 
	   m.put(109,"Jhuma"); //  allow duplicate value
	   m.put(null,null);
	   m.put(107,null);
	  System.out.println(m);
	  
	   //get specific object
	  System.out.println( m.get(105));// return mim
	  
	   //get individual key,value
	    for(Object i : m.keySet()) {
	    System.out.println(i + " " +m.get(i));
	}
	  //remove objects
	  // m.remove(109);
	  m.remove(107, null);
	  System.out.println(m);
	 
	  //containskey
	  System.out.println(m.containsKey(102));// returns true
	  System.out.println(m.containsKey(107));//returns false
	
	  //get keyset
	  System.out.println(m.keySet());//returns [101, 102, 103, 104, 105, 106]
	  
	  // get individual key set
	  for(Object j : m.keySet()) {
	   System.out.println(j);
	 }  
	  
	  //get values
	  System.out.println(m.values());// returns [Nafisa, Sadia, Jhuma, Rayyan, Mim, null]
	
	  //get individual value set
	   for(Object j : m.values()) {
	   System.out.println(j);
	   
	 } 
	   
   }
}
