public class ArrayDemo{
	public static void main(String[] args) {
		
		  int[] arr = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};

		  for(int i=0; i<arr.length; i++){
		  	 
		  	   System.out.println(i);
		  }

		  // To find sum of all elements in an array : 

		  int sum = 0;

		  for(int i=0; i<arr.length; i++){

		  	    sum = sum + arr[i];
		  }

		   System.out.println("Sum of an array elements :" + " " + sum);

		        int avg = sum / arr.length; // average formula

		        System.out.println("Average of an array elements : " + avg);


           // To find min & max element in an array :
		        int min = arr[0];

		        int max = arr[0];


		        for(int i=0; i<arr.length; i++){

		        	 if(arr[i] < min){

		        	 	 min = arr[i];

		        	 }

		        	 if(arr[i] > max)
		        	 	  max = arr[i];
		        }

		        System.out.println("Min of an array : " + min + "    " + "Max of an array : " + max);

		
	}
}