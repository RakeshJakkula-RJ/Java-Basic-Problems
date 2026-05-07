// Write a program to check if a given number is a palindrome.

import java.util.Scanner;

public class CheckPalindrome{
     public static void main(String[] args){
         
          Scanner sc = new Scanner(System.in);

           System.out.println("Enter a Number : ");

           int num = sc.nextInt();

            int original = num;

            int reversed = 0;

            while(num > 0){
                int digit = num % 10;

                reversed = (reversed * 10) + digit;

                 num = num / 10;
            }

            if(original == reversed){
                System.out.println(original + "is a palindrome number");
            }
            else{
                 System.out.println(original + "is not a palindrome number");
            }
     }
}