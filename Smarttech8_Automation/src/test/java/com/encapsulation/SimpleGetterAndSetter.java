   package com.encapsulation;

   public class SimpleGetterAndSetter {

	    private int number ;
          
	    public int getNumber(){
        return this.number ;
     }

       public void setNumber(int num){
         this.number=num;
     }

       
       
       //I have to run the code in the another class
       
       public static void main(String[] args) {
			
        SimpleGetterAndSetter obj = new SimpleGetterAndSetter();
        
           // obj.number=10; // compile error,since number is private
           
            //int num = obj.number; // same as above
        
            obj.setNumber(10); // ok
        
            int num = obj.getNumber(); // fine
        }
   
   }
  
  