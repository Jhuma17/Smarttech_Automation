package com.collections2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

 public class MapInterface {

	   
	   public static void main(String[] args) {
	 //Map <String,Integer> name = new HashMap<>();
       Map <Integer,String> name = new HashMap<>();
	     name.put(1, "Alam");
	     name.put(2, "Alam");
	     name.put(3, "Alam");
	     name.put(4, null) ;// Map allow multiple duplicate value
	     name.put(5, null);
	     name.put(null, null); // does not allow duplicate key
	     name.put(null, null);
	     name.put(null, "Alam");// doesn't allow more than one null key  
	
	   for(Entry i : name.entrySet()) {
	   System.out.println(i.getKey() +" " + i.getValue()); } 




       /* this method for heterogenous data
            for(Object k : m.keySet()) {
       System.out.println(k + "  " + m.get(k));

 } */         
} } 