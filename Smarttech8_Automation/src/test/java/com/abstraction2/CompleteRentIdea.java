  package com.abstraction2;

  public class CompleteRentIdea implements HouseRentIdea,HouseIdea2 {

	public void openLaundry() {
		
		System.out.println("Laundry : In Apartment Basement");
	}

	public void openParkingLot() {
	
		System.out.println("Parking Lot : Near Apartment");
	}

	
    public void getAddress() {
		
    	System.out.println("Address is : 9209 Richmond Hill");
		
	}

	public void getType() {
		
		System.out.println("Type : Apartment");
	}

	public void getRent() {
		
		System.out.println("Rent : $2500");
	}

	public void getRoom() {
		
		System.out.println("Room : 2 bed room/living & dining room,1 bath");
	}

	public void getUtilities() {
	
		System.out.println("Utilities : Everything included except Electricity");
	}

	public void GetFloor() {
		
		System.out.println("Floor : 3rd floor");
	}

        public static void main(String[] args) {
			
        	CompleteRentIdea obj = new CompleteRentIdea();
             obj.getAddress();
             obj.GetFloor();
             obj.getRent();
             obj.getRoom();
             obj.getType();
             obj.getUtilities();
             obj.openLaundry();
             obj.openParkingLot();
             
         }

     }
