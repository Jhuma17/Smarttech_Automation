 package com.abstraction2;

 public class House1 implements HouseRentIdea {


	public void getAddress() {
		
		System.out.println("House Address : '34-90 Jamaica Ave,Queens'");
		
	}

	public void getType() {
		
		System.out.println("Type : 'Single Family House'");
	}

	public void getRent() {
		
		System.out.println("Rent : '$2000'");
	}

	public void getRoom() {
	
		System.out.println("Room : '2 Beds/Living & Dining room,1 Bath'");
	}

	public void getUtilities() {
		
		System.out.println("Utilities : 'Heat,Gas and Water included;except Electric' ");
	}
	
	public void GetFloor() {
		
		System.out.println("Floor : '2nd Floor'");
		
	}
	public static void main(String[] args) {
		
		House1 idea = new House1(); 
	
	     idea.getAddress();
	     
	     idea.getType();
	
	     idea.getRent();
	
	     idea.getRoom();
	
	     idea.getUtilities();
	
	     idea.GetFloor();
	
	}
 }
