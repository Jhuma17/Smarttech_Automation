 package com.usa.smarttech;

public class staticMethod {

    static String fname;
	static String lname; 
	static String joindate;
	static String salary;
	static String highestsalary; 
	
	public static void getname() {
	 fname = " Mostofa"	;
	 lname = " Kamal";
	joindate= " 06/28/2018";
	 salary = "$10000";
	System.out.println("My employee name is:" +fname+lname + ", he started working on :" + joindate +", his income is:" +  salary);

	}
	
	public static void getsalary() {
		 fname = " Rayyan  "	;
		 lname = "Kamal";
		joindate= " 04/12/2019";
		 salary = "$8000";
		System.out.println("My employee name is:" +fname+lname + ", he started working on :" + joindate +", his income is:" +  salary);

		}
	

	public static void gethistory() {
		 fname = " Rabeya "	;
		 lname = "Nafisal";
		joindate= " 08/05/2019";
		 salary = "$9000";
		System.out.println("My employee name is:" +fname+lname + ", he started working on :" + joindate +", his income is:" +  salary);

		}
	
	public static void getreport() {
		 fname = " Faria";
		 lname = "Akter";
		joindate= " 01/15/2020";
		 salary = "$7000";
		System.out.println("My employee name is:" +fname+lname + ", he started working on :" + joindate +", his income is:" +  salary);

		}
	

	public static void getreport1() {
		 fname = " Jafrin "	;
		 lname = " mim";
		joindate= " 11/109/2017";
		 salary = "$11000";
		System.out.println("My employee name is:" +fname+lname + ", he started working on :" + joindate +", his income is:" +  salary);

		}
	
	public static void main(String[] args) {
          staticMethod.getname();
	      staticMethod.getsalary();
	      staticMethod.gethistory();
	      staticMethod.getreport();
	      staticMethod.getreport1();
	
	}

}
