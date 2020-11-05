  package com.encapsulation;

 public class EncapsulationTest{


    private String name=" khadija akter";
    private int age= 35;
    private int id= 563481986;
    private int salary= 105000;
	  
	  
	  public String getName() {
		return name;
	  
	}
	   public int getAge() {
		return age;
	}
	    
     public int getId() {
		return id;
	}
	 
     public int getSalary() {
		return salary;
	
	}
	
		public static void main(String[] args) {
			
			EncapsulationTest A = new EncapsulationTest();
			 
			System.out.println("NAME :" + A.getName());
		     
	        System.out.println("AGE :" +  A.getAge());
		
	        System.out.println("ID :" +  A.getId());
		   
	        System.out.println("SALARY :" +  A.getSalary());


		}


   }
