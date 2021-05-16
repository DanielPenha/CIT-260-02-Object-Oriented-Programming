/*W04 Assignment: Program 4.2
Write a short Java program that does the following:

Tells the user what the program does.
Prompts the user to enter their first and last name.
Gets the user's input and saves it as a String.
Prompts the user to enter the number of hours they worked this week.
Gets the user's input and saves it.
Prompts the user to enter their hourly wage.
Get's the user's input and saves it.
Calculates the state withholding tax (9%) and the federal withholding tax (20%).
Calculates the gross pay and the net pay after subtracting the withholding taxes.
Outputs a pay statement as shown in the example below.
Outputs a goodbye message.
************
Here is an example of what your program should look like when it runs (user input is in green):
------------
   Given your name, hours worked, and hourly wage, this program calculates your
   gross pay, state withholding tax, federal withholding tax, and your net pay.
   It then displays your pay stub.
   Enter your first and last name: John Brown
   Enter the hours you worked this week: 10.0
   Enter your hourly wage: 9.75

   Pay Stub for John Brown
   Hours Worked: 10
   Hourly Wage: $9.75
   Gross Pay: $97.50
   State Tax Withheld: $8.78
   Federal Tax Withheld: $19.50
   Net Pay: $69.23

   Goodbye.
---------------
 Extra information by author:
  //How Do You Calculate Gross Pay?
        //Hourly gross pay is calculated by multiplying the number of hours worked in the pay period times the hourly pay rate. Hours worked may include waiting time, on-call time, rest and meal breaks, travel time, overtime, and training sessions. Gross pay for salaried employees is calculated by dividing the total annual pay for that employee by the number of pay periods in a year.  https://www.thebalancesmb.com/what-is-gross-pay-and-how-is-it-calculated-398696

CIT 260 - 02
Author@ Daniel Penha
*/

import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class W04dot2 {
    public static void main(String[] args) {
        //1) Tells the user what the program does.
        System.out.println("Given your name, hours worked, and hourly wage, this program calculates your \n" +
                "   gross pay, state withholding tax, federal withholding tax, and your net pay.\n" +
                "   It then displays your pay stub.");
        //2) Prompts the user to enter their first and last name.
        System.out.println("Enter your first and last name: ");

        //3) Gets the user's input and saves it as a String.
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();

        //4) Prompts the user to enter the number of hours they worked this week.
        System.out.println("Enter the hours you worked this week: ");

        //5) Gets the user's input and saves it.
        double hourWork = input.nextDouble();

        //6) Prompts the user to enter their hourly wage.
        System.out.println("Enter your hourly wage: ");

        //7) Get's the user's input and saves it.
        double hourWage = input.nextDouble();

        //8) Calculates the state withholding tax (9%) and the federal withholding tax (20%).
        // Variables
        double stateTax, federalTax, grossPay , netPay;
        // Calculation State 9%
        stateTax =  (hourWage * hourWage) * 0.09;

        // Calculation Federal 20%
        federalTax = (hourWage * hourWage) * 0.20;

        //9) Calculates the gross pay and the net pay after subtracting the withholding taxes.
        // Calculate Gross
        // multiplying the number of hours worked in the pay period times the hourly pay rate
        grossPay = hourWork * hourWage;

        // Calculate Net Pay
        netPay = (hourWage * hourWage) - stateTax - federalTax;

        //10) Outputs a pay statement.
        System.out.println("Pay Stub for " + userName);
        System.out.println("Hours Worked: " + hourWork);
        Currency correntLocate = Currency.getInstance(Locale.getDefault());
        System.out.println("Hourly Wage: "+ correntLocate.getSymbol()  + String.format("%.2f", hourWage) );
        System.out.println("Gross Pay: "+ correntLocate.getSymbol()  + String.format("%.2f", grossPay) );
        System.out.println("State Tax Withheld: " +correntLocate.getSymbol()  + String.format("%.2f", stateTax) );
        System.out.println("Federal Tax Withheld: "+ correntLocate.getSymbol()  + String.format("%.2f", federalTax) );
        System.out.println("Net Pay: " + correntLocate.getSymbol()  + String.format("%.2f",netPay) );

        //11) Outputs a goodbye message.
        System.out.println("Goodbye");
    }
}
