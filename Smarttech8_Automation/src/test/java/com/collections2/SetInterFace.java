 package com.collections2;

import java.util.HashSet;
import java.util.Set;

public class SetInterFace {

	    public static void duplicateValue() {
	
	        String []  duplicate = {"Selenium","Java","TestNG","Maven","Cucumber","Java","Jenkins"};
	         Set <String> names = new HashSet<>();
		
		      for(String value : duplicate) {
		     if(names.add(value) == false) {
		   System.out.println("Duplicate value is :" + value);}}
	
}
	  
    	   public static void main(String[] args) {
	    	duplicateValue();
 
  }
}
