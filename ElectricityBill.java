// 2.⁠ ⁠Electricity Bill Calculation
// Problem Statement:
// Write a program that calculates the electricity bill based on the number of units consumed. The charges per unit are:

// Up to 100 units: ₹5 per unit
// 101 to 200 units: ₹6 per unit
// 201 to 300 units: ₹7 per unit
// Above 300 units: ₹8 per unit

public class ElectricityBill{
    public static void main(String[] args){

        int units = Integer.parseInt(args[0]);

         int bill = 0;
         
        if (units <= 100) {
            bill = units * 5;
        } else if (units <= 200) {
            bill = (100 * 5) + (units - 100) * 6;
        } else if (units <= 300) {
            bill = (100 * 5) + (100 * 6) + (units - 200) * 7;
        } else {
            bill = (100 * 5) + (100 * 6) + (100 * 7) + (units - 300) * 8;
        }

        System.out.println("Electricity Bill: ₹" + bill);
    }
}