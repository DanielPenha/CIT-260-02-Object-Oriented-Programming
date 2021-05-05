/*  W03 Assignment: Program 3.1
    Write a short Java program that does the following:

    Tells the user what the program does.
    Prompts the user to enter a value for today's day of the week (0 for Sunday, 1, for Monday, etc. ).
    Gets the user's input and saves it. If the value is less than 0 or greater than 6, tell the user the input is invalid, and terminate the program.
    Prompts the user to enter some number of days in the future. This can be any positive value.
    Gets the user's input and saves it. If the value is negative, tell the user the input is invalid and terminate the program.
    Calculates the day of the week for the future day.
    Displays the day of the week for today and the day of the week for the future day.
    Outputs a goodbye message.
    ******************************************************************
    Here are some examples of what your program should look like when it runs (user input is in green):
    -------------------------------------------------------------------
    Given today's day of the week and some number of days in the future
    this program will tell you the day of the week for the future day.
    Enter today's day of the week (0 for Sunday, 1 for Monday, etc): 1
    Enter the number of days in the future: 15

    Today is Monday and the future day is Tuesday.
    Goodbye.
    -------------------------------------------------------------------
    Given today's day of the week and some number of days in the future
    this program will tell you the day of the week for the future day.
    Enter today's day of the week (0 for Sunday, 1 for Monday, etc): 1
    Enter the number of days in the future: -5

    -5 is invalid. You must enter a positive number.
    Goodbye.

    CIT 260 - 02
    Author@ Daniel Penha
 */

import java.util.Scanner;

public class W03dot1 {
    public static void main(String[] args) {
        //1) Tells the user what the program does.
        System.out.println("Given today's day of the week and some number of days in the future \n this program will tell you the day of the week for the future day. " +
                "\n Example: Day of the week (0 for Sunday, 1, for Monday, etc. ).");

        //2) Prompts the user to enter a value for today's day of the week (0 for Sunday, 1, for Monday, etc. ).
        Scanner input = new Scanner(System.in);
        int dayOfTheWeek = input.nextInt();

        //3) Gets the user's input and saves it. If the value is less than 0 or greater than 6, tell the user the input is invalid, and terminate the program.

        //4) Prompts the user to enter some number of days in the future. This can be any positive value.

        //5) Gets the user's input and saves it. If the value is negative, tell the user the input is invalid and terminate the program.

        //6) Calculates the day of the week for the future day.

        //7) Displays the day of the week for today and the day of the week for the future day.

        //8) Outputs a goodbye message.
    }
}
