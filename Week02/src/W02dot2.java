/*
 * W02 Assignment: Program 2.2
 Write a short Java program that does the following:

 Tells the user what the program does.
 Prompts the user to enter a value for the cost of their meal.
 Gets the user's input and saves it in a variable declared as a double.
 Prompts the user to enter a percentage value for the tip.
 Gets the user's input and saves it in a variable declared as a double.
 Calculates the value of the tip, using the percentage entered by the user.
 Calculates the tax on the meal. The tax rate is 3.2%.
 Calculates the total bill = meal cost + tip + tax.
 Outputs the tip, the tax, and the total value of the bill.
       All values will be formatted to show a dollar sign and 2 digits after the decimal point.
 Outputs a goodbye message.
  CIT 260 - 02
   Author@ Daniel Penha
   * font textbook: 2.15 Numeric Type Conversions
*/

import java.util.Scanner;

public class W02dot2 {
    public static void main(String[] args){
        //My code here!
        //1)Tells the user what the program does.
        System.out.println("here");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter purchase amoutn: ");
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is $" + (int)(tax * 100) / 100);
    }
}
