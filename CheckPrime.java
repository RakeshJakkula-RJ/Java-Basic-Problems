import java.util.Scanner;

public class CheckPrime{
	public static void main(String[] args) {
	
	      // int num = 2 + (int) (Math.random()*99); // 0-98 => 98+2 = 100 

	        // Prime -----> just factors ----> 1 and itself


             // Scanner sc = new Scanner(System.in);

             // System.out.println("Enter a number : ");


             // int num = sc.nextInt();

		    // int num = Integer.parseInt(args[0]);

		   int num = 7;


	        int count = 0;

	        int i = 1;

	        while(i <= num){

	        	if(num % i == 0){

	        		count ++;
	        	}

	        	i++;

	        }

	        if(count == 2){

	        	 System.out.println(num + " " + "is a Prime Number");
	        }
	        else{

	            System.out.println(num + " " + "is a not a Prime Number");	
	        }

	}
}