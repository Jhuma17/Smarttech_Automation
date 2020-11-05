  package com.abstraction;

  public interface CompanyIdea {

      void getEmployee();  //
      
      void getSalary();    // COMPANY IDEA (abstract method)

      void getCar();       //
   
      void getMedicare();   //

      
      default void newJava() {   // java 1.8 version(use default modifier)
  
     } 
    	 
     default   void newIdea() {
     
     }
  }
  
