package com.usa.abstracttest;

public interface OnlineShopping {

     void getcCloths();

     void getCosmetics();

     
 
      default void getBags() {
    	 
     System.out.println("Bags from Micheal Cors:\n'Ladies bag,Ladies purse'");
    }  
     
  
     default void getJewellery() {
     
     System.out.println("Jewellery from Swarovski:\n'Diamond ring,nose pin,ear ring,pendants'"); 
    }


     default void getShoes() {

     System.out.println("Shoes from Nike:\n'Women's sneakers,Men's sneakers,Boys sneakers'");
     }
}