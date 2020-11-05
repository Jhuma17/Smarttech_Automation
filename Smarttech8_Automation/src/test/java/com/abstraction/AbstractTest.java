package com.abstraction;

public class AbstractTest extends CompanyIdea3 {

	@Override
	void getSpeed() {
		
		System.out.println("I am a abstract method");
	}

	@Override
	void getEmployee() {
		System.out.println("Employee Name Is: Jhuma");
		
	}

	void getSalary() {
		System.out.println("Employee Salary Is : 105000");
		
	}

      public static void main(String[] args) {
		
    	  AbstractTest obj = new AbstractTest();
            obj.getSpeed();
            obj.getEmployee();
            obj.getSalary();
            obj.StudentName();
            obj.StudentId();
            obj.StudentAddress();
      
      }

}
