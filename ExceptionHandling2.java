import java.util.Scanner;

class ExceptionHandling2{

     public static void main(String[] args){

     	 Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
               int a = sc.nextInt();

        System.out.print("Enter second number: ");
              int b = sc.nextInt();

     	  try{
     	  	  int result = a/b;

     	  	 System.out.println(result);
     	  	 
     	  	 int arr[] = {1,2,3,4,5};
     	  	 System.out.println(arr[9]);
     	  	 
     	  }
     	  catch(ArithmeticException e){
     	  	 throw new ArithmeticException("Custom Error");
     	  }
     	  catch(ArrayIndexOutOfBoundsException e){
     	      throw new ArrayIndexOutOfBoundsException("Custom Error");
     	  }
     	  finally{
     	      System.out.println("Always Runs...!!");
     	  }

     	  System.out.println("Program ended");
}
}