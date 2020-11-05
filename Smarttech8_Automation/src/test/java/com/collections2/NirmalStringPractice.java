package com.collections2;

public class NirmalStringPractice {

public static void string1() {
		
		// how to declare string
		String name = "Nirmal Dey";
				name = "Soma";
		String name1 = new String("Nirmal Dey"); // both way we can declare 
		
		// get the output
		System.out.println("name : " + name);
		System.out.println("name1: "+ name1);
		// String is nothing but character type Array
		
		//char [] ch = {'N','i','r','m','a','l'};
		//System.out.println(ch); /// Nirmal
		
		// length of string
		int ln = name1.length(); // 15
		
		System.out.println(ln);
		// == , .equal method
		/*if(name.equals(name1)) {   // When we use == thats doesn't compare value ; compare obj
			System.out.println("True"); // name == name1 output - False
		} 								// (name.equals(name1)) output -True
		else {
			System.out.println("False");
		}*/
		 // equalsIgnoreCase method
		
		/*if(name.equalsIgnoreCase(name1)) {
			System.out.println("True");
		}
		else {
			System.out.println("Flase"); // if variable change lower or upper case
		}*/
		 //contains 
		
		boolean bl = name.contains("Enamul");
		System.out.println("Contains : "+ bl);
	
	}
	
	public static void string2() {
		
		String firstName = "Nirmal";
		String lastName = " Dey";
		 // Concat method
		String fullName = firstName.concat(lastName);
		System.out.println("Full Name : " + fullName); //Full Name : Nirmal Dey
		
		// Change to upper case 
		
		String up = fullName.toUpperCase();
		System.out.println("Upper Case : "+ up);//Upper Case : NIRMAL DEY

		String up1 = fullName.toLowerCase();
		System.out.println("Lower Case : "+ up1); // Lower Case : nirmal dey
	
		// Start With ad End with
		
		boolean bl = firstName.startsWith("N");
		System.out.println("Start With : " +bl ); //Start With : true

		boolean b2 = lastName.endsWith("E");
		System.out.println("End With : " +b2 ); //End With : false
		
		// String Array
		
		String [] name = {"Arayn","Asmita","Soma"};
		for(String x: name) {
			System.out.println( x);
		}
		
	}
	
	public static void string3() {
		String s1 = "I Love Bangladesh";
		//String s2 = s1.replace('a', 'o');
	//	System.out.println(s2);
		
		String [] s3 = s1.split("\\s");
		for (String x :s3) {
			System.out.println(x);
		}
	
	}
	
	   public static void stringBuffer() {
		StringBuffer sb = new StringBuffer("Nirmal");
		sb.append(" Dey ");
		sb.append(35);
		//System.out.println(sb);
		 // reverse
		 // sb.reverse();
	    //System.out.println(sb);
		//delete
		  sb.delete(0, 3);
		//System.out.println(sb);
		// length
		sb.setLength(6);
		//System.out.println(sb);
		
	}
	
	public static void stringBulider() {
		StringBuilder sbr = new StringBuilder("Nirmal ");
		System.out.println(sbr);
		sbr.append('k');
		sbr.append(" Dey");
		
		System.out.println(sbr);
		
		 // reverse
		sbr.reverse();
		System.out.println(sbr);
		//delete
		sbr.delete(0, 3);
		System.out.println(sbr);
		// length
		sbr.setLength(3);
		System.out.println(sbr);
		
	}

	public static void main(String[] args) {
		//string1();
		//string2();
		//string3();
		stringBuffer();
		//stringBulider(); 
	
	}

}


