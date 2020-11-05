package arrays.java.automation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class PracticeArray {

	 public static void singleArrayTest() {

       int [] number = new int [7];

        number[0] = 40;
        number[1] = 10;
        number[2] = 70;
        number[3] = 20;
        number[4] = 50;
        number[5] = 30;
        number[6] = 60;
       
      System.out.println(Arrays.toString(number));
       System.out.println(number[4]);
     
    
   // sum of Array
		 int sum = (number [0]+ number [1] +number [3]+number [4]);
		System.out.println("The Sum of Array is :" +sum);
       
       for (int i = 0; i < number.length; i++)
       System.out.println(number[i]); }
      
     public static void sortNumber() {
   	  int [] number= {50,10,60,30,20,70,40};
         Arrays.sort(number);
   	  System.out.println("After sorting number:"+ Arrays.toString(number));
       
     for (int i = 0; i < number.length; i++)
          System.out.println(number[i]);
     
      }

      public static void multipleArray() {

       String [] [] names = {{"Jhuma","Rabeya","Sadia","Rayyan"},
       
                             {" Akter"," Nafisa"," Mahek"," Kamal"} };
       
       System.out.println(names[0][3] + names [1][3]);
       System.out.println(names[0][1] + names [1][1]);
       System.out.println(names[0][0] + names [1][0]);
       System.out.println(names[0][2] + names [1][2]);
      
    
      
      }
     public static void main(String[] args) {
   	  singleArrayTest();
   	  sortNumber();
   	  multipleArray();
     
     
     }



















}
