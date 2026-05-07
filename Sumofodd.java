// Write a program to find the sum of all odd numbers between 1 and 50

import java.util.Scanner;

public class Sumofodd{
    public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

            System.out.println("Enter the numbers : ");

            int n = sc.nextInt();

                int sum = 0;

            for(int i=1; i<=n; i=i+2){
                 sum = sum + i;
            }

            System.out.println("Sum of all odd numbers between 1 and " + n + " " + "is:" + sum);
    }
}