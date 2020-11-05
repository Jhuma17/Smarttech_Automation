  package com.abstraction;

  public class Employees2 implements CompanyIdea {

	
    public void getEmployee() {
	System.out.println("Employee Name Is : Mostofa");
		
	}

	public void getSalary() {
		System.out.println("Employee Salary Is : 106000");
		
	}

	public void getCar() {
		System.out.println("Employee Get : New Car");
		
	}

	public void getMedicare() {
		System.out.println("Employee Get Medicare : Full Coverage");
		
	
	}
	
	public static void main(String[] args) {
		
		Employees2 obj = new Employees2();
	
	      obj.getEmployee();
	      obj.getSalary();
	      obj.getCar();
	      obj.getMedicare();
	
	}

}
