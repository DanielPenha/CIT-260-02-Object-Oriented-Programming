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
CIT 260 - 02
Author@ Daniel Penha
*/

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
        // Calculation State 9%

        // Calculation Federal 20%


        //9) Calculates the gross pay and the net pay after subtracting the withholding taxes.
        // Calculate Gross

        // Calculate Net Pay

        //10) Outputs a pay statement as shown in the example below.
        System.out.println("Pay Stub for ");
        System.out.println("Hours Worked: ");
        System.out.println("Hourly Wage: ");
        System.out.println("Gross Pay: ");
        System.out.println("State Tax Withheld: ");
        System.out.println("Federal Tax Withheld: ");
        System.out.println("Net Pay: ");

        //11) Outputs a goodbye message.
        System.out.println("Goodbye");
    }
}
