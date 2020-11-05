package it.usa.smarttech8;

public class methodTypes {
   
	 int number;
	int num;
	int sum;

	// Void means return nothing
	// void type non parameter method
	public static  void loginTest() {
	 int num1 = 35;
		System.out.println("I am void method " + num1);
	}

	//non-void type return method
	
	String loginTest1() {
	System.out.println("I am non-void method"); //for non-void method syso should be in the middle
	return null; }
	

	// Return type parameter method
	int loginPositiveTest(int a, int b) {
		return 123+a+b;
	}

   //return type non-parameter method 
	  String name(){
	return "Jhuma"; 
	  }	
	
   //void type parameter method
		public void getSalary3(String name) {
		int h = 300;
		System.out.println(h + name);
		}
	
	// instance variable
	public void getSalary() {
	number = 1223;
	num = 100;
	sum=number-num;
	System.out.println(sum);
	
	}

	//instance variable
	public void getSalary2() {
	number = 1500;
	 num = 5;
	sum = number/num;
	System.out.println(sum);
	}
   
	
	public static void main(String[] args) { // Main method

		methodTypes.loginTest();
		methodTypes obj = new methodTypes();
	    obj.getSalary();
	    obj.getSalary2();
	    obj.getSalary3(" jhuma");
	 System.out.println(obj.loginPositiveTest(19, 40));
     System.out.println(obj.loginTest1());
	 System.out.println(obj.name());
	
	
	
	}

 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
