// To search for element in an array

import java.util.Scanner;

public class SearchArray{
	
	 public static void main(String[] args) {
	 	
              Scanner sc = new Scanner(System.in);

                int[] arr = new int[10];

              System.out.println("please enter a number to search : ");

               int x = sc.nextInt(); // .nextInt() method stores the number or element in a variable i.e; int x

                boolean flag = false; // it helps to determine if element is not found


                       for(int i=0; i<arr.length; i++){

                       	        if(x == arr[i]){

                       	        	System.out.println(x + "is found at an index :" + i);
 
                                       flag = true;

                       	        }
                       }

                       
                       if(flag == false){
                       	    System.out.println(x + " is not found");
                       }

	 }
}