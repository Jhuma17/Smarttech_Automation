package com.abstraction2;

public class House2 implements  HouseRentIdea {

	public void getAddress() {
		
		System.out.println("House Address : '76-08 Greenpoint Ave,Brooklyn'");
	}

	public void getType() {
		
		System.out.println("Type : 'Apartment'");
	}

	public void getRent() {

		System.out.println("Rent : '$3500'");
	}

	public void getRoom() {
		
		System.out.println("Room : '3 Beds/Living & Dining room,2 Bath'");
	}

	public void getUtilities() {
		
		System.out.println("Utilities : 'Almost All Utilities' include'");
	}

	public void GetFloor() {
		
		System.out.println("Floor : '5Th Floor'");
	
	}

    public void getService() {
	
    	System.out.println("Service Fee : '$100/m'");
    
    }
	
    public void getQualifications() {

    	 System.out.println("Qualifications : 'Good Credit(credit check)+Sufficient Income(payroll check)'");
    
     }
     

     public static void main(String[] args) {
		
	    House2 idea = new House2();
        idea.getAddress();
        idea.getType();
        idea.getRent();
        idea.GetFloor();
        idea.getRoom();
        idea.getService();
        idea.getQualifications();
        idea.getUtilities();
     
     }

 }
