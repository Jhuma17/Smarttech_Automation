 package com.abstraction;

 public class Employees1 implements CompanyIdea{


    public void getEmployee() {
 
		System.out.println("Employee Name Is: Jhuma"  );
		
	}

	public void getSalary() {
		
		System.out.println("Employee Salary Is : 105000");
	}

	public void getCar() {
		
		System.out.println("Employee Get : New Car");
	}

	public void getMedicare() {
		
		System.out.println("Employee Get Medicare : Full Coverage");
	}


	public static void main(String[] args) {
		
		 Employees1 obj= new  Employees1();
		 obj.getEmployee();
         obj.getSalary();
         obj.getCar();
         obj.getMedicare();

}
}