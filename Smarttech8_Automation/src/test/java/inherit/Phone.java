 package inherit;

 public class Phone extends Phone3 {
    
	   
		protected void getName() { 
		   
		System.out.println("The new model name is" + " 'Samsung S4'" );  
		
   }  
			   
		 protected void getColor() { 
		   
		System.out.println("The color is 'Gray'");
		
		
    }
	
	    protected void feature2() {
	
	  System.out.println("This phone works on 'wireless charger'");
		
	}
	

	      protected void feature() {
	  
	   System.out.println("This phone works on 'TouchScreen'");
	    
	 }  
	    
	      protected void feature1() {

	    System.out.println("This phone works on 'wireless earbuds'");

	   }
	    
	    public static void main(String[] args) {
	 
		Phone1 p1 = new Phone1();
         p1.getName();
	     p1.getColor();
	     p1.have();
	   
	    Phone2 p2=new Phone2();
	     p2.getName();
	     p2.getColor();
	     p2.feature();
	     
	    Phone3 p3 = new Phone3();
	     p3.getName();
	     p3.getColor();
	     p3.feature1();
	     
	    Phone p = new Phone();
	     p.getName();
	     p.getColor();
	     p.feature();
	     p.feature1();
	     p.feature2();
	    
	    
	     }

}
    