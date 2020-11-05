  package com.abstraction2;

  public class CompleteResult extends ShoppingIdea {

	@Override
	     void getAddress() {
		System.out.println("House Address :\n"+"34-90 Jamaica Ave,Queens");
		
	}

	@Override
	    void getRoom() {
		
		System.out.println("Total Room :\n"+"2 Beds,Living & Dining room,1 Bath");
	}

  
         public static void main(String[] args) {
			
         CompleteResult idea = new CompleteResult();
	
            idea.getAddress();
            
            idea.getRoom();
            
            idea.getFurniture();
            
            idea.getCloths();
            
            idea.getDishware();
         
       }
  
  }
