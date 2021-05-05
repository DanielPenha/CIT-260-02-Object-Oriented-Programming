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
        //1) Tells the user what the program does.
        System.out.println("This program converts a temperature in degrees Celsius into a temperature in degrees Fahrenheit.");

        //2) Prompts the user to enter a temperature in degrees Celsius.
        // Type a temperature Celsius
        System.out.println("Enter a degree in Celsius: ");

        //3) Gets the user's input and saves it in a variable declared as a double.
        //Get data from keyboard
        Scanner input = new Scanner(System.in);
        //Variable declared as a double.
        double tempCelsius = input.nextDouble();

        //4) Converts the Celsius temperature to a temperature in degrees Fahrenheit, using the formula tempf = (9/5) tempc+ 32
        //Formula of conversion Fahrenheit to Celsius
        double tempFahrenheit = (9 / 5.0) * tempCelsius + 32;

        //5) Outputs the Celsius temperature and the Fahrenheit temperature, with 2 digits after the decimal point.
        //Show the results
        System.out.println( tempCelsius + " degrees Celsius is equal to " + tempFahrenheit + " degrees Fahrenheit");

        //6) Outputs a goodbye message.
        System.out.println("Goodbye!");
    }
}
