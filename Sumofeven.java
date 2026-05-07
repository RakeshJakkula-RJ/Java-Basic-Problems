// ⁠ ⁠Write a program to find the sum of all even numbers between 1 and 50

 import java.util.Scanner;

public class Sumofeven{
    public static void main(String[] args){

         Scanner sc = new Scanner(System.in);

          System.out.println("Enter the number : ");

          int n = sc.nextInt();

          int sum = 0;

          for(int i=1; i<=50; i++){
              if(i % 2 == 0){
                 sum = sum + i;
              }
          }
           
            System.out.println("Sum of all even numbers between 1 and " + n + " " + "is:" + sum);
         // System.out.println("Sum of all even numbers between 1 and 50 is :" + sum);
    }
}