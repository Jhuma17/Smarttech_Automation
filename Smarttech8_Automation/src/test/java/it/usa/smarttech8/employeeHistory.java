 package it.usa.smarttech8;

 public class employeeHistory {
	
	// Company requirement = who has a automation experience more then 6 year
	// his base salary $1120000, Cola 4000, lease break 3500,
	// buns $ 6000, increase salary after one year 4% 
	
  public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fName = "Jhuma";
		String LName = " Akter";
		String fullName = fName + LName;
		System.out.println("This is our new employee:" + fullName);

		int salary = 112000;
		int cola = 4000;
		int leas = 3500;
		int bonus = 6000;

		int yearllySalary = salary + cola + leas +bonus;
		System.out.println("My total salary per enum : "+ yearllySalary);
		  
		   int avgsalary = yearllySalary/12;
		     System.out.println("MY monthly salary:"+avgsalary);
		   
		   int monthly_salary = 125500/12;
		     System.out.println("per month:"+monthly_salary);  
		 
	 int weeklySalary=10458/4;
	System.out.println("My weekly salary is:"+ weeklySalary);
	
	String name1 =  "Rabeya";
	String name2 =  "Nafisa";
	String name3 =  name1 + name2;
	System.out.println("My name is :" +  name3);
	
	float salary1 = 115000.99f;
	float cola1 = 5000.99f;
	float lease1 = 4500.99f;
	float bonus1 = 5500.99f;
	float sumSalary = salary1 + cola1 + lease1 + bonus1;
	System.out.println("My yearly salary is:" + sumSalary);
	
	
	
	
	
	
	
	
	
	
	}

}
