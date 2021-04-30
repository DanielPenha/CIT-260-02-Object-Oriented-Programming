/*
 * W02 Assignment: Program 2.1
 Write a short Java program that does the following:

 Tells the user what the program does.
 Prompts the user to enter a temperature in degrees Celsius.
 Gets the user's input and saves it in a variable declared as a double.
 Converts the Celsius temperature to a temperature in degrees Fahrenheit, using the formula tempf = (9/5) tempc+ 32
 Outputs the Celsius temperature and the Fahrenheit temperature, with 2 digits after the decimal point.
 Outputs a goodbye message.
  CIT 260 - 02
  Author@ Daniel Penha* /
  * font textbook: 2.11 Evaluating Expressions and Operator Precedence
*/

import java.util.Scanner;

public class W02dot1 {
    public static void main(String[] args){
        //Get data from keyboard
        Scanner input = new Scanner(System.in);
        // Type a tempeture Fahrenhit
        System.out.println("Enter a degree in Fahrenhit: ");
        double fahrenheit = input.nextDouble();

        //Formula of corvation Fahrenhit to Celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);

        //Show the results
        System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius");
    }
}
