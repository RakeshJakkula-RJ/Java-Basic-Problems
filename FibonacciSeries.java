// ⁠Write a program to print the Fibonacci series up to a given number of terms.
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 = 0+1=1.... 1+1=2.... 1+2=3...  2+3=5..........

import java.util.Scanner;

public class FibonacciSeries{
    public static void main(String[] args){

         Scanner sc = new Scanner(System.in);

         System.out.println("Enter the number of terms : ");

          int n = sc.nextInt();

          int first = 0;
          int second = 1;

          for(int i=0; i<=n; i++){
             System.out.print(first+" ");

              int next = first + second;

                first = second;
                 
                 second = next;
          }
    }
}