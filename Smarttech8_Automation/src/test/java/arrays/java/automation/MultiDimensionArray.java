package arrays.java.automation;

    public class MultiDimensionArray {

     public static void multipleArrayTest() {
    	//String x [][]= new String [3][5];
    
    String x [][]= {{"A","B","C","D","E"},{"A1","B1","C1","D1","E1"},{"A2","B2","C2","D2","E2"}};
    		x [0][0]= "A";
    		x [0][1] = "B";
    		x [0][2]= "C";
    		x [0][3]= "D";
    		x [0][4]= "E";
    		
    		x [1][0]= "A1";
    		x [1][1] = "B1";
    		x [1][2]= "C1";
    		x [1][3]= "D1";
    		x [1][4]= "E1";
    		
    		x [2][0]= "A2";
    		x [2][1] = "B2";
    		x [2][2]= "C2";
    		x [2][3]= "D2";
    		x [2][4]= "E2";
    		
    		System.out.println(x.length);
    		System.out.println(x[0].length);
    		
    		System.out.println(x [1][2]);
    		
    		for (int row = 0; row<x.length;row++) {
    			for(int col=0;col<x[0].length;col++) {
    				System.out.println(x[row][col]);  
   }}}
    			
    		
    		
        public static void multipleArray() {

    String [][] names = {{" Enamul","Md"," Shoaib","Masud"}, {" Haque"," Islam"," Rana", " Deya"}, {"Nirmal","Mubashshir","Tamnia"},
    		                             
    		        		             { " Dey"," Ahmed"," Alam" } };
    		 
    		                 
    		       System.out.println(names[0][0] + names[1][0]);
    		       System.out.println(names[0][1] + names[1][1]);
    		       System.out.println(names[0][3] + names[1][2]);
    		       System.out.println(names[2][0] + names[3][0]);
    		       System.out.println(names[2][1] + names[3][1]);
    		       System.out.println(names[2][2] + names[3][2] + names[1][3]);
    		       System.out.println(names[0][1] + names[3][2]);
    		       System.out.println(names[0][1] + names[0][2] + names[1][1]);
    		       System.out.println(names[0][1] + names[0][0] + names[1][0]);
    		      
    		      }

    		        public static void main(String[] args) {
    					
    		        	//multipleArray();
    		        
    		        	multipleArrayTest();
   }
}
