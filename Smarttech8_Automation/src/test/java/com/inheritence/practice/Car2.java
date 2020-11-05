package com.inheritence.practice;

public class Car2 extends Car1{


	 protected void brand() {
        
    System.out.println("Car Brand : 'BMW'");
 
      }

     protected void body() {

    System.out.println("Body Type : 'Wagon'");

     }


     protected void model() {

     System.out.println("Model : 'BMW X7'");
     
     }

     protected void color() {

    System.out.println("Color : 'Black'");

     
     }


      public static void main(String[] args) {
		
    	  Vehicle v = new Vehicle();
    	    v.brand();
    	    v.model();
    	    v.body();
    	    v.color();
	
        Car1 c = new Car1();
            c.brand();
            c.model();
            c.brand();
            c.color();
            
        Car2 c2 = new Car2();
           c2.brand();
           c2.model();
           c2.body();
           c2.color();
        
      
      
      
      
      }
}
