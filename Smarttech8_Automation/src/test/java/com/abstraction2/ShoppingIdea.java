  package com.abstraction2;

  public abstract class ShoppingIdea {


	     public void getFurniture() {

	         System.out.println("Buying Furniture :\n"+"King size bed,Mattress,Dresser,Dining table,Chair,Sofa");
	     }


	       public void getCloths(){

	        System.out.println("Buying cloths :\n"+"Womens clothing, Mens clothing, Childrens clothing");
	       
	     }


	       public void getDishware() {

	      	 System.out.println("Buying Dishware :\n"+"Plates,Bowls,Serving platters,Glasses,Coffee mugs");
	       
	       }

	      
	       abstract void getAddress();
	      
	       abstract void getRoom();
 
 }
