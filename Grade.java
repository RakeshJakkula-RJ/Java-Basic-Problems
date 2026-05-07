// Finding the grade using the else-if ladder 

// Grade >= 85-A+,  >=70-A, >=60-B, >=50-C, >=40-D , <40-Fail

public class Grade{
	public static void main(String[] args) {
		
		  int marks = Integer.parseInt(args[0]);

		  if(marks>=85){
		  	 System.out.println("Grade-A+");
		  }
		  else if(marks>=70){
		  	System.out.println("Grade-A");
		  }
		  else if(marks>=60){
		  	System.out.println("Grade-B");
		  }
		  else if(marks>=50){
		  	System.out.println("Grade-C");
		  }
		  else if(marks>=40){
		  	System.out.println("Grade-D");
		  }
		  else{
		  	System.out.println("Fail");
		  }
	}
}