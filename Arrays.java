import java.util.Scanner;

public class Arrays {
    
    public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

  
        int[] marks = {90,92,85,82,66};
        // String[] names = new String[5];
        // int[] scores  = new int[]{90,95,86,72,45,99};
        

        // for(int i=1; i<=5; i++){
        //         System.out.println("Enter the name of student number "+i+" : ");
        //       names[i-1] = sc.nextLine();
        //      //System.out.println(names[i-1]);
        //      System.out.println(marks[i-1]);
        // }
           
           int max = -99999;
            for(int i=0; i<5; i++){
                  if(max < marks[i]){
                     max = marks[i];
                  }
            }

            int min= 99999;
            for(int i=0; i<5; i++){
                  if(min > marks[i]){
                     min = marks[i];
                  }
            }

            System.out.println("The maximum marks is : "+max);
            System.out.println("The minimum marks is : "+min);

         sc.close();
    }
}
