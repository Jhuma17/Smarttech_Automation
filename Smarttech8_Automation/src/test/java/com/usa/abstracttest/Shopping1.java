package com.usa.abstracttest;

public class Shopping1 implements OnlineShopping {

	@Override
	public void getcCloths() {
		
	 System.out.println("Clothes from Macys:\n'Ladies dress,Ladies pants,Ladies tops'");	
	
	}

	@Override
	public void getCosmetics() {
		
	 System.out.println("Cosmetics from Sephora:\n'Foundations,Concealer,press powder,\nlipstics,eyeshadow palette'");
	 
	
	}

       public static void main(String[] args) {
		
	       Shopping1 s = new Shopping1();
	         
	       s.getBags();
	       s.getJewellery();
	       s.getShoes();
	       s.getCosmetics();
	       s.getcCloths();
       
       }

 }
